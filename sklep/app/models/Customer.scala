package models

import com.mohiva.play.silhouette.api.{Identity, LoginInfo}
import play.api.libs.json.Json

case class Customer (id: Int,firstName: String,lastName: String,addressId: Int)

object Customer {
  implicit val customerFormat = Json.format[Customer]
}
