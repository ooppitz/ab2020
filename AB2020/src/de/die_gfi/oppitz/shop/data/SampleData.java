package de.die_gfi.oppitz.shop.data;

import java.util.ArrayList;

import de.die_gfi.oppitz.shop.Customer;
import de.die_gfi.oppitz.shop.Shop;

public class SampleData {

	
	
	/** Initialize the shop with sample data */
	public static void initializeShopWithSampleData(Shop s) {
		
		ArrayList<Customer> cc = createSampleCustomers();
		
		s.addCustomers(cc);
		
	}
	
	
	/** Initialize the shop with sample data */
	public static void initializeShopFromDB(Shop s) {
		
		
	}
	
	private static ArrayList<Customer> createSampleCustomers() {
		
		return null;
	}
	
	
}
