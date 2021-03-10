package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.products.Product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {
    private String name;
    private String streetHouseNumber;
    private String postCode;
    private String city;
    private String country;
    private String emailAddress;
    private int customerNumber;
    private final ArrayList<Purchase> purchases = new ArrayList<>();

    private Customer(String name, String streetHouseNumber, String postCode, String city, String country, String emailAddress) {
        this.name = name;
        this.streetHouseNumber = streetHouseNumber;
        this.postCode = postCode;
        this.city = city;
        this.country = country;
        this.emailAddress = emailAddress;
    }
    public Customer(String name, String streetHouseNumber, String postCode, String city, String country, String emailAddress, Shop shop) {
        this(name, streetHouseNumber, postCode, city, country, emailAddress);
        this.customerNumber = shop.getCustomerAmount() + 1;
    }

    public Customer(String name, String streetHouseNumber, String postCode, String city, String country, String emailAddress, int customerNumber) {
        this(name, streetHouseNumber, postCode, city, country, emailAddress);
        this.customerNumber = customerNumber;
    }

    public void makePurchase(Scanner input, Shop shop) {
        Purchase purchase = new Purchase();

        while (true) {
            System.out.print("Please enter article number or command (commands are \"buy\", \"cancel\" and \"show\"): ");
            String str = input.nextLine();

            if (str.equalsIgnoreCase("buy") || str.equalsIgnoreCase("cancel") || str.equalsIgnoreCase("show")) {
                if (str.equalsIgnoreCase("buy") || str.equalsIgnoreCase("basket")) {
                    if (purchase.items.size() > 0) {

                        System.out.println("Successfully made the purchase.\n\n");
                        purchase.printBill(shop, this);
                        purchases.add(purchase);
                        shop.addToSales(purchase);
                        break;
                    } else {

                        System.out.println("You haven't added any products yet, so you can't buy them.");
                        continue;
                    }
                } else if (str.equalsIgnoreCase("show")) {
                    System.out.println(shop.getProducts());
                    continue;
                } else {
                    System.out.println("Successfully cancelled the purchase.");
                    break;
                }


            }

            addToPurchase(purchase, str, shop, input);
        }
    }

    public void addToPurchase(Purchase purchase, String str, Shop shop, Scanner input) {
        try {
            long articleNumber = Long.parseLong(str);
            Product prod = shop.getProducts().getProduct(articleNumber);

            if (prod != null) {
                System.out.print("How many of the product " + prod.getProductString() + " do you want to add? ");
                int amount = input.nextInt();
                purchase.addToPurchase(prod, amount);
                System.out.println("Successfully added " + amount + " of " + prod.getProductString());
                input.nextLine();

            } else {
                System.out.println("Sorry, the specified article number couldn't be found in our system.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter the article number without spaces or things that are alphabetical");
        } catch (InputMismatchException e) {
            System.out.println("The amount entered was invalid.");
        }
    }


    public String getName() {
        return name;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getStreetHouseNumber() {
        return streetHouseNumber;
    }

    public void setStreetHouseNumber(String streetHouseNumber) {
        this.streetHouseNumber = streetHouseNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailAddress() {
        return emailAddress;
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
                "Address: " + this.streetHouseNumber + "\n" +
                "eMail address: " + this.emailAddress + "\n" +
                "Amount of purchases: " + this.purchases.size();
    }
}
