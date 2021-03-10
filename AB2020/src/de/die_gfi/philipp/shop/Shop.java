package de.die_gfi.philipp.shop;

import java.io.File;
import java.util.ArrayList;

public class Shop {

    protected String shopName;
    protected String ownerName;
    protected String shopAddress;
    protected String shopEmailAddress;
    protected final String vatNumber;
    protected ProductCollection products;
    protected final ArrayList<Customer> customers;
    protected final ArrayList<Purchase> sales;

    public Shop(String shopName, String ownerName, String shopAddress, String shopEmailAddress,String vatNumber) {
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.shopAddress = shopAddress;
        this.shopEmailAddress = shopEmailAddress;
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

    /**
     *
     * @param emailAddress email address of the {@link Customer} to be looked for
     * @return {@link Customer} object with the specified email address, null if not found or there is no customers
     */
    public Customer getCustomer(String emailAddress) {
        for (Customer customer : customers) {
            if (customer.getEmailAddress().equals(emailAddress)) {
                return customer;
            }
        }

        return null;
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
     * @param streetHouseNumber The street name and house number of the customer
     * @param postcode Post code of the city of the customer
     * @param city City or town name of the customer
     * @param emailAddress The e-mail address of the customer
     */
    public void addCustomer(String name, String streetHouseNumber, String postcode, String city, String country,String emailAddress) {
        Customer c = new Customer(name, streetHouseNumber, postcode, city, emailAddress, country,this);
        customers.add(c);
    }

    public void readCustomersFromFile() {
        File file = new File("AB2020/src/de/die_gfi/philipp/shop/data/customers.inv");
    }

    public void addToSales(Purchase p) {
        sales.add(p);
    }

    public int getSalesNumber() {
        return sales.size();
    }

    public String getVatNumber() {
        return vatNumber;
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
