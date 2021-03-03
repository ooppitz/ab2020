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
}
