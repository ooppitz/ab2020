package de.die_gfi.philipp.shop;

public class App {
    
    public static void main(String[] args) {
        Shop aShop = new Shop("Hansi's Gemischtwarenladen",
                "Hansi Mueller",
                "Dorfstrasse 96, 28392 Dorf im Au");

        System.out.println("Customer amount: " + aShop.getCustomerAmount());



    }
}
