package de.die_gfi.franziska.shop;

public class Getraenke extends Product {

	String ablaufdatum;

	public Getraenke(String n, double p, int nr, String a) {

		super(n, p, nr);

		this.ablaufdatum = a;

	}

	public static void main(String[] args) {

		Getraenke limo = new Getraenke("Zitronenlimo", 1.99, 498, "22.04.2021");

		System.out.println(limo.toString());

	}

	public String toString() {

		return "Name: " + name + " \nPreis: " + preis + "€" + " \nMenge: " + anzahl + " \nAblaufdatum: " + ablaufdatum;

	}
}
