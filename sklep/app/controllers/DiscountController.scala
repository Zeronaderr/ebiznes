package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent

class DiscountController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getDiscount(id: Long) = Action {
    var Discount = null // get Discount from db
    Ok(views.html.index("Discount for id = " + id))
  }

  def getDiscounts() = Action {
    var Discountsrepo = null // get all Discounts
    Ok(views.html.index("All Discounts list"))
  }

  def updateDiscount(id: Long) = Action {
    var DiscountForUpdate = null // get by id
    // update values
    // save
    Ok(views.html.index("Discount of id = " + id + " updated"))
  }

  def deleteDiscount(id: Long) = Action {
    var DiscountToDelete = null // get from db
    // delete Discount
    // Save
    Ok(views.html.index("Discount of id = " + id + " deleted"))
  }

  def addDiscount() = Action {
    var DiscountToAdd = null
    // add to db
    // save
    Ok(views.html.index("Discount added"))
  }
}
