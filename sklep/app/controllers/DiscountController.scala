package controllers

import javax.inject.Inject
import models.{Discount, DiscountRepository}
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.format.Formats._
import play.api.data.Forms.mapping
import play.api.libs.json.{JsError, JsSuccess, JsValue, Json, OWrites}
import play.api.mvc.{AbstractController, ControllerComponents, MessagesAbstractController, MessagesControllerComponents}

import scala.concurrent.{ExecutionContext, Future}


class DiscountController @Inject()(discountRepo: DiscountRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def updateDiscount(id:Int) = Action.async { implicit request =>
    var DiscountForUpdate = discountRepo.getById(id)
    DiscountForUpdate.map(c => {
      val catForm = updateDiscountForm.fill(UpdateDiscountForm(c.id,c.value))
      Ok(views.html.discountupdate(catForm))
    })
  }
  def updateDiscountHandle = Action.async { implicit request =>
    updateDiscountForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.discountupdate(errorForm))
        )
      },
      discount => {
        discountRepo.update(discount.id, Discount(discount.id,discount.value)).map {_ =>
          Redirect(routes.DiscountController.updateDiscount(discount.id)).flashing("success" -> "Discount updated")
        }
      }
    )
  }
  def deleteDiscount(id: Int) = Action {implicit request =>
    discountRepo.delete(id)
    Redirect("/api/discounts")
  }

  def addDiscount() = Action { implicit request =>
    Ok(views.html.discountadd(createDiscountForm))
  }

  def addDiscountHandle() = Action.async { implicit request =>
    createDiscountForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.discountadd(errorForm))
        )
      },
      Discount => {
        discountRepo.create(Discount.value).map { _ =>
          Redirect(routes.DiscountController.addDiscount()).flashing("success" -> "Discount added")
        }
      }
    )
  }

  val updateDiscountForm: Form[UpdateDiscountForm] = Form {
    mapping(
      "id" -> number,
      "value" -> of[Float],
    )(UpdateDiscountForm.apply)(UpdateDiscountForm.unapply)
  }

  val createDiscountForm: Form[CreateDiscountForm] = Form {
    mapping(
      "value" -> of[Float],
    )(CreateDiscountForm.apply)(CreateDiscountForm.unapply)
  }

  //  REST API
  def getDiscountsApi = Action.async {implicit request =>
    val Discount = discountRepo.list()
    Discount.map(p =>
      Ok(Json.toJson(p))
    )
  }
  def getDiscountApi(id: Int) = Action.async {implicit request =>
    val Discount = discountRepo.getByIdAsync(id)
    Discount.map(x => x match {
      case Some(p) => Ok(Json.toJson(p))
    })
  }
  def addDiscountApi = Action { implicit request =>
    val req = request.body.asJson.get
    var Discount:Discount = req.as[Discount]
    discountRepo.create(Discount.value)
    Ok(request.body.asJson.get)
  }


}
case class UpdateDiscountForm(id: Int, value: Float)
case class CreateDiscountForm(value: Float)
