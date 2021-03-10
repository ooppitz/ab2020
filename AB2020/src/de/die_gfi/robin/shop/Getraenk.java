package de.die_gfi.robin.shop;

public class Getraenk extends Product implements CounterInterface, Discount {

	private static int countGetraenk;
	@SuppressWarnings("unused")
	private double liter;

	public Getraenk(int pNummer, double preis, double liter, String bezeichnung) {

		super(pNummer, preis, bezeichnung);

		this.liter = liter;
		countGetraenk++;
	}

	public int getCount() {
		return countGetraenk;
	}

	public boolean isDiscountPossible() {

		return true;
	}

	public double getMaximumDiscount() {

		return 0;
	}

	public int getDiscountForAmount(int menge) {
		int discountPercent = 0;

		if (isDiscountPossible()) {
			if (menge >= 5) {
				if (menge >= 10) {
					discountPercent = 20;
				} else
					discountPercent = 10;
			}

		}
		return discountPercent;
	}

}
