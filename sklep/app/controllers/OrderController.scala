package controllers

import javax.inject.Inject
import models.{ProductRepository, Order, OrderRepository,Customer,CustomerRepository}
import play.api.mvc.{AbstractController, ControllerComponents, MessagesAbstractController, MessagesControllerComponents}
import play.mvc.Action
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.Forms.mapping
import play.api.libs.json.{JsError, JsSuccess, JsValue, Json, OWrites}
import play.api.mvc.{AbstractController, ControllerComponents, MessagesAbstractController, MessagesControllerComponents}
import play.mvc.BodyParser.AnyContent

import scala.concurrent.{ExecutionContext, Future}

class OrderController @Inject()(orderRepo: OrderRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def deleteOrder(id: Int) = Action {implicit request =>
    orderRepo.delete(id)
    Redirect("/api/orders")
  }

  //  REST API
  def getOrdersApi = Action.async {implicit request =>
    val Order = orderRepo.list()
    Order.map(p =>
      Ok(Json.toJson(p))
    )
  }
  def getOrderApi(id: Int) = Action.async {implicit request =>
    val Order = orderRepo.getByIdAsync(id)
    Order.map(x => x match {
      case Some(p) => Ok(Json.toJson(p))
    })
  }
  def addOrderApi = Action { implicit request =>
    val req = request.body.asJson.get
    var Order:Order = req.as[Order]
    orderRepo.create(Order.customerId,Order.productId)
    Ok(request.body.asJson.get)
  }


}

