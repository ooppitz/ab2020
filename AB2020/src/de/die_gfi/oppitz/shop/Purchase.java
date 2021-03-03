package de.die_gfi.oppitz.shop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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

	@Override
	public String toString() {

		String result = "";
		
		Set<Entry<Product, Integer>> set = items.entrySet();
		Iterator<Entry<Product, Integer>> it = set.iterator();

		while (it.hasNext()) {
			Entry<Product, Integer> me = it.next();
			Product p = (Product) me.getKey();
			Integer c = (Integer) me.getValue();
			String price = String.format("%4.2f", p.price*c*2);
			result += c + " x " + String.format("%-60s", p.name) + String.format("%10s", price) + "\n";
		}
		return result;
	}

}
