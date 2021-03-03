package de.die_gfi.franziska.shop;

public class PurchaseItem {

	double preis;
	int menge;
	Product p;

	public static void main(String[] args) {

		Book book1 = new Book("ABC lernen mit Tom", 6.9, 12, 188);

		PurchaseItem item = new PurchaseItem(book1, book1.anzahl, book1.preis);

		System.out.println(item.toString());

	}

	public PurchaseItem(Product p, int m, double preis) {

		this.preis = p.preis;
		this.p = p;
		this.menge = p.anzahl;

	}

	public String toString() {

		return menge + " x " + p.name + " je " + preis + "€";

	}

}
