package controllers

import javax.inject.Inject
import models.{OrderRepository, Payment, PaymentRepository}
import play.api.libs.json.Json
import play.api.mvc
import play.api.mvc.{Action, AnyContent, MessagesAbstractController, MessagesControllerComponents}

import scala.concurrent.ExecutionContext

class PaymentController @Inject()(PaymentRepo: PaymentRepository, cc: MessagesControllerComponents,orderRepository: OrderRepository)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def deletePayment(id: Int): mvc.Action[mvc.AnyContent] = Action { implicit request =>
    PaymentRepo.delete(id)
    Redirect("/api/payments")
  }

  //  REST API
  def getPaymentsApi: Action[AnyContent] = Action.async { implicit request =>
    val Payment = PaymentRepo.list()
    Payment.map(p =>
      Ok(Json.toJson(p))
    )
  }
  def getPaymentApi(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val Payment = PaymentRepo.getByIdAsync(id)
    Payment.map {
      case Some(p) => Ok(Json.toJson(p))
    }
  }
  def addPaymentApi(): Action[AnyContent] = Action { implicit request =>
    val req = request.body.asJson.get
    var Payment:Payment = req.as[Payment]
    PaymentRepo.create(Payment.orderId)
    orderRepository.payForOrder(Payment.orderId)
    Ok(request.body.asJson.get)
  }


}
