package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.data.*;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Shop aShop = TestData.initializeTestShop();
        aShop.addCustomer("Oliver Oppitz", "Walhallastraße 7, 80639 München", "ooppitz@github.com");

        System.out.println(aShop);
        System.out.println(aShop.inventoryToString());

        System.out.println("Please enter your email address to make a purchase (To test use \"ooppitz@github.com\"): ");
        String str = input.nextLine();
        Customer customer = aShop.getCustomer(str);
        if (customer != null) {
            System.out.println(customer.getName() + ", welcome to " + aShop.getShopName() + "\nYou can now make a purchase.");
            customer.makePurchase(input, aShop);
        } else {
            System.out.println("Seems like you are not a customer of ours yet. Please register first.");
        }


    }
}
