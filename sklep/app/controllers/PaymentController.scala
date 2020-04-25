package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent

class PaymentController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getPayment(id: Long) = Action {
    var Payment = null // get Payment from db
    Ok(views.html.index("Payment for id = " + id))
  }

  def getPayments() = Action {
    var Paymentsrepo = null // get all Payments
    Ok(views.html.index("All Payments list"))
  }

  def updatePayment(id: Long) = Action {
    var PaymentForUpdate = null // get by id
    // update values
    // save
    Ok(views.html.index("Payment of id = " + id + " updated"))
  }

  def deletePayment(id: Long) = Action {
    var PaymentToDelete = null // get from db
    // delete Payment
    // Save
    Ok(views.html.index("Payment of id = " + id + " deleted"))
  }

  def addPayment() = Action {
    var PaymentToAdd = null
    // add to db
    // save
    Ok(views.html.index("Payment added"))
  }
}
