package de.die_gfi.robin.shop;

public class PurchaseItem {

	String bezeichnung;
	int menge;
	double preis;

	public PurchaseItem(ProductCollection b, int m) {
		this.bezeichnung = b.bezeichnung;
		this.menge = m;
		// Preis wird mit Menge multipliziert
		this.preis = b.preis * this.menge;
	}

}
