package models

import play.api.libs.json.Json

case class UserToken(id:Long, userId:Long, email:String, isSignUp:Boolean) {
}

object UserToken {
  implicit val userTokenFormat = Json.format[UserToken]
}