package de.die_gfi.jonathan.shop;

import java.util.ArrayList;

public class ProductCollection {
// arrayList automatisch hinzugefügt wenn als Purchase Item regestrirt evtl. speicherung aller 
	// purchaseitems anstatt sie individuell zu bennen
	ArrayList<PurchaseItem> collection = new ArrayList<>();

	// objekt zum Sortiment hinzufügen gleichzeitig wird die Produktnummer zugewiesen
	public void addToCollection(Product produkt, int anzahl) {
		produkt.produktnumber=collection.size();
		PurchaseItem objekt = new PurchaseItem(produkt, anzahl);
		collection.add(objekt);
	}

	// finde ein Objekt
	public PurchaseItem search(String suche) {
		for (PurchaseItem purchaseItem : collection) {
			if (purchaseItem.item.name.equalsIgnoreCase(suche)) {
				return purchaseItem;
			}
		}
		System.out.println("Suche nicht erlogreich");
		return null;
	}

	public void giveIndex() {
		int size = collection.size();
		
		for (int i = 0; i < size; i++) {
			System.out.println("Index: " + i + " Name: " + collection.get(i).item.name);
		}
	}

	public PurchaseItem getProduct(int index) {
		return collection.get(index);
	}
	
	public String toString() {
		return collection.toString();
	}
	
	public ProductCollection getStorage() {
		return this;
	}

}
