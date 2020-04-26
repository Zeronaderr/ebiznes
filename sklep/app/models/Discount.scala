package models

import play.api.libs.json.Json

case class Discount(id: Int,value: Float)
object Discount{
  implicit val discountFormat = Json.format[Discount]
}
