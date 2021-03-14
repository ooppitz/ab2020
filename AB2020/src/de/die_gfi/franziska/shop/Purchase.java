package de.die_gfi.franziska.shop;

import java.util.ArrayList;

public class Purchase {

	ArrayList<PurchaseItem> items;

	Customer customer;

	public static void main(String[] args) {

	}

	public Purchase(Customer c, ArrayList<PurchaseItem> purchaseItems) {

		this.customer = c;
		this.items = purchaseItems;

	}

	@Override
	public String toString() {

		return rechnung(this);

	}

	public int laenge(ArrayList<PurchaseItem> purchaseitems) {

		int counter = 0;

		for (int i = 0; i < items.size(); i++) {

			counter = counter + 1;

		}

		return counter;
	}

	public String rechnung(Purchase einkauf) {

		String ausgabe = "";

		double preisGesamt = 0;

		double preisProItem = 0;

		for (int i = 0; i < einkauf.items.size(); i++) {

			preisProItem = einkauf.items.get(i).preis * einkauf.items.get(i).menge;

			preisGesamt = preisGesamt + preisProItem;

			ausgabe = ausgabe + "\n" + einkauf.items.get(i).toString();

		}
		String linie = "-".repeat(57);

		String kopf = einkauf.customer.name + "\n" + "Steuernummer"
				+ String.format("%45s", (int) (Math.random() * 99 - 1) + 1) + "\n" + linie + "\nIhre Rechnung:";

		String gesamt = linie + "\nGesamt: "
				+ String.format("%49s", App.f.format(preisGesamt - ersparnisDurchRabatt(einkauf)) + "€");

		String ciao = String.format("%40s", "Vielen Dank & bis bald!");

		String originalPreis = "";

		String rabatt = "";

		if (ersparnisDurchRabatt(einkauf) != 0) {
			rabatt = "\nRabatt: " + String.format("%48s", "-" + App.f.format(ersparnisDurchRabatt(einkauf))) + "€"
					+ "\n";
			originalPreis = "\n" + String.format("%57s", App.f.format(preisGesamt) + "€");
		}

		if (einkauf.items.isEmpty()) {

			return "Auf Wiedersehen";

		} else {

			return kopf + "\n" + linie + "\n" + ausgabe + "\n\n" + originalPreis + "\n" + rabatt + gesamt + "\n" + linie
					+ "\n" + ciao;
		}

	}

	public double ersparnisDurchRabatt(Purchase einkauf) {

		double preisProItem = 0;

		double preisGesamt = 0;

		for (int i = 0; i < einkauf.items.size(); i++) {

			preisProItem = einkauf.items.get(i).preis * einkauf.items.get(i).menge;

			preisGesamt = preisGesamt + preisProItem;

		}

		double rabattCounter = 0;

		for (int i = 0; i < einkauf.items.size(); i++) {

			if (einkauf.items.get(i).p.isDiscountPossible()) {

				preisProItem = einkauf.items.get(i).preis * einkauf.items.get(i).menge;

				rabattCounter = rabattCounter
						+ ((preisProItem * (einkauf.items.get(i).p.getDiscountForAmount(einkauf.items.get(i).menge)))
								/ 100);

			}

		}

		return rabattCounter;

	}
	
	public static double berechneGesamtPreis(Purchase einkauf) {
		
		double preisProItem = 0;
		
		double preisGesamt = 0;
		
		for (int i = 0; i < einkauf.items.size(); i++) {

			preisProItem = einkauf.items.get(i).preis * einkauf.items.get(i).menge;

			preisGesamt = preisGesamt + preisProItem;

		}
		
		return preisGesamt;
		
	}

}
