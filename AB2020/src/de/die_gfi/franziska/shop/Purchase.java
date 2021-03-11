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

	public String toString() {

		return rechnung();

	}

	public int laenge(ArrayList<PurchaseItem> purchaseitems) {

		int counter = 0;

		for (int i = 0; i < items.size(); i++) {

			counter = counter + 1;

		}

		return counter;
	}

	public String rechnung() {

		String ausgabe = "";

		double preisGesamt = 0;

		double preisProItem = 0;

		for (int i = 0; i < items.size(); i++) {

			preisProItem = items.get(i).preis * items.get(i).menge;

			preisGesamt = preisGesamt + preisProItem;

			ausgabe = ausgabe + "\n" + items.get(i).toString();

		}

		String letzteZeile = "-".repeat(57) + "\nGesamt: " + String.format("%49s", App.f.format(preisGesamt) + "€")
				+ "\n" + "-".repeat(57);

		String ciao = String.format("%40s", "Vielen Dank & bis bald!");
		
		return "Ihre Rechnung:\n" + "-".repeat(57) + "\n" + ausgabe + "\n\n" + letzteZeile +"\n" + ciao;

	}

}
