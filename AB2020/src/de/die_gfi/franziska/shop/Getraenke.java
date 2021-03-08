package de.die_gfi.franziska.shop;

//start implementing interfaces

public class Getraenke extends Product implements InstanceCounter {

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

	public String toString() {

		return "Artikenummer: " + artikelnummer + "\nGetränk: " + name + " \nPreis: " + preis + "\n";

	}

	public int getCount() {

		return Getraenke.counter;

	}
}
