package de.die_gfi.jonathan.shop;

public class Book extends Product implements Discount {
	
	int isbn;
	String author;
	String language;

	// TODO: Namen korrigieren
	// TODO: JavaDoc ergänzen
	
	public Book(String autor, String titel, String sprache, double preis) {
		
		super(titel, preis);
		author = autor;
		language = sprache;
		isbn = (int) (Math.random() * 1000000000);
				
	}

	public String toString() {
		return "Titel: " + name + " Autor: " + author + " ISBN " + isbn;
	}

	@Override
	public boolean isDiscountPossible() {
		return false;
	}

	@Override
	public double getMaximumDiscount() {
		return 0;
	}

	
}
