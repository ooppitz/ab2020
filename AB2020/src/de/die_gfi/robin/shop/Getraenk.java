package de.die_gfi.robin.shop;

public class Getraenk extends Product {

	double liter;

	public Getraenk(int pNummer,double preis, double liter, String bezeichnung) {
		
		super(pNummer,preis, bezeichnung);
		
		this.liter = liter;

	}

}
