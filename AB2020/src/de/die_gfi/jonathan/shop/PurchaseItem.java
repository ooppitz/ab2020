package de.die_gfi.jonathan.shop;

public class PurchaseItem {
	
	Product item;
	int count;
	protected double price;

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
		return item.getMaximumDiscount(count);
	}
	
	public int bought() {
		count=count-1;
		return count;
	}

}
