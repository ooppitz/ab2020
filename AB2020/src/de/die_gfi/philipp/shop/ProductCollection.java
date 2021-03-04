package de.die_gfi.philipp.shop;


import de.die_gfi.philipp.shop.products.Beverage;
import de.die_gfi.philipp.shop.products.Food;
import de.die_gfi.philipp.shop.products.Product;

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
        productCollection.addProduct(new Beverage(6839473,"Die Limo", "Granini", 1.39, "2021-05-09", 1000));
        productCollection.addProduct(new Food(6839357, "Salamipralinen", "Rewe Beste Welt",2.99, "2020-03-27", 280));
        productCollection.addProduct(new Food(6847354, "Butterkeks", "Leibniz", 1.89, "2021-01-05", 400));
        productCollection.addProduct(new Beverage(6867848, "Apfelsaft", "K Classic", 0.64, "2020-12-13", 1000));
        productCollection.addProduct(new Product(6802645, "Bleistift", "Staedtler", 3.00, 8));
        return productCollection;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Product prod : products) {
            builder.append(prod).append("\n");
        }
        return builder.toString();
    }
}
