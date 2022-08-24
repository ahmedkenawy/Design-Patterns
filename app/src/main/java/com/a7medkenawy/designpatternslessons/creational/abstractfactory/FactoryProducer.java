package com.a7medkenawy.designpatternslessons.creational.abstractfactory;

import com.a7medkenawy.designpatternslessons.creational.abstractfactory.factory.AbstractFactory;
import com.a7medkenawy.designpatternslessons.creational.abstractfactory.factory.RoundedShapeFactory;
import com.a7medkenawy.designpatternslessons.creational.abstractfactory.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded)
            return new RoundedShapeFactory();
        else
            return new ShapeFactory();
    }
}
