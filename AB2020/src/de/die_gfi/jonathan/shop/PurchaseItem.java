package de.die_gfi.jonathan.shop;

public class PurchaseItem {
	Product commodity;
	int count;
	double price;
	
	public PurchaseItem(Product produkt,int anzahl) {
		commodity=produkt;
		count=anzahl;
		price=produkt.price;
	}
	
	@Override
	public String toString() {
		return commodity.toString()+" "+count;
	}
	public String printProducts() {
		return commodity.toString()+"\n";
	}
}
