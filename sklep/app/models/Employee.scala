package models

import play.api.libs.json.Json

case class Employee(id: Int,firstName: String,lastName: String,addressId: Int)

object Employee {
  implicit val employeeFormat = Json.format[Employee]
}

