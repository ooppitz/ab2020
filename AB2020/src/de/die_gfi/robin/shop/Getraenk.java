package de.die_gfi.robin.shop;

public class Getraenk extends Product implements CounterInterface {

	static int countGetraenk;
	double liter;

	public Getraenk(int pNummer,double preis, double liter, String bezeichnung) {
		
		super(pNummer,preis, bezeichnung);
		
		this.liter = liter;
		countGetraenk++;
	}

	public int getCount() {
		return countGetraenk;
	}
}
