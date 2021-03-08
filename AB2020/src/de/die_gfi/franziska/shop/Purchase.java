package de.die_gfi.franziska.shop;

import java.util.ArrayList;

import java.util.Scanner;

import de.die_gfi.franziska.shop.PurchaseItem;

public class Purchase {

	ArrayList<PurchaseItem> items;

	Customer customer;

	public static void main(String[] args) {

	}

	public Purchase(Customer c, ArrayList<PurchaseItem> purchaseItems) {

		this.customer = c;
		this.items = purchaseItems;

	}

	public String toString(ProductCollection products) {

		String ausgabe = "";

		double preisGesamt = 0;

		double preisProItem = 0;

		for (int i = 0; i < items.toArray().length; i++) {

			preisProItem = items.get(i).preis * items.get(i).menge;

			preisGesamt = preisGesamt + preisProItem;

			ausgabe = ausgabe + items.get(i).menge + "x " + items.get(i).p.name + " " + preisProItem + "€\n";

		}

		return "Vielen Dank für Ihren Einkauf: \n" + "Ihre Rechnung:\n\n" + ausgabe + "\nGesamt: " + preisGesamt + "€";

	}

	public int laenge(ArrayList<PurchaseItem> purchaseitems) {

		int counter = 0;

		for (int i = 0; i < items.toArray().length; i++) {

			counter = counter + 1;

		}

		return counter;
	}
}
