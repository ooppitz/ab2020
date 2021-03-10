package de.die_gfi.robin.shop;

public class Buch extends Product implements CounterInterface, Discount {

	private static int countBuch;
	String titel;
	String author;

	Buch(int pNummer, double preis, String _titel, String _author) {

		super(pNummer, preis, _titel + " von " + _author);

		this.titel = _titel;
		this.author = _author;
		countBuch++;

	}

	public int getCount() {
		return countBuch;
	}

	public boolean isDiscountPossible() {

		return true;
	}

	public double getMaximumDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getDiscountForAmount(int menge) {

		int discountPercent = 0;

		if (isDiscountPossible()) {
			if (menge >= 5) {
				if (menge >= 10) {
					discountPercent = 15;
				} else
					discountPercent = 5;
			}

		}
		return discountPercent;
	}
}
