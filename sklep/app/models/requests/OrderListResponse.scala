package models.requests

import play.api.libs.json.{Json, OFormat}

case class OrderListResponse(id: Int,userId: Int,productId: Long, shipperId: Int,orderDate: String,orderState: Int)
object OrderListResponse
{
  implicit val orderFormat: OFormat[OrderListResponse] = Json.format[OrderListResponse]
}
