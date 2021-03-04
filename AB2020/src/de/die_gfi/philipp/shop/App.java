package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.data.*;

public class App {
    
    public static void main(String[] args) {
        Shop aShop = TestData.initializeTestShop();

        System.out.println(aShop);
        System.out.println(aShop.inventoryToString());



    }
}
