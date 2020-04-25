package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent

class OrderController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getOrder(id: Long) = Action {
    var Order = null // get Order from db
    Ok(views.html.index("Order for id = " + id))
  }

  def getOrders() = Action {
    var Ordersrepo = null // get all Orders
    Ok(views.html.index("All Orders list"))
  }

  def updateOrder(id: Long) = Action {
    var OrderForUpdate = null // get by id
    // update values
    // save
    Ok(views.html.index("Order of id = " + id + " updated"))
  }

  def deleteOrder(id: Long) = Action {
    var OrderToDelete = null // get from db
    // delete Order
    // Save
    Ok(views.html.index("Order of id = " + id + " deleted"))
  }

  def addOrder() = Action {
    var OrderToAdd = null
    // add to db
    // save
    Ok(views.html.index("Order added"))
  }
}
