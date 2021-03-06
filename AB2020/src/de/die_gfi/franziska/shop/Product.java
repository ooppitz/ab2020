package de.die_gfi.franziska.shop;

public class Product {

	String name;
	double preis;
	int artikelnummer;

	public static void main(String[] args) {

	}

	public Product(String n, double p, int nr) {

		this.name = n;
		this.preis = p;
		this.artikelnummer = nr;

	}

	public String toString() {

		return "Name: " + name + "\nPreis: " + preis + "\nArtikelnummer: " + artikelnummer;

	}

}
