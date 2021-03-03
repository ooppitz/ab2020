package de.die_gfi.oppitz.shop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
		
		Set set = items.entrySet();
		Iterator it = set.iterator();

		System.out.println("HashMap Key-Value Pairs : ");
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			Product p = (Product) me.getKey();
			Integer c = (Integer) me.getValue();
			result += c + " x " + p.name + "\n";
		}
		return result;
	}

}
