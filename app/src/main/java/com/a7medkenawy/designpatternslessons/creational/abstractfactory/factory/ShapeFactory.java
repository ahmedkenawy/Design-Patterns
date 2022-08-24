package com.a7medkenawy.designpatternslessons.creational.abstractfactory.factory;

import com.a7medkenawy.designpatternslessons.creational.abstractfactory.shape.Rectangle;
import com.a7medkenawy.designpatternslessons.creational.abstractfactory.shape.RoundedRectangle;
import com.a7medkenawy.designpatternslessons.creational.abstractfactory.shape.RoundedSquare;
import com.a7medkenawy.designpatternslessons.creational.abstractfactory.shape.Shape;
import com.a7medkenawy.designpatternslessons.creational.abstractfactory.shape.Square;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if (shapeType.equalsIgnoreCase("Square"))
            return new Square();
        else
            return null;
    }
}
