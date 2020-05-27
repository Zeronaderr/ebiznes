package controllers

import akka.util.Helpers.Requiring
import javax.inject.Inject
import javax.inject._
import models.{Product, ProductCategory, ProductCategoryRepository}
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._
import play.api.libs.json
import play.api.data.Forms.mapping
import play.api.libs.json.{JsError, JsSuccess, JsValue, Json, OWrites}
import play.api.mvc.{AbstractController, ControllerComponents, MessagesAbstractController, MessagesControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class ProductCategoryController @Inject()(categories: ProductCategoryRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def getProductCategory(id: Int) = Action.async { implicit request =>
    var productCategory = categories.getByIdAsync(id) // get product from db
    productCategory.map(x => x match {
      case Some(p) => Ok(views.html.productCategory.productCategory(p))
      case None => Redirect(routes.ProductCategoryController.getProductCategories())
    })
  }

  def getProductCategories() = Action.async { implicit request =>
    var productCategoriesRepo = categories.list() // get all products
      productCategoriesRepo.map(pc => Ok(Json.toJson(pc)))
  }
  def updateProductCategory(id:Int) = Action.async { implicit request =>
    var productCatForUpdate = categories.getById(id)
    productCatForUpdate.map(c => {
      val catForm = updateProductCategoryForm.fill(UpdateProductCategoryForm(c.id,c.name))
      Ok(views.html.productCategory.productCategoryUpdate(catForm))
    })
  }
  def updateProductCategoryHandle = Action.async { implicit request =>
    updateProductCategoryForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.productCategory.productCategoryUpdate(errorForm))
        )
      },
      category => {
        categories.update(category.id, ProductCategory(category.id,category.name)).map {_ =>
          Redirect(routes.ProductCategoryController.updateProductCategory(category.id)).flashing("success" -> "product updated")
        }
      }
    )
  }
  def deleteProductCategory(id: Int) = Action {implicit request =>
    categories.delete(id)
    Redirect("/api/productcategories")
  }

  def addProductCategory() = Action { implicit request =>
    Ok(views.html.productCategory.productCategoryAdd(createProductCategoryForm))
  }

  def addProductCategoryHandle() = Action.async { implicit request =>
    createProductCategoryForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.productCategory.productCategoryAdd(errorForm))
        )
      },
      category => {
        categories.create(category.name).map { _ =>
          Redirect(routes.ProductCategoryController.addProductCategory()).flashing("success" -> "product added")
        }
      }
    )
  }

  val updateProductCategoryForm: Form[UpdateProductCategoryForm] = Form {
    mapping(
      "id" -> number,
      "name" -> nonEmptyText,
    )(UpdateProductCategoryForm.apply)(UpdateProductCategoryForm.unapply)
  }

  val createProductCategoryForm: Form[CreateProductCategoryForm] = Form {
    mapping(
      "name" -> nonEmptyText,
    )(CreateProductCategoryForm.apply)(CreateProductCategoryForm.unapply)
  }

//  REST API
  def getProductCategoriesApi = Action.async {implicit request =>
    val productCat = categories.list()
    productCat.map(p =>
      Ok(Json.toJson(p))
    )
  }
  def getProductCategoryApi(id: Int) = Action.async {implicit request =>
    val productCat = categories.getByIdAsync(id)
    productCat.map(x => x match {
      case Some(p) => Ok(Json.toJson(p))
    })
  }
  def addProductCategoryApi = Action { implicit request =>
    val req = request.body.asJson.get
    var product:ProductCategory = req.as[ProductCategory]
    categories.create(product.name)
    Ok(request.body.asJson.get)
  }



//  def getProductsJson() = Action.async { implicit  request =>
//    val produkty = productsRepo.list()
//    produkty.map(products => Ok(Json.toJson(products)))
//  }
//  def addProductJson = Action { implicit request =>
//    var product:Product = request.body.asJson.get.as[Product]
//    productsRepo.create(product.name, product.description, product.category)
//    Ok(request.body.asJson)
//  }

}
case class UpdateProductCategoryForm(id: Int, name: String)
case class CreateProductCategoryForm(name: String)