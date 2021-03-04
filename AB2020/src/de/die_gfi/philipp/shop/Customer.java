package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.products.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    protected String name;
    protected String address;
    protected String emailAddress;
    protected final int customerNumber;
    protected ArrayList<Purchase> purchases = new ArrayList<>();

    public Customer(String name, String address, String emailAddress, Shop shop) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.customerNumber = shop.getCustomerAmount() + 1;
    }

    public void makePurchase(Scanner input, Shop shop) {
        Purchase purchase = new Purchase();
        while (true) {
            System.out.print("Please enter article number or command (commands are \"buy\", \"cancel\" and \"show\"): ");
            String str = input.nextLine();
            if (str.equalsIgnoreCase("buy") || str.equalsIgnoreCase("cancel") || str.equalsIgnoreCase("show")) {
                if (str.equalsIgnoreCase("buy")) {
                    if (purchase.items.size() > 0) {
                        purchase.printBill(shop);
                        purchases.add(purchase);
                        shop.addToSales(purchase);
                        System.out.println("Successfully made the purchase.");
                        break;
                    } else {
                        System.out.println("You haven't added any products yet, so you can't them.");
                    }
                } else if (str.equalsIgnoreCase("show")) {
                    System.out.println(shop.getProducts());
                    continue;
                } else {
                    System.out.println("Successfully cancelled the purchase.");
                    break;
                }
            }
            try {
                long articleNumber = Long.parseLong(str);
                Product prod = shop.getProducts().getProduct(articleNumber);
                if (prod != null) {
                    System.out.print("How many do you want to add? ");
                    int amount = input.nextInt();
                    purchase.addToPurchase(prod, amount);
                    System.out.println("Successfully added " + amount + " of " + prod.getManufacturer() + " " + prod.getName());
                } else {
                    System.out.println("Sorry, the specified article number couldn't be found in our system.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter the article number without spaces or things that are alphabetical");
            }


        }
    }


    public String getName() {
        return name;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer Number: " + this.customerNumber + "\n" +
                "Name :" + this.name + "\n" +
                "Address: " + this.address + "\n" +
                "eMail address: " + this.emailAddress + "\n" +
                "Amount of purchases: " + this.purchases.size();
    }
}
