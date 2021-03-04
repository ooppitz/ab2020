package de.die_gfi.oppitz.shop;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Purchase {

	Customer customer;

	HashMap<Product, Integer> items = new HashMap<Product, Integer>();

	public Purchase(Customer c) {
		this.customer = c;
	}

	/**
	 * Adds count items of the specified product to this purchase
	 * 
	 * @param p     the product to add
	 * @param count the number of products to add
	 */
	public void add(Product p, Integer count) {

		// TODO: check if the product is already in the purchase an increase the number

		items.put(p, count);

	}

	/**
	 * Calculates the total amount of this purchase
	 * 
	 * @return the total amount
	 */
	public double calculateTotal() {

		double total = 0;

		Set<Entry<Product, Integer>> set = items.entrySet();
		Iterator<Entry<Product, Integer>> it = set.iterator();

		while (it.hasNext()) {
			Entry<Product, Integer> me = it.next();
			Product product = (Product) me.getKey();
			Integer count = (Integer) me.getValue();
			total += product.price * count;
		}

		return total;

	}

	public String generateBill() {

		Shop shop = Shop.getShop();
		String bill = shop.name + ", " + shop.street + ", " + shop.postcode + " " + shop.town + "\n";
		bill += "-".repeat(60) + "\n";

		bill += "\n";
		bill += this.customer.name + "\n";
		bill += this.customer.street + "\n";
		bill += this.customer.postcode + " " + this.customer.town + "\n";
		bill += this.customer.town + "\n";
		bill += "\n";
		
		bill += "** Rechnung **\n";
		bill += "\n";
		
		String date = LocalDate.now().toString();
		bill += "Rechnungsdatum: " + date + "                   Steuernummer: " + shop.taxNumber + "\n";
		bill += "\n";

		
		bill += "Artikel" + "\n";
		bill += "\n";

		double total = this.calculateTotal();

		bill += this.toString();
		bill += "-".repeat(75) + "\n";
		bill += "Total amount                                                         " + String.format("%4.2f", total);
		bill += "\n";
		bill += "\n";

		bill += "Please pay this bill within 14 days";
		return bill;

	}

	@Override
	public String toString() {

		String result = "";

		Set<Entry<Product, Integer>> set = items.entrySet();
		Iterator<Entry<Product, Integer>> it = set.iterator();

		while (it.hasNext()) {
			Entry<Product, Integer> me = it.next();
			Product p = (Product) me.getKey();
			Integer c = (Integer) me.getValue();
			String price = String.format("%4.2f", p.price * c);
			result += c + " x " + String.format("%-60s", p.name) + String.format("%10s", price) + "\n";
		}
		return result;
	}

}
