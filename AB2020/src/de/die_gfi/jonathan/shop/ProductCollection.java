package de.die_gfi.jonathan.shop;

import java.util.ArrayList;

public class ProductCollection {
// arrayList automatisch hinzugefügt wenn als Purchase Item regestrirt evtl. speicherung aller 
	// purchaseitems anstatt sie individuell zu bennen
	ArrayList<PurchaseItem> collection = new ArrayList<>(1);

	// objekt zur einkaufsliste hinzufügen
	public void addToCollection(PurchaseItem objekt) {
		collection.add(objekt);
	}

	public String toString() {
		return collection.toString();
	}

}
