package de.die_gfi.franziska.shop;

import java.util.ArrayList;

import java.util.Scanner;

import de.die_gfi.franziska.shop.PurchaseItem;

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
		
		double preisProItem = 0;
		
		
		for (int i = 0; i < items.toArray().length; i++) {
			
			preisProItem = preisProItem + items.get(i).p.preis* items.get(i).menge;

			preisGesamt = preisGesamt + preisProItem;
			
			ausgabe = ausgabe + items.get(i).menge + "x " + items.get(i).p.name + " " + preisProItem
					+ "€\n";
		}
		
		return "Ihr Einkauf: \n" + ausgabe + "\nGesamt: " + preisGesamt + "€";

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

/*	public String erstelleRechnung() {
		
	}
*/	
}
