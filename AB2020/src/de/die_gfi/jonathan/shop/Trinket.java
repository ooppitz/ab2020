package de.die_gfi.jonathan.shop;

// Trinkets sind kleinteilige produkte verschidenster natur
public class Trinket extends Product implements Discount {
	String description;

	public Trinket(String bezeicnbung, double preis, String beschreibung) {
		super(bezeicnbung, preis);
		description = beschreibung;
	}

	@Override
	public String toString() {
		return super.toString() + " Produktbeschreibung: " + description;
	}

	@Override
	public boolean isDiscountPossible() {
		return true;
	}

	public double getMaximumDiscount(int menge) {
		if (menge>20) {
			return price-price/20;	
		}else {
			return price;
		}
		
	}

	
}
