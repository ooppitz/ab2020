package de.die_gfi.jonathan.shop;

import java.util.ArrayList;

public class Purchase {
	//ArrayList<PurchaseItem> items;
	ArrayList<PurchaseItem> items=new ArrayList<>(1);

	public void addItem(PurchaseItem objekt) {
		items.add(objekt);
	}
	
	@Override
	public String toString() {
		return items.toString();
	}
	
	

}
