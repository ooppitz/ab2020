package de.die_gfi.franziska.shop;

public class Nahrung extends Product {

	String ablaufdatum;

	public Nahrung(String n, double p, int nr, String a) {

		super(n, p, nr);

		this.ablaufdatum = a;

	}

	public String toString() {

		return "Name: " + name + " \nPreis: " + preis + "€" + " \nMenge: " + anzahl + " \nAblaufdatum: " + ablaufdatum;

	}
}
