package de.die_gfi.philipp.shop;

public class App {
    
    public static void main(String[] args) {
        ProductCollection products = ProductCollection.createProductCollection();
        Product[] prArr = products.getProducts();

        for (Product pr : prArr) {
            System.out.println(pr.name);
        }

    }
}
