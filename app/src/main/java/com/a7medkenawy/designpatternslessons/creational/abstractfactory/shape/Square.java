package com.a7medkenawy.designpatternslessons.creational.abstractfactory.shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape : Square");
    }
}
