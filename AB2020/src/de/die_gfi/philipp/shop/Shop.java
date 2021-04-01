package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.data.PathGetter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Shop {

	protected String shopName;
	protected String ownerName;
	protected String shopAddress;
	protected String shopEmailAddress;
	protected final String vatNumber;
	protected final ProductCollection products;
	protected final ArrayList<Customer> customers;
	protected final ArrayList<Purchase> sales;
	protected int salesNumber;
	protected Admin admin = null;

	public Shop(String shopName, String ownerName, String shopAddress, String shopEmailAddress, String vatNumber) {
		this.shopName = shopName;
		this.ownerName = ownerName;
		this.shopAddress = shopAddress;
		this.shopEmailAddress = shopEmailAddress;
		this.vatNumber = vatNumber;
		this.products = ProductCollection.createProductCollection();
		this.customers = new ArrayList<>();
		this.sales = new ArrayList<>();
		this.salesNumber = Objects.requireNonNull((new File(PathGetter.getDataPath() + "bills/")).listFiles()).length;
	}

	public void addAdmin(Admin admin) {
		if (this.admin == null) {
			this.admin = admin;
		} else {
			System.err.println("Can't have multiple admins.");
		}
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
	 * Gets a {@link Customer} for a specified email address
	 *
	 * @param emailAddress email address of the {@link Customer} to be looked for
	 * @return {@link Customer} object with the specified email address, null if not
	 *         found or there is no customers
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
	 * Adds a customer to this {@link Shop} by using their name, address, and email
	 * address.
	 *
	 * @param name              The name of the customer
	 * @param streetHouseNumber The street name and house number of the customer
	 * @param postcode          Post code of the city of the customer
	 * @param city              City or town name of the customer
	 * @param emailAddress      The e-mail address of the customer
	 */
	public void addCustomer(String name, String streetHouseNumber, String postcode, String city, String country,
			String emailAddress) {
		Customer c = new Customer(name, streetHouseNumber, postcode, city, emailAddress, country, this);
		customers.add(c);
	}

	/**
	 * Reads all Customers from a customers.inv file and adds them to the shop <br>
	 * File needs to be formatted as follows
	 * <p>
	 * customer number|name|street and house number|post code|city or
	 * town|country|email address
	 * </p>
	 *
	 */
	public void readCustomersFromFile() {
		File file = new File(PathGetter.getDataPath() + "customers.inv");
		try (Scanner fileScanner = new Scanner(
				new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));) {

			while (fileScanner.hasNextLine()) {

				String str = fileScanner.nextLine();
				String[] e = str.split("\\|");
				Customer c = new Customer(e[1], e[2], e[3], e[4], e[5], e[6], Integer.parseInt(e[0]));
				customers.add(c);

			}
		} catch (FileNotFoundException e) {
			System.err.println("File products.inv couldn't be accessed, it may be deleted or moved.");
		}
	}

	/**
	 * Adds a {@link Purchase} to the sales of this Shop
	 *
	 * @param p A {@link Purchase} object which is going to be added to this Shop
	 */
	public void addToSales(Purchase p) {
		sales.add(p);
		salesNumber++;
	}

	public int getSalesNumber() {
		return salesNumber;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	@Override
	public String toString() {
		return "Shop name: " + shopName + "\n" + "Shop owner: " + ownerName + "\n" + "Shop address: " + shopAddress
				+ "\n" + "Amount of customers: " + getCustomerAmount();
	}

	/**
	 *
	 * @return a string representing the inventory of this {@link Shop}
	 */
	public String inventoryToString() {
		return "Inventory:\n" + products;
	}
}