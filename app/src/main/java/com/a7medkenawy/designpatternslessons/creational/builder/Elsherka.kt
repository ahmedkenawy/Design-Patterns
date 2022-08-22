package com.a7medkenawy.designpatternslessons.creational.builder

fun main(arg: Array<String>) {
    val robot = Robot.RobotBuilder()
        .setType("Spherical")
        .setWarrantYears(5)
        .setBodyType("Spherical")
        .setHeadType("Spherical")
        .setLegsType("Spherical")
        .setPrice(5000).build()
    println(robot)
}

