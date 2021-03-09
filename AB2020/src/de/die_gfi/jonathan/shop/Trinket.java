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

	@Override
	public int getMaximumDiscount() {
		System.out.println("5%");
		return 5;
	}

	@Override
	public int getDiscountForAmount(int count) {
		// TODO Auto-generated method stub
		return 0;
	}
}
