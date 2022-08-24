package com.a7medkenawy.designpatternslessons.creational.abstractfactory.factory;

import com.a7medkenawy.designpatternslessons.creational.abstractfactory.shape.Shape;

public interface AbstractFactory {
    public Shape getShape(String shapeType);
}
