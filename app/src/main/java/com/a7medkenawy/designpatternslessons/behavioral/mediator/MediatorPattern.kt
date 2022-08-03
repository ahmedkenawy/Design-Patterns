package com.a7medkenawy.designpatternslessons.behavioral.mediator

import com.a7medkenawy.designpatternslessons.behavioral.mediator.ChatRoom.showMessage
import java.util.*

object ChatRoom {
    fun showMessage(user: User, message: String) {
        println("${Date()} [${user.userName}] : $message")
    }

}

//user use chat room
class User(private val name: String) {

    val userName get() = name

    fun sendMessage(message: String) {
        showMessage(this, message)
    }
}


//Mediator manage users
fun main() {
    val user1 = User("ahmed")
    val user2 = User("Saad")
    val user3 = User("Kenawy")

    user1.sendMessage("Hello!")
    user2.sendMessage("Hello ${user1.userName}")
    user3.sendMessage("Hello ${user1.userName} and ${user2.userName}")
}