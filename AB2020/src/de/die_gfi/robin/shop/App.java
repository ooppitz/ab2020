package de.die_gfi.robin.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Customer[] kundenListe = Customer.kundenListeAufstellen();

		ArrayList<ProductCollection> collection1 = ProductCollection.createProductCollection();

		// Einkauf simulieren

		System.out.println("Bitte Kundennummer eingeben");
		int kundenNummer = input.nextInt();
		Purchase total = simulatePurchase(kundenListe[kundenNummer], collection1);
		System.out.println(total);

		input.close();

	}

	
	
	public static Purchase simulatePurchase(Customer c, ArrayList<ProductCollection> collection) {
		ArrayList<PurchaseItem> arrList = new ArrayList<PurchaseItem>();

		Scanner input = new Scanner(System.in);

		System.out.println("ProduktNummer eingeben: ");
		int produktNummer = input.nextInt();
		System.out.println("Menge eingeben: ");
		int produktMenge = input.nextInt();

		PurchaseItem pItem;

		while (produktNummer != 0) {
			pItem = new PurchaseItem(collection.get(produktNummer), produktMenge);
			arrList.add(pItem);

			System.out.println("ProduktNummer eingeben: ");
			System.out.println("Geben Sie '0' ein um Ihren Einkauf zu beenden");
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
