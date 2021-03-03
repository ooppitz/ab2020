package de.die_gfi.jonathan.shop;

public class Book extends Product {
	int isbn = (int) (Math.random() * 8);
	String author;
//String titel;
	String language;

	// TODO: Namen korrigieren
    // TODO: JavaDoc ergänzen
	public Book(String autor, String titel, String sprache, double preis, int produktnummer) {
		super(titel, preis, produktnummer);
		author = autor;
		language = sprache;
	}
}
