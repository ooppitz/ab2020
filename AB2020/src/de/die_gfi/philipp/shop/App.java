package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.data.*;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Shop aShop = TestData.initializeTestShop();

        System.out.println(aShop);
        System.out.println(aShop.inventoryToString());



    }
}
