package de.die_gfi.robin.shop;

public class Getraenk extends Product {

	double liter;

	public Getraenk(double preis, double liter, String bezeichnung) {
		
		super(preis, bezeichnung);
		
		this.liter = liter;

	}

}
