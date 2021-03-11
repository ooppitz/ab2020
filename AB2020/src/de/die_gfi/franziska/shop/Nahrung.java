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

		return "Artikelnummer: " + artikelnummer + "\nLebensmittel: " + name + " \nPreis: " + App.f.format(preis) + "€" + "\n";

	}

	public int getCount() {

		return Nahrung.counter;

	}
}
