package de.die_gfi.franziska.shop;

import java.util.Scanner;

public class PurchaseItem {

	double preis;
	int menge;
	Product p;

	public static void main(String[] args) {

		Book book1 = new Book("ABC lernen mit Tom", 6.99, 12, 188);

		PurchaseItem item = new PurchaseItem(book1, PurchaseItem.mengenAbfrage(), book1.preis);

		System.out.println(item.toString());

	}

	public PurchaseItem(Product p, int m, double preis) {
		this.preis = p.preis;
		this.p = p;
		this.menge = m;
	}

	public static int mengenAbfrage() {

		Scanner scannerMenge = new Scanner(System.in);

		System.out.println("Bitte Menge eingeben: ");

		int anzahl = scannerMenge.nextInt();

		return anzahl;
		
	}

	public String toString() {

		return menge + " x " + p.name + " " + (preis * menge) + "€";

	}
	
	public static PurchaseItem productToPurchaseItem(Product p) {

		PurchaseItem item = new PurchaseItem(p, PurchaseItem.mengenAbfrage(), p.preis);

		return item;
	}


}
