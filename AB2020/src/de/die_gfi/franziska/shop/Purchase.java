package de.die_gfi.franziska.shop;

import java.util.ArrayList;
import java.util.HashMap;

public class Purchase {

	ArrayList<PurchaseItem> items;

	Customer customer;

	static int speicherNummer = 0;

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

		String kopf = "Steuernummer" + String.format("%45s", (int) (Math.random() * 99 - 1) + 1) + "\n" + linie
				+ "\nIhre Rechnung:";

		String gesamt = linie + "\nGesamt: "
				+ String.format("%49s", App.f.format(preisGesamt - this.ersparnisDurchRabatt()) + "€");

		String ciao = String.format("%40s", "Vielen Dank & bis bald!");

		String originalPreis = "";

		String rabatt = "";

		if (this.ersparnisDurchRabatt() != 0) {
			rabatt = "\nRabatt: " + String.format("%48s", "-" + App.f.format(this.ersparnisDurchRabatt())) + "€" + "\n";
			originalPreis = "\n" + String.format("%57s", App.f.format(preisGesamt) + "€");
		}

		if (einkauf.items.isEmpty()) {

			return "Auf Wiedersehen";

		} else {

			return kopf + "\n" + linie + "\n" + ausgabe + "\n\n" + originalPreis + "\n" + rabatt + gesamt + "\n" + linie
					+ "\n" + ciao;
		}

	}

	public double ersparnisDurchRabatt() {

		double preisProItem = 0;

		double preisGesamt = 0;

		for (int i = 0; i < this.items.size(); i++) {

			preisProItem = this.items.get(i).preis * this.items.get(i).menge;

			preisGesamt = preisGesamt + preisProItem;

		}

		double rabattCounter = 0;

		for (int i = 0; i < this.items.size(); i++) {

			if (this.items.get(i).p.isDiscountPossible()) {

				preisProItem = this.items.get(i).preis * this.items.get(i).menge;

				rabattCounter = rabattCounter
						+ ((preisProItem * (this.items.get(i).p.getDiscountForAmount(this.items.get(i).menge))) / 100);

			}

		}

		return rabattCounter;

	}

	public double berechneGesamtPreis() {

		double preisProItem = 0;

		double preisGesamt = 0;

		for (int i = 0; i < this.items.size(); i++) {

			preisProItem = this.items.get(i).preis * this.items.get(i).menge;

			preisGesamt = preisGesamt + preisProItem;

		}

		return preisGesamt;

	}

	public static String createReport(ArrayList<Purchase> ps) {

		String s = "";

		double preis = 0;

		for (int i = 0; i < ps.size(); i++) {

			preis = ps.get(i).berechneGesamtPreis() - ps.get(i).ersparnisDurchRabatt();

			s = s + ps.get(i).customer.name + " hat für insgesamt " + App.f.format(preis) + "€ eingekauft\n";

		}
		return s;
	}

}
