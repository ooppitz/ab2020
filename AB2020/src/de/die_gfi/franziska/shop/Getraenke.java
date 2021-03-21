package de.die_gfi.franziska.shop;

//start implementing interfaces

public class Getraenke extends Product implements InstanceCounter, Discount {

	String ablaufdatum;

	public static int counter = 0;

	public Getraenke(String n, double p, int nr, String a) {

		super(n, p, nr);

		this.ablaufdatum = a;

		Getraenke.counter++;

	}

	public static void main(String[] args) {

		Getraenke limo = new Getraenke("Zitronenlimo", 1.99, 498, "22.04.2021");

		System.out.println(limo.toString());

	}
	public String getMHD() {

		return this.ablaufdatum;

	}

	@Override
	public String toString() {

		return "Artikenummer: " + artikelnummer + "\nGetränk: " + name + " \nPreis: " + App.f.format(preis) + "\n";

	}

	@Override
	public int getCount() {

		return Getraenke.counter;

	}

	@Override
	public boolean isDiscountPossible() {

		return true;
	}

	@Override
	public int getMaximumDiscount() {

		return 40;

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
