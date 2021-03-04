package de.die_gfi.robin.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Customer[] kundenListe = Customer.kundenListeAufstellen();

		ProductCollection c = new ProductCollection();
		ArrayList<Product> products = c.getProducts();

		// Einkauf simulieren

		System.out.println("Bitte Kundennummer eingeben");
		int kundenNummer = input.nextInt();
		Purchase total = simulatePurchase(kundenListe[kundenNummer], products);
		System.out.println(total);

		input.close();

	}

	
	
	public static Purchase simulatePurchase(Customer c, ArrayList<Product> collection) {
		
		ArrayList<PurchaseItem> arrList = new ArrayList<PurchaseItem>();

		Scanner input = new Scanner(System.in);

		System.out.println("ProduktNummer eingeben: ");
		int produktNummer = input.nextInt();
		System.out.println("Menge eingeben: ");
		int produktMenge = input.nextInt();

		while (produktNummer != 0) {
			PurchaseItem pItem = new PurchaseItem(collection.get(produktNummer), produktMenge);
			arrList.add(pItem);

			System.out.println("ProduktNummer eingeben ('0' beendet den Einkauf): ");
			produktNummer = input.nextInt();
			if (produktNummer == 0) {
				break;
			}

			System.out.println("Menge eingeben: ");
			produktMenge = input.nextInt();

		}
		Shop meinShop = new Shop("Mitrix AG", "Schrammstrasse 4", "73023 Doppeldorf", 132465);

		Purchase total = new Purchase(arrList, c, meinShop);

		return total;

	}

}
