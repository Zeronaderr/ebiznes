package models

import play.api.libs.json.Json

case class Customer (id: Int,firstName: String,lastName: String,addressId: Int)

object Customer {
  implicit val customerFormat = Json.format[Customer]
}
