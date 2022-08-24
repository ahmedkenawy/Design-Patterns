package com.a7medkenawy.designpatternslessons.creational.abstractfactory.shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape : Rounded Rectangle");
    }
}
