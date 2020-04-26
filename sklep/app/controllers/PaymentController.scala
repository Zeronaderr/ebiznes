package controllers

import javax.inject.Inject
import models.{ProductRepository, Payment, PaymentRepository,Customer,CustomerRepository}
import play.api.mvc.{AbstractController, ControllerComponents, MessagesAbstractController, MessagesControllerComponents}
import play.mvc.Action
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.Forms.mapping
import play.api.libs.json.{JsError, JsSuccess, JsValue, Json, OWrites}
import play.api.mvc.{AbstractController, ControllerComponents, MessagesAbstractController, MessagesControllerComponents}
import play.mvc.BodyParser.AnyContent

import scala.concurrent.{ExecutionContext, Future}

class PaymentController @Inject()(PaymentRepo: PaymentRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def deletePayment(id: Int) = Action {implicit request =>
    PaymentRepo.delete(id)
    Redirect("/api/payments")
  }

  //  REST API
  def getPaymentsApi = Action.async {implicit request =>
    val Payment = PaymentRepo.list()
    Payment.map(p =>
      Ok(Json.toJson(p))
    )
  }
  def getPaymentApi(id: Int) = Action.async {implicit request =>
    val Payment = PaymentRepo.getByIdAsync(id)
    Payment.map(x => x match {
      case Some(p) => Ok(Json.toJson(p))
    })
  }
  def addPaymentApi = Action { implicit request =>
    val req = request.body.asJson.get
    var Payment:Payment = req.as[Payment]
    PaymentRepo.create(Payment.orderId)
    Ok(request.body.asJson.get)
  }


}
