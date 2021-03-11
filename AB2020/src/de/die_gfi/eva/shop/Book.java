package de.die_gfi.eva.shop;

public class Book extends Product {

	int isbn;

	public Book(String name, int artNr, double preis, int isbn) {
		super(name, artNr, preis);
		this.isbn = isbn;
	}

	public String toString() {

		return artName + " / " + artNummer + " / " + preis + "€ / ISBN: " + isbn;
	}

	public static void main(String[] args) {

		Book bo1 = new Book("Bonsai | Grundkursbuch", 8, 8.87, 978344012);
		Book bo2 = new Book("Asiatische Kampfkünste", 9, 31.50, 294037563);
		Book bo3 = new Book("Zen Garten Bildband", 10, 22.00, 38354186);
		System.out.println(bo1.toString());
		System.out.println(bo2.toString());
		System.out.println(bo3.toString());
	}

}
