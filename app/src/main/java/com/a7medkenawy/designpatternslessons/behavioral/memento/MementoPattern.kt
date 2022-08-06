package com.a7medkenawy.designpatternslessons.behavioral.memento


class Life {
    lateinit var state: String

    @JvmName("setState1")
    fun setState(value: String) {
        state = value
    }

    fun saveState(): Memento {
        println("State Saved : $state")
        return Memento(state)
    }

    fun restoreMyState(memento: Memento) {
        this.state = memento.savedTimes
        println("you restore your state to : $state")
    }

    class Memento(val savedTimes: String)
}

fun main() {
    val myLifeIsChangingEveryDay = ArrayList<Life.Memento>()

    val shortLife = Life()
    shortLife.setState("iam asking god every to help me")
    myLifeIsChangingEveryDay.add(shortLife.saveState())

    shortLife.setState("iam searching about job")
    myLifeIsChangingEveryDay.add(shortLife.saveState())

    shortLife.setState("i have Get a Job Today")
    myLifeIsChangingEveryDay.add(shortLife.saveState())

    shortLife.setState("iam still asking god every to help me")
    myLifeIsChangingEveryDay.add(shortLife.saveState())

    shortLife.restoreMyState(myLifeIsChangingEveryDay[0])


}
