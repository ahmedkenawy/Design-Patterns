package com.a7medkenawy.designpatternslessons.behavioral.strategy

interface FlyBehaviour {
    fun fly(): String
}

class FlyWithWings() : FlyBehaviour {
    override fun fly(): String {
        return "I can fly with two wings"
    }
}

class FlyNoFly() : FlyBehaviour {
    override fun fly(): String {
        return "I can't fly"
    }
}


class FlyWithBattery() : FlyBehaviour {
    override fun fly(): String {
        return "I can fly with Battery"
    }
}

abstract class Battat(name: String) {
    private var id: Int = 0
    private var name: String = ""
    protected var myFlyBehaviour: FlyBehaviour

    companion object {
        private var counter: Int = 0
    }

    init {
        id = counter++
        this.name = "$name id $id"
        myFlyBehaviour = FlyWithWings()
    }

    fun swim(): String {
        return "hey! I can swim"
    }

    abstract fun display(): String

    fun perform() {
        println(this.name)
        println(this.swim())
        println(this.display())
        println(this.myFlyBehaviour.fly())
    }
}

class Magroo7a() : Battat("Magroo7a") {

    override fun display(): String {
        return "Iam Magroo7a"
    }
}

class Le3ba() : Battat("Le3ba") {

    init {
        super.myFlyBehaviour = FlyWithBattery()
    }

    override fun display(): String {
        return "Iam Le3ba"
    }
}



fun main() {
    val magroo7a=Magroo7a()
    magroo7a.perform()

    val le3ba=Le3ba()
    le3ba.perform()
}

