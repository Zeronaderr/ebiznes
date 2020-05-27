package controllers

import javax.inject.Inject
import models.{ProductCategoryRepository, Shipper, ShipperRepository}
import play.api.mvc.{AbstractController, ControllerComponents, MessagesAbstractController, MessagesControllerComponents}
import play.mvc.Action
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.Forms.mapping
import play.api.libs.json.{JsError, JsSuccess, JsValue, Json, OWrites}
import play.api.mvc.{AbstractController, ControllerComponents, MessagesAbstractController, MessagesControllerComponents}
import play.mvc.BodyParser.AnyContent


import scala.concurrent.{ExecutionContext, Future}

class ShipperController @Inject()(shippers: ShipperRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def updateShipper(id:Int) = Action.async { implicit request =>
    var shipperForUpdate = shippers.getById(id)
        shipperForUpdate.map(c => {
      val catForm = updateShipperForm.fill(UpdateShipperForm(c.id,c.name))
      Ok(views.html.shipper.shipperUpdate(catForm))
    })
  }
  def updateShipperHandle = Action.async { implicit request =>
    updateShipperForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.shipper.shipperUpdate(errorForm))
        )
      },
      shipper => {
        shippers.update(shipper.id, Shipper(shipper.id,shipper.name)).map {_ =>
          Redirect(routes.ShipperController.updateShipper(shipper.id)).flashing("success" -> "shipper updated")
        }
      }
    )
  }
  def deleteShipper(id: Int) = Action {implicit request =>
    shippers.delete(id)
    Redirect("/api/shippers")
  }

  def addShipper() = Action { implicit request =>
    Ok(views.html.shipper.shipperadd(createShipperForm))
  }

  def addShipperHandle() = Action.async { implicit request =>
    createShipperForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.shipper.shipperadd(errorForm))
        )
      },
      shipper => {
        shippers.create(shipper.name).map { _ =>
          Redirect(routes.ShipperController.addShipper()).flashing("success" -> "Shipper added")
        }
      }
    )
  }

  val updateShipperForm: Form[UpdateShipperForm] = Form {
    mapping(
      "id" -> number,
      "name" -> nonEmptyText,
    )(UpdateShipperForm.apply)(UpdateShipperForm.unapply)
  }

  val createShipperForm: Form[CreateShipperForm] = Form {
    mapping(
      "name" -> nonEmptyText,
    )(CreateShipperForm.apply)(CreateShipperForm.unapply)
  }

  //  REST API
  def getShippersApi = Action.async {implicit request =>
    val shipper = shippers.list()
    shipper.map(p =>
      Ok(Json.toJson(p))
    )
  }
  def getShipperApi(id: Int) = Action.async {implicit request =>
    val shipper = shippers.getByIdAsync(id)
    shipper.map(x => x match {
      case Some(p) => Ok(Json.toJson(p))
    })
  }
  def addShipperApi = Action { implicit request =>
    val req = request.body.asJson.get
    var shipper:Shipper = req.as[Shipper]
    shippers.create(shipper.name)
    Ok(request.body.asJson.get)
  }


}
case class UpdateShipperForm(id: Int, name: String)
case class CreateShipperForm(name: String)
