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
        boolean purchaseMade = false;

        while (true) {
            System.out.println("Please enter article number or command \n" +
                    "Commands are \"buy\", \"cancel\", \"products\", \"delete\" and \"basket\"");
            String str = input.nextLine().toLowerCase();

            switch (str) {
                case "cancel":
                    break;
                case "buy":
                    if (purchase.items.size() > 0) {
                        System.out.println("Successfully made the purchase.\n\n");
                        purchase.printBill(shop, this);
                        purchases.add(purchase);
                        shop.addToSales(purchase);
                        purchaseMade = true;
                    } else {
                        System.out.println("Basket is empty, couldn't make a purchase.");
                    }
                    break;
                case "basket":
                    System.out.print(purchase.getAsBasket());
                    break;
                case "products":
                    System.out.println(shop.getProducts());
                    break;
                case "delete":
                    removeFromPurchase(input, purchase);

                    break;
                default:
                    addToPurchase(purchase, str, shop, input);
                    break;
            }

            if ((str.equals("buy") && purchaseMade) || str.equals("cancel")) {
                break;
            }
        }
    }

    private void removeFromPurchase(Scanner input, Purchase purchase) {
        if (purchase.items.size() > 0) {
            try {
                System.out.println(purchase.toString());
                System.out.print("Please enter the article number of the product you want to remove from the basket: ");
                int productIndex = purchase.getIndexOfProduct(input.nextLong());
                if (productIndex != -1) {
                    PurchaseItem item = purchase.items.get(productIndex);
                    System.out.println("Successfully removed the product " + " " + item.getArticleNumber() +
                            " " + item.getProductString());
                    purchase.items.remove(productIndex);

                } else {
                    System.out.println("Couldn't remove product, not in basket or existing product.");
                }
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Please only enter an article number.");
            }
        } else {
            System.out.println("Basket has no items yes.");
        }
    }

    private void addToPurchase(Purchase purchase, String str, Shop shop, Scanner input) {
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
