package models

import play.api.libs.json.Json

case class Payment(id: Int, orderId: Int)
object Payment
{
  implicit val paymentFormat = Json.format[Payment]
}
