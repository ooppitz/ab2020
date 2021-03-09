package de.die_gfi.jonathan.shop;

public class PurchaseItem {
	
	Product item;
	private int count;
	double price;

	public PurchaseItem(Product produkt, int anzahl) {
		item = produkt;
		count = anzahl;
		price = produkt.price;

	}

	public String toString() {
		return item.toString() + " Vorhande exemplare:" + count;
	}

	// für den kunden vorgesehen Ausgabe
	public String printProducts() {
		return item.toString();
	}

	// Preis ausgabe für die Rechnung
	public double getPrice() {
		return price;
	}

}
