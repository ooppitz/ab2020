package de.die_gfi.felix.shop;

public class Product {
	
	String name;
	double preis;
	int nummer;
	
	public Product (String name, double preis, int nummer) {
		this.name = name;
		this.preis = preis;
		this.nummer = nummer;
	}
	
	public void displayInformation() {
		System.out.println(this);
	}
	
	public String toString() {
		String result = new String("Name: " + this.name + ", Preis: " + preis + ", Nummer: " + nummer);
		return result;
	}
	
}
