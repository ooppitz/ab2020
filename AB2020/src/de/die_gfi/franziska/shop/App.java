package de.die_gfi.franziska.shop;

import java.text.DecimalFormat;

// Start implementing interfaces

import java.util.ArrayList;

import java.util.Scanner;

public class App {

	static Scanner scannerApp = new Scanner(System.in);

	static DecimalFormat f = new DecimalFormat("#0.00");

	public static ArrayList<Purchase> purchases = new ArrayList<Purchase>();

	public static void main(String[] args) {

		ProductCollection p = App.createProductCollection();

		Purchase k = simulatePurchase(Customer.chooseCustomer(), p);

		System.out.println(k.toString());

//
//		Purchase j = simulatePurchase(Customer.chooseCustomer(), p);

//		System.out.println(j.toString());

//		System.out.println();
//		System.out.println(Purchase.createReport(purchases));

	}

	/**
	 * contains the selection menu and adds the chosen products to a PurchaseItem
	 * array list has special output if the customer chose not to buy anything
	 * 
	 * @param c Customer
	 * @param p ProductCollection
	 * @return Purchase object which contains multiple Products
	 */
	public static Purchase simulatePurchase(Customer c, ProductCollection p) {

		ArrayList<PurchaseItem> purchasedItems = new ArrayList<PurchaseItem>();

		Purchase purchase = new Purchase(c, purchasedItems);

		System.out.println("Wilkommen in Franzis fantastischem Online-Shop :D\n");

		System.out.println("Wollen Sie etwas kaufen?");
		System.out.println("\" ja \" eingeben um einzukaufen");

		while (scannerApp.next().equalsIgnoreCase("ja")) {

			System.out.println(p.auswahlKategorie());

			System.out.println("Bitte Artikelnummer eingeben");

//		creates PurchaseItem out of the Product that was chosen with artikelNummer and adds it to Purchase which is a PurchaseItem array.		
			purchasedItems.add(PurchaseItem.productToPurchaseItem(p.artikelNummerToProduct()));

			System.out.println("Noch einen Artikel hinzufügen?");

			System.out.println(
					"\"hinzufügen\" eingeben um einen weiteren Artikel aus dieser Kategorie hinzuzufügen, \"nein\" eingeben um eine andere Kategorie zu wählen oder den Kauf zu beenden");

			String nextChoice = scannerApp.next();

			boolean weiter = true;

			if (nextChoice.equalsIgnoreCase("hinzufügen")) {

				while (weiter) {

					System.out.println("Bitte Artikelnummer eingeben");

					purchasedItems.add(PurchaseItem.productToPurchaseItem(p.artikelNummerToProduct()));

					System.out.println("Weitere Artikel hinzufügen?");

					System.out.println(
							"\" weiter \" eingeben um weitere Artikel hinzuzufügen, \"nein\" eingeben um eine andere Kategorie zu wählen oder den Kauf zu beenden");

					if (scannerApp.next().equalsIgnoreCase("weiter")) {
						continue;

					} else {
						weiter = false;
						break;
					}

				}
				System.out.println("Wollen Sie weiter einkaufen?");
				System.out.println("\" ja \" eingeben um weiter einzukaufen");

			} else {
				System.out.println("Wollen Sie weiter einkaufen?");
				System.out.println("\" ja \" eingeben um weiter einzukaufen");

			}
		}

		PurchaseItem.zusammenfassen(purchasedItems);

		boolean zuViel = false;

		for (PurchaseItem purchaseItem : purchasedItems) {
			if (purchaseItem.menge >= 100 && purchaseItem.menge != 420) {

				purchaseItem.menge = 99;

				zuViel = true;

			}
		}

		if (zuViel) {

			System.out.println("netter Versuch. Es wurden überschüssige Artikel entfernt");
		}

		purchases.add(purchase);

		return purchase;
	}

	/**
	 * @return array in form of an ArrayList with predefined content
	 */
	public static ProductCollection createProductCollection() {

		Book proG = new Book("Gulaschsuppe für Fortgeschrittene", 9.99, 1, 347);
		Book sLernen = new Book("Stricken lernen", 67.00, 2, 345578);
		Getraenke eLimo = new Getraenke("Erdbeerlimo", 1.00, 3, "22.08.2023");
		Getraenke bier = new Getraenke("Bier", 1.86, 4, "nächster Tag bis 4 Uhr");
		Nahrung sandwich = new Nahrung("Sandwich", 2.00, 5, "04.03.2021");
		Nahrung brei = new Nahrung("Babybrei", 10.00, 6, "01.01.2030");
		Nahrung mGulasch = new Nahrung("Minderwertiges Gulasch", 28, 7, "jetzt");
		Nahrung erbsen = new Nahrung("N' Batzen Erbsen", 15, 8, "wahrscheinlich noch ne gute Zeit entfernt");
		Nahrung mettIgel = new Nahrung("Mett-Igel", 9, 9, "unbekannt");
		Nahrung phil = new Nahrung("Prince Philip Rosinen (ohne Konservierungsmittel)", 1.99, 10,
				"schon lange abgelaufen");

		ArrayList<Product> produkte = new ArrayList<Product>();

		produkte.add(proG);
		produkte.add(sLernen);
		produkte.add(eLimo);
		produkte.add(bier);
		produkte.add(sandwich);
		produkte.add(brei);
		produkte.add(mGulasch);
		produkte.add(erbsen);
		produkte.add(mettIgel);
		produkte.add(phil);

		ProductCollection collection = new ProductCollection(produkte);

		return collection;

	}

}
