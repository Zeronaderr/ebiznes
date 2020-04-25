package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent

class ShipperController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getShipper(id: Long) = Action {
    var Shipper = null // get Shipper from db
    Ok(views.html.index("Shipper for id = " + id))
  }

  def getShippers() = Action {
    var Shippersrepo = null // get all Shippers
    Ok(views.html.index("All Shippers list"))
  }

  def updateShipper(id: Long) = Action {
    var ShipperForUpdate = null // get by id
    // update values
    // save
    Ok(views.html.index("Shipper of id = " + id + " updated"))
  }

  def deleteShipper(id: Long) = Action {
    var ShipperToDelete = null // get from db
    // delete Shipper
    // Save
    Ok(views.html.index("Shipper of id = " + id + " deleted"))
  }

  def addShipper() = Action {
    var ShipperToAdd = null
    // add to db
    // save
    Ok(views.html.index("Shipper added"))
  }
}

