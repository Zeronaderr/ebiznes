package controllers

import javax.inject._
import models.{Brand, BrandRepository, Product, ProductCategory, ProductCategoryRepository, ProductRepository}
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.{Failure, Success}

@Singleton
class ProductController @Inject()(productsRepo: ProductRepository, categoryRepo: ProductCategoryRepository,brandRepo: BrandRepository,cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  val productForm: Form[CreateProductForm] = Form {
    mapping(
      "name" -> nonEmptyText,
      "description" -> nonEmptyText,
      "categoryId" -> number,
      "price" -> number,
      "img" -> nonEmptyText,
      "brandId" -> number
    )(CreateProductForm.apply)(CreateProductForm.unapply)
  }

  val updateProductForm: Form[UpdateProductForm] = Form {
    mapping(
      "id" -> longNumber,
      "name" -> nonEmptyText,
      "description" -> nonEmptyText,
      "categoryId" -> number,
      "price" -> number,
      "img" -> nonEmptyText,
      "brandId" -> number
    )(UpdateProductForm.apply)(UpdateProductForm.unapply)
  }

  def addProductHandle = Action.async { implicit request =>
    var categ:Seq[ProductCategory] = Seq[ProductCategory]()
    val categories = categoryRepo.list().onComplete{
      case Success(cat) => categ = cat
      case Failure(_) => print("fail")
    }

    var branq:Seq[Brand] = Seq[Brand]()
    val brands = brandRepo.list().onComplete{
      case Success(bra) => branq = bra
      case Failure(_) => print("fail")
    }

    productForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.product.productadd(errorForm, categ,branq))
        )
      },
      product => {
        productsRepo.create(product.name, product.description, product.categoryId,product.price.toFloat,product.img,product.brandId).map { _ =>
          Redirect(routes.ProductController.addProduct()).flashing("success" -> "product.created")
        }
      }
    )

  }

  def updateProductHandle = Action.async { implicit request =>
    var categ:Seq[ProductCategory] = Seq[ProductCategory]()
    val categories = categoryRepo.list().onComplete{
      case Success(cat) => categ = cat
      case Failure(_) => print("fail")
    }

    var branq:Seq[Brand] = Seq[Brand]()
    val brands = brandRepo.list().onComplete{
      case Success(bra) => branq = bra
      case Failure(_) => print("fail")
    }

    updateProductForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.product.productupdate(errorForm, categ,branq))
        )
      },
      product => {
        productsRepo.update(product.id, Product(product.id, product.name, product.description, product.categoryId,product.price.toFloat,product.img,product.brandId)).map { _ =>
          Redirect(routes.ProductController.updateProduct(product.id)).flashing("success" -> "product updated")
        }
      }
    )

  }

  def getProduct(id: Long) = Action.async { implicit request =>
    var product = productsRepo.getByIdOption(id)
    product.map(x => x match {
      case Some(p) => Ok(views.html.product.product(p))
      case None => Redirect(routes.ProductController.getProducts())
    })
  }

  def getProducts() = Action.async { implicit request =>
    var productsrepo = productsRepo.list()
    productsrepo.map(x => Ok(views.html.product.products(x)))
  }

  def updateProduct(id: Long) = Action.async { implicit request =>
    var productForUpdate = productsRepo.getById(id) // get by id
    var cat:Seq[ProductCategory] = Seq[ProductCategory]()
    var categories = categoryRepo.list().onComplete{
      case Success(c) => cat = c
      case Failure(_) => print("fail")
    }
    var branq:Seq[Brand] = Seq[Brand]()
    val brands = brandRepo.list().onComplete{
      case Success(bra) => branq = bra
      case Failure(_) => print("fail")
    }
    productForUpdate.map(product => {
      val prodForm = updateProductForm.fill(UpdateProductForm(product.id,product.name,product.description,
        product.categoryId,product.price.toInt,product.img,product.brandId))
      Ok(views.html.product.productupdate(prodForm,cat,branq))
    })
  }

  def deleteProduct(id: Long) = Action {
    productsRepo.delete(id) // get from db
    Redirect("/products")
  }

  def addProduct() = Action.async { implicit request =>
    var cat: Seq[ProductCategory] = Seq[ProductCategory]()
    var bra = brandRepo.list();
    var cats = categoryRepo.list();
    cats.onComplete {
      case Success(c) => {
        cat = c
      }
    }
    Await.result(cats.map(c => bra.map(b => Ok(views.html.product.productadd(productForm,c,b)))),Duration.Inf);

  }

  //  REST API
  def getProductsApi = Action.async {implicit request =>
    val product = productsRepo.list()
    product.map(p =>
      Ok(Json.toJson(p))
    )
  }
  def getProductApi(id: Int) = Action.async {implicit request =>
    val product = productsRepo.getByIdOption(id)
    product.map(x => x match {
      case Some(p) => Ok(Json.toJson(p))
    })
  }
  def addProductApi = Action { implicit request =>
    val req = request.body.asJson.get
    var product:Product = req.as[Product]
    productsRepo.create(product.name,product.description,product.categoryId,product.price,product.img,product.brandId)
    Ok(request.body.asJson.get)
  }

}
case class CreateProductForm(name: String, description: String, categoryId: Int,price: Int,img: String,brandId: Int)
case class UpdateProductForm(id: Long, name: String, description: String, categoryId: Int,price: Int,img: String,brandId: Int)
