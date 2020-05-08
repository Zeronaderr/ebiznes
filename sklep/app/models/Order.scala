package models

import java.util.Date

import play.api.libs.json.{Json, OFormat}

case class Order(id: Int,customerId: Int,productId: Long, shipperId: Int,orderDate: String,orderState: Int)
object Order
{
  implicit val orderFormat: OFormat[Order] = Json.format[Order]
}
