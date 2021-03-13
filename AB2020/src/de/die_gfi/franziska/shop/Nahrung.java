package de.die_gfi.franziska.shop;

//start implementing interfaces

public class Nahrung extends Product implements InstanceCounter {

	String ablaufdatum;

	protected static int counter = 0;

	public Nahrung(String n, double p, int nr, String a) {

		super(n, p, nr);

		this.ablaufdatum = a;

		Nahrung.counter++;

	}

	public String toString() {

		return "Artikelnummer: " + artikelnummer + "\nLebensmittel: " + name + " \nPreis: " + App.f.format(preis) + "€"
				+ "\n";

	}

	public int getCount() {

		return Nahrung.counter;

	}

	@Override
	public boolean isDiscountPossible() {

		return true;

	}

	@Override
	public int getMaximumDiscount() {

		return 20;

	}

	@Override
	public int getDiscountForAmount(int count) {

		int discount = 0;

		if (count >= 5 && count < 10) {

			discount = getMaximumDiscount() / 10;

		} else if (count >= 10 && count < 80) {

			discount = getMaximumDiscount() / 5;

		} else if (count >= 80) {

			discount = getMaximumDiscount();

		}

		return discount;

	}
}
