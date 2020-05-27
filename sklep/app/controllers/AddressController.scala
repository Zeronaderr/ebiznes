package controllers

import javax.inject.Inject
import models.{Address, AddressRepository}
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.Forms.mapping
import play.api.libs.json.{JsError, JsSuccess, JsValue, Json, OWrites}
import play.api.mvc.{AbstractController, ControllerComponents, MessagesAbstractController, MessagesControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent

import scala.concurrent.{ExecutionContext, Future}

class AddressController @Inject()(addresses: AddressRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def deleteAddress(id: Int) = Action {implicit request =>
    addresses.delete(id)
    Redirect("/api/addresses")
  }

  def updateAddress(id:Int) = Action.async { implicit request =>
    var AddressForUpdate = addresses.getById(id)
    AddressForUpdate.map(c => {
      val adrForm = updateAddressForm.fill(UpdateAddressForm(c.id,c.address))
      Ok(views.html.address.addressupdate(adrForm))
    })
  }
  def updateAddressHandle = Action.async { implicit request =>
    updateAddressForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.address.addressupdate(errorForm))
        )
      },
      address => {
        addresses.update(address.id, Address(address.id,address.address)).map {_ =>
          Redirect(routes.AddressController.updateAddress(address.id)).flashing("success" -> "Address updated")
        }
      }
    )
  }

  def addAddress() = Action { implicit request =>
    Ok(views.html.address.addressadd(createAddressForm))
  }

  def addAddressHandle() = Action.async { implicit request =>
    createAddressForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          Redirect(routes.AddressController.addAddress()).flashing("success" -> "address failed")
        )
      },
      ads => {
        addresses.create(ads.address).map { _ =>
          Redirect(routes.AddressController.addAddress()).flashing("success" -> "address added")
        }
      }
    )
  }

  val updateAddressForm: Form[UpdateAddressForm] = Form {
    mapping(
      "id" -> number,
      "address" -> nonEmptyText,
    )(UpdateAddressForm.apply)(UpdateAddressForm.unapply)
  }

  val createAddressForm: Form[CreateAddressForm] = Form {
    mapping(
      "address" -> nonEmptyText,
    )(CreateAddressForm.apply)(CreateAddressForm.unapply)
  }

  //  REST API
  def getAddressesApi = Action.async {implicit request =>
    val address = addresses.list()
    address.map(p =>
      Ok(Json.toJson(p))
    )
  }
  def getAddressApi(id: Int) = Action.async {implicit request =>
    val address = addresses.getByIdAsync(id)
    address.map(x => x match {
      case Some(p) => Ok(Json.toJson(p))
    })
  }
  def addAddressApi = Action { implicit request =>
    val req = request.body.asJson.get
    var address:Address = req.as[Address]
    addresses.create(address.address)
    Ok(request.body.asJson.get)
  }


}
case class UpdateAddressForm(id: Int, address: String)
case class CreateAddressForm(address: String)
