package models.requests

import play.api.libs.json.{Json, OFormat}

case class OrderRequest(userId: Long,productId: Long, shipperId: Int,address: String)
object OrderRequest
{
  implicit val orderFormat: OFormat[OrderRequest] = Json.format[OrderRequest]
}