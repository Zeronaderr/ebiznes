package models

import play.api.libs.json._

case class ProductCategory(id: Int, name: String)

object ProductCategory {
  implicit val categoryFormat = Json.format[ProductCategory]
}

