package de.die_gfi.eva.shop;

public class Food extends Product {

	String expDate;

	public Food(String name, int artNr, double preis, String expDate) {
		super(name, artNr, preis);
		this.expDate = expDate;
	}

	public static void main(String[] args) {

		Food f1 = new Food("Instant Nudeln", 1, 0.89, "23.09.22");
		Food f2 = new Food("Reiskuchen", 2, 1.50, "15.06.21");
		Food f3 = new Food("Sojasoße 1L", 3, 2.30, "09.12.22");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
	}

	public String toString() {

		return artName + " / " + artNummer + " / " + preis + "€ / haltbar bis: " + expDate;
	}
}
