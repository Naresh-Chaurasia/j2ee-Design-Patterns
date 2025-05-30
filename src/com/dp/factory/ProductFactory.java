package com.dp.factory;

public class ProductFactory {
    public static Product getProduct(String type) {
        if (type.equalsIgnoreCase("book")) {
            return new Book();
        } else if (type.equalsIgnoreCase("pen")) {
            return new Pen();
        } else {
            throw new IllegalArgumentException("Unknown product type");
        }
    }
}
