package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent

class AddressController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getAddress(id: Long) = Action {
    var Address = null // get Address from db
    Ok(views.html.index("Address for id = " + id))
  }

  def getAddresses() = Action {
    var Addresssrepo = null // get all Addresss
    Ok(views.html.index("All Addresss list"))
  }

  def updateAddress(id: Long) = Action {
    var AddressForUpdate = null // get by id
    // update values
    // save
    Ok(views.html.index("Address of id = " + id + " updated"))
  }

  def deleteAddress(id: Long) = Action {
    var AddressToDelete = null // get from db
    // delete Address
    // Save
    Ok(views.html.index("Address of id = " + id + " deleted"))
  }

  def addAddress() = Action {
    var AddressToAdd = null
    // add to db
    // save
    Ok(views.html.index("Address added"))
  }
}