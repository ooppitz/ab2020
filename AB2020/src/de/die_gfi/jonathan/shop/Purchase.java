package de.die_gfi.jonathan.shop;

import java.util.ArrayList;

public class Purchase {
	ArrayList<PurchaseItem> items;

	public void addItem(PurchaseItem objekt) {
		items.add(objekt);
	}

}
