package de.die_gfi.jonathan.shop;

import java.util.ArrayList;

public class Purchase {
	ArrayList<PurchaseItem> items = new ArrayList<>(1);

	// hinzufügen eies Purchaseitems
	public void addItem(PurchaseItem objekt) {
		items.add(objekt);
	}

	public String toString() {
		return items.toString();
	}

	// zeilenweise Ausgabe der Purchase Items
	public void printPurchase() {
		for (PurchaseItem einkauf : items) {
			System.out.println(einkauf.printProducts());
		}
	}

	// gibt den Preis nebst Produktname aus um eine Rechnung zu erstellen
	public double getItems() {
		double wert = 0;
		for (PurchaseItem einkauf : items) {
			System.out.println(einkauf.getPrice() + "  " + einkauf.item.name);
			wert = wert + einkauf.getPrice();
		}
		return wert;
	}

}
