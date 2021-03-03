package de.die_gfi.philipp.shop;


import java.lang.annotation.Repeatable;
import java.util.ArrayList;

public class ProductCollection {
    private final ArrayList<Product> products;

    public ProductCollection() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product prod) {
        this.products.add(prod);
    }

    public Product[] getProducts() {
        return products.toArray(Product[]::new);
    }

    public static ProductCollection createProductCollection() {
        ProductCollection productCollection = new ProductCollection();
        productCollection.addProduct(new Beverage("Die Limo", 1.39, 6839473, "2021-05-09", 1000));
        productCollection.addProduct(new Food("Salamipralinen", 2.99, 683957, "2020-03-27", 280));
        return productCollection;
    }
}
