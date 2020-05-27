package controllers

import javax.inject.Inject
import models.{ProductCategoryRepository, Brand, BrandRepository}
import play.api.mvc.{AbstractController, ControllerComponents, MessagesAbstractController, MessagesControllerComponents}
import play.mvc.Action
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.Forms.mapping
import play.api.libs.json.{JsError, JsSuccess, JsValue, Json, OWrites}
import play.api.mvc.{AbstractController, ControllerComponents, MessagesAbstractController, MessagesControllerComponents}
import play.mvc.BodyParser.AnyContent

import scala.concurrent.{ExecutionContext, Future}

class BrandController @Inject()(brands: BrandRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def updateBrand(id:Int) = Action.async { implicit request =>
    var BrandForUpdate = brands.getById(id)
    BrandForUpdate.map(c => {
      val catForm = updateBrandForm.fill(UpdateBrandForm(c.id,c.name))
      Ok(views.html.brand.brandupdate(catForm))
    })
  }
  def updateBrandHandle = Action.async { implicit request =>
    updateBrandForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.brand.brandupdate(errorForm))
        )
      },
      brand => {
        brands.update(brand.id, Brand(brand.id,brand.name)).map {_ =>
          Redirect(routes.BrandController.updateBrand(brand.id)).flashing("success" -> "Brand updated")
        }
      }
    )
  }
  def deleteBrand(id: Int) = Action {implicit request =>
    brands.delete(id)
    Redirect("/api/brands")
  }

  def addBrand() = Action { implicit request =>
    Ok(views.html.brand.brandadd(createBrandForm))
  }

  def addBrandHandle() = Action.async { implicit request =>
    createBrandForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.brand.brandadd(errorForm))
        )
      },
      brand => {
        brands.create(brand.name).map { _ =>
          Redirect(routes.BrandController.addBrand()).flashing("success" -> "product added")
        }
      }
    )
  }

  val updateBrandForm: Form[UpdateBrandForm] = Form {
    mapping(
      "id" -> number,
      "name" -> nonEmptyText,
    )(UpdateBrandForm.apply)(UpdateBrandForm.unapply)
  }

  val createBrandForm: Form[CreateBrandForm] = Form {
    mapping(
      "name" -> nonEmptyText,
    )(CreateBrandForm.apply)(CreateBrandForm.unapply)
  }

  //  REST API
  def getBrandsApi = Action.async {implicit request =>
    val brand = brands.list()
    brand.map(p =>
      Ok(Json.toJson(p))
    )
  }
  def getBrandApi(id: Int) = Action.async {implicit request =>
    val brand = brands.getByIdAsync(id)
    brand.map(x => x match {
      case Some(p) => Ok(Json.toJson(p))
    })
  }
  def addBrandApi = Action { implicit request =>
    val req = request.body.asJson.get
    var brand:Brand = req.as[Brand]
    brands.create(brand.name)
    Ok(request.body.asJson.get)
  }


}
case class UpdateBrandForm(id: Int, name: String)
case class CreateBrandForm(name: String)
