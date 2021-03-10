package de.die_gfi.robin.shop;

public class PurchaseItem {

	String bezeichnung;
	int menge;
	double gesamtpreis;
	int discountPercent;

	PurchaseItem(Product p, int m) {

		this.bezeichnung = p.getBezeichnung();
		this.menge = m;
		this.gesamtpreis = p.preis * this.menge;

		if (p instanceof Buch) {
			Buch b = (Buch) p;
			this.discountPercent = b.getDiscountForAmount(menge);

		}

		if (p instanceof Getraenk) {
			Getraenk g = (Getraenk) p;
			this.discountPercent = g.getDiscountForAmount(menge);

		}

	}

}
