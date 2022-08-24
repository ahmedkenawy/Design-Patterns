package com.a7medkenawy.designpatternslessons.creational.abstractfactory.factory;

import com.a7medkenawy.designpatternslessons.creational.abstractfactory.shape.RoundedRectangle;
import com.a7medkenawy.designpatternslessons.creational.abstractfactory.shape.RoundedSquare;
import com.a7medkenawy.designpatternslessons.creational.abstractfactory.shape.Shape;

public class RoundedShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("roundedRectangle"))
            return new RoundedRectangle();
        else if (shapeType.equalsIgnoreCase("roundedSquare"))
            return new RoundedSquare();
        else
            return null;
    }
}
