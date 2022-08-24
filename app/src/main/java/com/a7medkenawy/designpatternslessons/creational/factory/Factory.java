package com.a7medkenawy.designpatternslessons.creational.factory;

import com.a7medkenawy.designpatternslessons.creational.factory.product.Product;
import com.a7medkenawy.designpatternslessons.creational.factory.product.ProductA;
import com.a7medkenawy.designpatternslessons.creational.factory.product.ProductB;
import com.a7medkenawy.designpatternslessons.creational.factory.product.ProductC;
import com.a7medkenawy.designpatternslessons.creational.factory.product.ProductD;

public class Factory implements IFactory {
    @Override
    public  Product createProduct(String productName) {
        if (productName.equalsIgnoreCase("ProductA"))
            return new ProductA();
        else if (productName.equalsIgnoreCase("ProductB"))
            return new ProductB();
        else if (productName.equalsIgnoreCase("ProductC"))
            return new ProductC();
        else if (productName.equalsIgnoreCase("ProductD"))
            return new ProductD();
        else
            return null;
    }
}
