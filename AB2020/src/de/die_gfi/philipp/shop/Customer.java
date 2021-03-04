package de.die_gfi.philipp.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    protected String name;
    protected String address;
    protected String emailAddress;
    protected final int customerNumber;
    protected ArrayList<PurchaseItem> purchases = new ArrayList<>();

    public Customer(String name, String address, String emailAddress, Shop shop) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.customerNumber = shop.getCustomerAmount() + 1;
    }

    public void makePurchase(Scanner input, Shop shop) {
        Purchase purchase = new Purchase();

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
