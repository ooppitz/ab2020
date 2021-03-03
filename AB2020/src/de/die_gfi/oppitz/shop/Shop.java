package de.die_gfi.oppitz.shop;

public class Shop {

	String name;
	String email;
	String street;
	String postcode;
	String town;
	String country;
	
	String taxNumber;

	private static Shop instance = null;

	private Shop() {
		
		name = "Peter's Gemischtwarenladen";
		email = "info@gemischtwarenladen.de";
		street = "Speicherstadt 34";
		postcode = "40939";
		town = "Hamburg";
		country = "Germany";
		taxNumber = "134/551/998/211";
		
	}
	
	/** Returns the only instance of the shop that can be created */
	public static Shop getShop() {
		
		if (instance == null) {
			instance = new Shop();
		}
		return instance;
	}
	
}
