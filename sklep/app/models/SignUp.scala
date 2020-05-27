package models

import play.api.libs.json.Json

case class SignUp(email: String,password: String)

object SignUp {
  implicit val signUpJsonFormat = Json.format[SignUp]
}

