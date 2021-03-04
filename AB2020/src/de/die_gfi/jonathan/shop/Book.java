package de.die_gfi.jonathan.shop;

public class Book extends Product {
	int isbn = (int) (Math.random() * 1000000000);
	String author;
//String titel;
	String language;

	// TODO: Namen korrigieren
    // TODO: JavaDoc ergänzen
	public Book(String autor, String titel, String sprache, double preis) {
		super(titel, preis);
		author = autor;
		language = sprache;
	}
	
	
	public String toString() {
		return "Titel: "+name+" Autor: "+author+" ISBN "+isbn;
	}
}
