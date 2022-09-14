package com.a7medkenawy.designpatternslessons.structural.adapter;

public class BicycleAdapter implements Vehicle {

    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void start() {
        bicycle.start();
    }

    @Override
    public void stop() {
        bicycle.stop();
    }

    @Override
    public void maxSpeed() {
        bicycle.maxSpeed();
    }
}
