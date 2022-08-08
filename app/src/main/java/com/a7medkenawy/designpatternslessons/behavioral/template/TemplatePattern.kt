package com.a7medkenawy.designpatternslessons.behavioral.template

abstract class MakePizzaAlgorithm {
    private fun bakePizza() {
        println("Backing Pizza....")
    }

    abstract fun definePizzaShape()

    private fun putAddons() {
        println("putting Pizza addons.....")
    }

    private fun heatPizza() {
        println("Heating Pizza....")
    }

    fun makePizza() {
        definePizzaShape()
        bakePizza()
        putAddons()
        heatPizza()
    }
}

class SquarePizza() : MakePizzaAlgorithm() {
    override fun definePizzaShape() {
        println("Square Pizza....")
    }
}

class RoundedPizza() : MakePizzaAlgorithm() {
    override fun definePizzaShape() {
        println("Rounded Pizza....")
    }
}

fun main() {
    val squarePizza = SquarePizza()
    squarePizza.makePizza()

    println("-----------------------------------------")

    val roundedPizza = RoundedPizza()
    roundedPizza.makePizza()
}

