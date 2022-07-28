package com.a7medkenawy.designpatternslessons.behavioral.interpreter

interface Expression {
    fun interpreter(context: String): Boolean
}

class TerminalExpression(private val data: String) : Expression {
    override fun interpreter(context: String): Boolean {
        return context.contains(data)
    }
}

class ORExpression(private val exp1: Expression, private val exp2: Expression) : Expression {
    override fun interpreter(context: String): Boolean {
        return exp1.interpreter(context) || exp2.interpreter(context)
    }
}

class ANDExpression(private val exp1: Expression, private val exp2: Expression) : Expression {
    override fun interpreter(context: String): Boolean {
        return exp1.interpreter(context) && exp2.interpreter(context)
    }
}

fun main() {
    val o1 = TerminalExpression("Ahmed")
    val o2 = TerminalExpression("Hasan")
    val orExpression = ORExpression(o1, o2)

    val o3 = TerminalExpression("Ahmed")
    val o4 = TerminalExpression("Hasan")
    val o5 = TerminalExpression("Hasan")
    val andExpression1 = ANDExpression(o3, o4)
    val andExpression2 = ANDExpression(o4, o5)

    println(orExpression.interpreter("Hasan"))
    println(andExpression1.interpreter("Hasan"))
    println(andExpression2.interpreter("Hasan"))
}