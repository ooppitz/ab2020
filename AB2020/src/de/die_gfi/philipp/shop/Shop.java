package de.die_gfi.philipp.shop;

import java.util.ArrayList;

public class Shop {

    protected String shopName;
    protected String ownerName;
    protected String shopAddress;
    protected final String vatNumber;
    protected ProductCollection products;
    protected ArrayList<Customer> customers;
    protected ArrayList<Purchase> sales;

    public Shop(String shopName, String ownerName, String shopAddress, String vatNumber) {
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.shopAddress = shopAddress;
        this.vatNumber = vatNumber;
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

    /**
     * Adds a customer to this {@link Shop} by using a {@link Customer} object
     *
     * @param c A {@link Customer} object
     */
    public void addCustomer(Customer c) {
        customers.add(c);
    }

    /**
     * Adds a customer to this {@link Shop} by using their name, address, and email address.
     *
     * @param name The name of the customer
     * @param address The address of the customer
     * @param emailAddress The e-mail address of the customer
     */
    public void addCustomer(String name, String address, String emailAddress) {
        Customer c = new Customer(name, address, emailAddress, this);
        customers.add(c);
    }

    @Override
    public String toString() {
        return "Shop name: " + shopName + "\n"+
                "Shop owner: " + ownerName + "\n" +
                "Shop address: " + shopAddress + "\n" +
                "Amount of customers: " + getCustomerAmount();
    }

    /**
     *
     * @return a string representing the inventory of this {@link Shop}
     */
    public String inventoryToString() {
        return "Inventory:\n" + products;
    }
}
