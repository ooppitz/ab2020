package de.die_gfi.robin.shop;

public class PurchaseItem {

	String bezeichnung;
	int menge;
	double gesamtpreis;

	public PurchaseItem(Product b, int m) {
		
		this.bezeichnung = b.bezeichnung;
		this.menge = m;
		this.gesamtpreis = b.preis * this.menge;
	}

}
