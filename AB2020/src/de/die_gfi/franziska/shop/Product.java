package de.die_gfi.franziska.shop;

public class Product {

	String name;
	double preis;
	int anzahl;

	public static void main(String[] args) {

	}

	public Product(String n, double p, int nr) {

		this.name = n;
		this.preis = p;
		this.anzahl = nr;

	}

	public String toString() {

		return "Name: " + name + "\nPreis: " + preis + "\nMenge: " + anzahl;

	}

}
