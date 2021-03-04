package de.die_gfi.jonathan.shop;

import java.util.ArrayList;

public class ProductCollection {
// arrayList automatisch hinzugefügt wenn als Purchase Item regestrirt evtl. speicherung aller 
	// purchaseitems anstatt sie individuell zu bennen
	ArrayList<PurchaseItem> collection = new ArrayList<>(1);

	// objekt zur einkaufsliste hinzufügen
	public void addToCollection(Product produkt, int anzahl) {
		PurchaseItem objekt = new PurchaseItem(produkt, anzahl);
		collection.add(objekt);
	}

	// finde ein Objekt
	public PurchaseItem search(String suche) {
		for (PurchaseItem purchaseItem : collection) {
			if (purchaseItem.commodity.name.equalsIgnoreCase(suche)) {
				return purchaseItem;
			}
		}
		System.out.println("Suche nicht erlogreich");
		return null;
	}

	@SuppressWarnings("unlikely-arg-type")
	public void giveIndex() {
		for (int i = 0; i < collection.lastIndexOf(collection); i++) {
			System.out.println("Index:" + i + "Name:" + collection.get(i).commodity.name);
		}
	}

	public String toString() {
		return collection.toString();
	}

}
