package com.a7medkenawy.designpatternslessons.behavioral.observer


abstract class Observer {
    abstract fun update()
}

class ConcreteObserver(private val concreteObservable: ConcreteObservable) : Observer() {

    fun changeState(){
        concreteObservable.setState("Ayy")
    }

    override fun update() {
        println(concreteObservable.getState())
    }
}


open class Observable {
    private val observers = ArrayList<Observer>()
    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun detach(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers() {
        observers.forEach { observer ->
            observer.update()
        }
    }
}

class ConcreteObservable : Observable() {
    private var state: String = "Silent"

    fun setState(state: String) {
        this.state = state
        notifyObservers()
    }

    fun getState(): String {
        return state
    }
}

fun main() {
    val ahmed = ConcreteObservable()
    val hassan = ConcreteObserver(ahmed)
    val aly = ConcreteObserver(ahmed)
    val ibrahim = ConcreteObserver(ahmed)
    val gomaa = ConcreteObserver(ahmed)

    ahmed.attach(hassan)
    ahmed.attach(aly)
    ahmed.attach(ibrahim)
    ahmed.attach(gomaa)
    aly.changeState()

}