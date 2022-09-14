package com.a7medkenawy.designpatternslessons.structural.adapter;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car : Start");
    }

    @Override
    public void stop() {
        System.out.println("Car : Stop");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Car : 400km/hr");
    }
}
