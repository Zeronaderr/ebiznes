package models

import play.api.libs.json.Json

case class Order(id: Int,customerId: Int,productId: Int, shipperId: Int)
object Order
{
  implicit val orderFormat = Json.format[Order]
}
