package de.die_gfi.philipp.shop;

public class Product {

    String name;
    double price;
    final long articleNumber;
    int packagingUnit;

    public Product(String name, double price, long articleNumber) {
        this.name = name;
        this.price = price;
        this.articleNumber = articleNumber;
        this.packagingUnit = 1;
    }
}
