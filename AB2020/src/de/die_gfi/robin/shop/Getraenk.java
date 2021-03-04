package de.die_gfi.robin.shop;

public class Getraenk extends Product {

	String marke;
	double liter;

	public Getraenk(double p, double l, String m) {
		super(p);
		this.liter = l;
		this.marke = m;

	}

}
