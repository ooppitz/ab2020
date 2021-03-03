package de.die_gfi.philipp.shop;

import java.util.ArrayList;

public class Customer {
    public String name;
    public String address;
    public String emailAddress;
    public int customerNumber;
    public ArrayList<PurchaseItem> purchases = new ArrayList<>();

    public Customer(String name, String address, String emailAddress, Shop shop) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.customerNumber = shop.getCustomerAmount() + 1;
    }

    public void makePurchase() {

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
