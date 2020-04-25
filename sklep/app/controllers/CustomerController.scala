package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent


class CustomerController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getCustomer(id: Long) = Action {
    var Customer = null // get Customer from db
    Ok(views.html.index("Customer for id = " + id))
  }

  def getCustomers = Action {
    var Customersrepo = null // get all Customers
    Ok(views.html.index("All Customers list"))
  }

  def updateCustomer(id: Long) = Action {
    var CustomerForUpdate = null // get by id
    // update values
    // save
    Ok(views.html.index("Customer of id = " + id + " updated"))
  }

  def deleteCustomer(id: Long) = Action {
    var CustomerToDelete = null // get from db
    // delete Customer
    // Save
    Ok(views.html.index("Customer of id = " + id + " deleted"))
  }

  def addCustomer() = Action {
    var CustomerToAdd = null
    // add to db
    // save
    Ok(views.html.index("Customer added"))
  }
}