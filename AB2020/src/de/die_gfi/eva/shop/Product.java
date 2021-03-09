package de.die_gfi.eva.shop;

public class Product {

	double preis;
	int artNummer;
	String artName;

	public Product(String name, int artNr, double preis) {

		this.artName = name;
		this.artNummer = artNr;
		this.preis = preis;

	}

}