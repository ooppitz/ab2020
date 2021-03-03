package de.die_gfi.philipp.shop;

import java.util.ArrayList;

public class Customer {
    public String name;
    public String address;
    public String emailAddress;
    public int customerNumber;
    public ArrayList<PurchaseItem> purchases = new ArrayList<>();
    private static int customers = 0;

    public Customer(String name, String address, String emailAddress) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.customerNumber = ++customers;
    }

    public static int getCustomerAmount() {
        return customers;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Customer Number: ").append(this.customerNumber).append("\n");
        builder.append("Name :").append(this.name).append("\n");
        builder.append("Address: ").append(this.address).append("\n");
        builder.append("eMail address: ").append(this.emailAddress).append("\n");
        builder.append("Amount of purchases: ").append(this.purchases.size());
        return builder.toString();
    }
}
