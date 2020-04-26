package models

import play.api.libs.json._

case class Address(id:Int,address: String)

object Address{
  implicit val addressFormat = Json.format[Address]
}
