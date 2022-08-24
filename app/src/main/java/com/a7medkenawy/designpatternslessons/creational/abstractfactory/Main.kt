package com.a7medkenawy.designpatternslessons.creational.abstractfactory


fun main() {
    val rounded = FactoryProducer.getFactory(true)
    val shape = rounded.getShape("RoundedRectangle")
    println(shape)

    val notRounded = FactoryProducer.getFactory(false)
    val square = notRounded.getShape("Square")
    println(square)
}