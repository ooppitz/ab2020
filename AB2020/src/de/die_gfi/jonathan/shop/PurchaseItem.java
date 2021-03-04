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
	
	public String toString() {
		return commodity.toString()+" Vorhande exemplare:"+count;
	}
	// für den kunden vorgesehen Ausgabe
	public String printProducts() {
		return commodity.toString()+"\n";
	}
	//Preis ausgabe für die Rechnung
	public double getPrice() {
		return price;
	}
	
}
