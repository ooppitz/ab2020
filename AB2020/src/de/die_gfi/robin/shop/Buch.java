package de.die_gfi.robin.shop;

public class Buch extends Product {

	String titel;
	String author;

	public Buch(double preis, String _titel, String _author) {
		
		super(preis, _titel + " von " + _author);
		
		this.titel = _titel;
		this.author = _author;

	}

}
