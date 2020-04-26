package models

import play.api.libs.json.Json


case class Shipper(id: Int,name: String)
object Shipper
{
  implicit val shipperFormat = Json.format[Shipper]
}
