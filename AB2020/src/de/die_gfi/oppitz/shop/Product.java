package de.die_gfi.oppitz.shop;

public class Product {

	String name; 
	String description; 
	double price;
	
	public Product(String name, String description, double price) {
		this.name = name; 
		this.description = description;
		this.price = price;
	}
	
	/** Returns a string built from a selection of the attributes */
	@Override
	public String toString() {
		return "Product '" + name + "' Price: " + price;
	}
	
}
