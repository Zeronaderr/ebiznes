package models

import play.api.libs.json.Json

case class Product(id: Long, name: String, description: String, categoryId: Int, price: Float,img: String,brandId: Int)

object Product {
  implicit val productFormat = Json.format[Product]
}