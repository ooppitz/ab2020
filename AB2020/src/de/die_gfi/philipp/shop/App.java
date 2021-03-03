package de.die_gfi.philipp.shop;

public class App {
    
    public static void main(String[] args) {
        ProductCollection products = ProductCollection.createProductCollection();
        Product[] prArr = products.getProducts();

        System.out.println(products);

        System.out.println("Customer amount: " + Customer.getCustomerAmount());

        Purchase testPurchase = new Purchase();
        testPurchase.addToPurchase(prArr[1], 2);
        testPurchase.addToPurchase(prArr[0], 6);

        System.out.println(testPurchase);


    }
}
