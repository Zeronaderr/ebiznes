package controllers

import java.sql.Date
import java.util.Calendar

import javax.inject.Inject
import models.{Order, OrderRepository}
import play.api.libs.json.Json
import play.api.mvc
import play.api.mvc.{MessagesAbstractController, MessagesControllerComponents}

import scala.concurrent.ExecutionContext

class OrderController @Inject()(orderRepo: OrderRepository, cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def deleteOrder(id: Int): mvc.Action[mvc.AnyContent] = Action { implicit request =>
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
    Order.map {
      case Some(p) => Ok(Json.toJson(p))
    }
  }
  def addOrderApi = Action { implicit request =>
    val req = request.body.asJson.get
    var Order:Order = req.as[Order]
    orderRepo.create(Order.customerId,Order.productId,Order.shipperId,Calendar.getInstance.getTime.toString,1)
    Ok(request.body.asJson.get)
  }
}

