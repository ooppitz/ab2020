package de.die_gfi.felix.shop;

public class Book extends Product implements CounterTest{

	String kalorien;
	String mussGekuehltWerden;
	static int counterBook;
	
	public Book(String name, double preis, String nummer, String author, String thema) {
		super(name, preis, nummer);
		counterBook++;
		counterProduct--;
		this.kalorien = author;
		this.mussGekuehltWerden = thema;
	}
	
	public String toString() {
		String result = new String("Name: " + name + ", Preis: " + preis + ", Nummer: " + nummer + ", Author: " + kalorien + ", Thema: " + mussGekuehltWerden);
		return result;
	}
	
	public int getCounter() {
		return counterBook;
	}
	
}
