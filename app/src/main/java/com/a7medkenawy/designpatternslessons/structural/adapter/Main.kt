package com.a7medkenawy.designpatternslessons.structural.adapter


fun main() {
    val car: Vehicle = Car()
    val bi = Bicycle()
    val bicycle: Vehicle = BicycleAdapter(bi)
    println("Car ------------------------+----------------")
    car.maxSpeed()
    car.start()
    car.stop()
    println("Bicycle --------------------+----------------")
    bicycle.maxSpeed()
    bicycle.start()
    bicycle.stop()
}

