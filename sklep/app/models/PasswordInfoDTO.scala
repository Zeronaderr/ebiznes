package models

case class PasswordInfoDTO(id: Long,providerId: String,providerKey: String,hasher: String,password: String)
