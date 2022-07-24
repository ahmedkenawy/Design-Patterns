package com.a7medkenawy.designpatternslessons.behavioral.command


class Receiver(private val id: Int) {
    private var money = 0
    fun sendMoney(money: Int) {
        this.money += money
        println("Receiver with id $id has ${this.money}")
    }
}

interface Command {
    fun execute()
}

class SendMoney(private val receiver: Receiver) : Command {
    override fun execute() {
        receiver.sendMoney(500)
    }
}

class SendMoneyToAll(private val listOfReceiver: List<Receiver>) : Command {
    override fun execute() {
        listOfReceiver.forEach { receiver ->
            receiver.sendMoney(500)
        }
    }
}

class Invoker() {
    fun executeCommand(command: Command) {
        command.execute()
    }
}

fun main() {
    val invoker = Invoker()
    val receiver1 = Receiver(0)
    val commandSendMoney = SendMoney(receiver1)
    invoker.executeCommand(commandSendMoney)
2
    val receiver2 = Receiver(1)
    val receiver3 = Receiver(2)
    val commandSendMoneyToAll = SendMoneyToAll(listOf(receiver1,receiver2,receiver3))
    invoker.executeCommand(commandSendMoneyToAll)
}