package de.die_gfi.robin.shop;

public class Buch extends Product {

	String titel;
	String author;

	public Buch(double p, String t, String a) {
		super(p);
		this.titel = t;
		this.author = a;

	}

}
