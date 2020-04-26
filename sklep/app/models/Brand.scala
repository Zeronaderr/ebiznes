package models

import play.api.libs.json.Json

case class Brand (id: Int,name:String)

object Brand {
  implicit val brandFormat = Json.format[Brand]
}
