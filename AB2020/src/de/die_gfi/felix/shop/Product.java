package de.die_gfi.felix.shop;

public class Product implements CounterTest{
	
	static int counterProduct;
	String name;
	double preis;
	String nummer;
	
	public Product (String name, double preis, String nummer) {
		counterProduct++;
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
	
	public int getCounter() {
		return counterProduct;
	}
	
}
