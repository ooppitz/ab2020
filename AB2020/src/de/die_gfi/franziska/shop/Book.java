package de.die_gfi.franziska.shop;

public class Book extends Product {

	int isbn;

	public Book(String n, double p, int nr, int isbn) {

		super(n, p, nr);

		this.isbn = isbn;

	}

	public static void main(String[] args) {

		Book book1 = new Book("ABC lernen mit Tom", 6.9, 12, 188);

		System.out.println(book1.toString());

	}

	public String toString() {

		return "Artikelnummer: " + artikelnummer + "\nBuch: " + name + " \nPreis: " + preis + "€" + "\n";

	}

}
