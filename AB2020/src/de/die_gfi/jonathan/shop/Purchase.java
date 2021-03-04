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
	
	public void printPurchase() {
		for (PurchaseItem einkauf : items) {
			System.out.println(einkauf.toString());
		}
	}
	
	public double getItems() {
		double wert=0;
		for (PurchaseItem einkauf : items) {
			System.out.println(einkauf.getPrice()+"  "+einkauf.commodity.name);
			wert=wert+einkauf.getPrice();
		}
		return wert;
	}
	
	

}
