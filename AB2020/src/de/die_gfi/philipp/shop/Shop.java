package de.die_gfi.philipp.shop;

import java.util.ArrayList;

public class Shop {

    protected String shopName;
    protected String ownerName;
    protected String shopAddress;
    protected ProductCollection products;
    protected ArrayList<Customer> customers;

    public Shop(String shopName, String ownerName, String shopAddress) {
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.shopAddress = shopAddress;
        this.products = ProductCollection.createProductCollection();
        this.customers = new ArrayList<>();
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
}
