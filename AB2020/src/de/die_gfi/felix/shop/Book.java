package de.die_gfi.felix.shop;

public class Book extends Product{

	String kalorien;
	String mussGekuehltWerden;
	
	
	public Book(String name, double preis, String nummer, String author, String thema) {
		super(name, preis, nummer);
		this.kalorien = author;
		this.mussGekuehltWerden = thema;
	}
	
	public String toString() {
		String result = new String("Name: " + name + ", Preis: " + preis + ", Nummer: " + nummer + ", Author: " + kalorien + ", Thema: " + mussGekuehltWerden);
		return result;
	}
	
}
