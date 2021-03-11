package de.die_gfi.eva.shop;

public class Beverage extends Product {

	String pfand;

	public Beverage(String name, int artNr, double preis, String pfand) {
		super(name, artNr, preis);
		this.pfand = pfand;
	}

	public String toString() {

		return artName + " / " + artNummer + " / " + preis + "€ / Pfand: " + pfand;
	}

	public static void main(String[] args) {

		Beverage be1 = new Beverage("Mangosaft", 4, 0.90, "ja");
		Beverage be2 = new Beverage("Bananenmilch", 5, 1.28, "nein");
		Beverage be3 = new Beverage("Kokoswasser", 6, 1.99, "ja");
		Beverage be4 = new Beverage("Soju", 7, 2.49, "nein");
		System.out.println(be1.toString());
		System.out.println(be2.toString());
		System.out.println(be3.toString());
		System.out.println(be4.toString());
	}

}
