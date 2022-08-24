package com.a7medkenawy.designpatternslessons.creational.factory;

import com.a7medkenawy.designpatternslessons.creational.factory.product.Product;

public interface IFactory {

    Product createProduct(String productName);
}
