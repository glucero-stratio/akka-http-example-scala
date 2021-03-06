package com.pvergara.lab.akkahttp.model

//#user-registry-actor
import akka.actor.{ Actor, ActorLogging, Props }


//Clase modelo de la respuesta
case class BasicResponseModel(status: Boolean, description: String)
case class UserModel(id: Int, nameUser: String, name: String, lastName: String, age: Int, mail: String, phono: Int, perfil: String)
case class UsersModel(users: Seq[UserModel])
