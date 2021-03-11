package de.die_gfi.robin.shop;

public class PurchaseItem {

	String bezeichnung;
	int menge;
	double gesamtpreis;
	double einzelpreis;
	int discountPercent;
	double discountPreis;

	PurchaseItem(Product p, int m) {

		this.bezeichnung = p.getBezeichnung();
		this.menge = m;
		this.einzelpreis = p.preis;
		this.gesamtpreis = p.preis * this.menge;
		
		
		if (p instanceof Buch) {
			Buch b = (Buch) p;
			this.discountPercent = b.getDiscountForAmount(menge);
			this.discountPreis = (this.gesamtpreis * this.discountPercent) / 100;
		}

		if (p instanceof Getraenk) {
			Getraenk g = (Getraenk) p;
			this.discountPercent = g.getDiscountForAmount(menge);
			this.discountPreis = (this.gesamtpreis * this.discountPercent) / 100;
		}

	}
	
	public String toString() {
		String item = "x " + String.format("%-6d", menge) + String.format("%-36s", bezeichnung) + String.format("%20.2f €", gesamtpreis);
		if (this.discountPercent > 0) {
			this.discountPreis = (this.gesamtpreis * this.discountPercent) / 100;
			item += String.format("\n        '-> Mengenrabatt: %2d%-29s %6.2f €", this.discountPercent ,"%",-this.discountPreis);
		}
		
		return  item; 
	}
	
	
}
