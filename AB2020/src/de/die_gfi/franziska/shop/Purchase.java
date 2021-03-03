package de.die_gfi.franziska.shop;

import java.util.ArrayList;

public class Purchase {

	ArrayList<PurchaseItem> items;

	Customer customer;

	public static void main(String[] args) {

	}

	public Purchase(Customer c, ArrayList<PurchaseItem> products) {

		this.customer = c;
		this.items = products;

	}

	public String toString(Purchase p) {

		String ausgabe = "";

		double preisGesamt = 0;

		for (int i = 0; i < items.toArray().length; i++) {

			preisGesamt = preisGesamt + (items.get(i).p.preis * items.get(i).p.anzahl);

			ausgabe = ausgabe + items.get(i).p.anzahl + "x " + items.get(i).p.name + " für je " + items.get(i).p.preis
					+ "€\n";
		}

		return "Ihr Einkauf: \n" + ausgabe + "\nGesamt: " + preisGesamt;

	}

	public PurchaseItem[] toArrayItems(PurchaseItem c) {

		PurchaseItem[] arr = new PurchaseItem[items.size()];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = items.get(i);

		}

		return arr;
	}

	public int laenge(ArrayList<PurchaseItem> purchaseitems) {

		int counter = 0;

		for (int i = 0; i < items.toArray().length; i++) {

			counter = counter + 1;

		}

		return counter;
	}

}
