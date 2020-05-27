package models


import com.mohiva.play.silhouette.api.{Identity, LoginInfo}
import play.api.libs.json.Json

case class User(id: Long, loginInfo: LoginInfo,email: String) extends Identity {
}
object User {

  implicit val loginInfoJsonFormat = Json.format[LoginInfo]
  implicit val userJsonFormat = Json.format[User]

//
//  def unapply(u: User): Option[(Long, String, String, String)] = {
//    Option(
//      u.id,
//      u.loginInfo.providerID,
//      u.loginInfo.providerKey,
//      u.email
//    )
//  }
}
