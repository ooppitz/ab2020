package de.die_gfi.robin.shop;

public class PurchaseItem {
	
	String bezeichnung;
	int menge;
	
	public PurchaseItem( Buch b, int m ) {
		this.bezeichnung = b.titel;
		this.menge = m;
	}
	
	
}
