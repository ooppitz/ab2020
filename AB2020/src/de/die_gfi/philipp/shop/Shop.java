package de.die_gfi.philipp.shop;

import java.util.ArrayList;

public class Shop {

    protected String shopName;
    protected String ownerName;
    protected String shopAddress;
    protected ProductCollection products;
    protected ArrayList<Customer> customers;
    protected ArrayList<Purchase> sales;

    public Shop(String shopName, String ownerName, String shopAddress) {
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.shopAddress = shopAddress;
        this.products = ProductCollection.createProductCollection();
        this.customers = new ArrayList<>();
        this.sales = new ArrayList<>();
    }

    public String getShopName() {
        return shopName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public ProductCollection getProducts() {
        return products;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public int getCustomerAmount() {
        return customers.size();
    }

    @Override
    public String toString() {
        return "Shop name: " + shopName + "\n"+
                "Shop owner: " + ownerName + "\n" +
                "Shop address: " + shopAddress + "\n" +
                "Amount of customers: " + getCustomerAmount();
    }

    public String inventoryToStrin() {
        return "Inventory:\n" + products;
    }
}
