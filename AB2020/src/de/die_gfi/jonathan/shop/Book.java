package de.die_gfi.jonathan.shop;

public class Book extends Product {
	int isbn = (int) (Math.random() * 8);
	String autor;
//String Titel;
	String sprache;

	public Book(String a, String t, String s, double p, int pn) {
		autor = a;
		name = t;
		sprache = s;
		preis = p;
		produktnummer = pn;
	}
}
