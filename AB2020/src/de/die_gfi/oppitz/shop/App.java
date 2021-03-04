package de.die_gfi.oppitz.shop;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		
			
		listAvailableProducts();
		
		ArrayList<Product> catalog = Shop.getProducts();
		Purchase p = makePurchase(c, catalog);
		
		System.out.println();
		String bill = p.generateBill();
		System.out.println(bill);
		
		
	}

	private static Customer registerCustomers() {
		Customer c = new Customer("Maria Grazia Parisi", "mpg@gmail.com", "Viale Lombardia 34", "87474", "Milano",
				"Italien");
		return c;
	}

	private static void listAvailableProducts() {
		System.out.println("Available Products:");
		System.out.println("-------------------");
		System.out.println(Shop.listAvailableProducts());
	}

	private static Purchase makePurchase(Customer c, ArrayList<Product> catalog) {
		Purchase p = new Purchase(c);
		p.add(catalog.get(0), 3);
		p.add(catalog.get(1), 1);
		p.add(catalog.get(3), 4);
		return p;
	}
}
