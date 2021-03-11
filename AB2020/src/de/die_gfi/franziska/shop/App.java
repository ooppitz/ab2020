package de.die_gfi.franziska.shop;

// Start implementing interfaces

import java.util.ArrayList;

import java.util.Scanner;

public class App {

	static Scanner scannerApp = new Scanner(System.in);

	public static void main(String[] args) {

		ProductCollection p = App.createProductCollection();

		Customer kurt = new Customer("Kurt Maier", "Landau", "kurt@maier.de");

		Purchase k = simulatePurchase(kurt, p);

		System.out.println(k.toString());

	}

	/**
	 * 
	 * @param Customer c
	 * @return creates Purchase object which contains multiple Products
	 */
	public static Purchase simulatePurchase(Customer c, ProductCollection p) {

		ArrayList<PurchaseItem> purchasedItems = new ArrayList<PurchaseItem>();

		System.out.println("Wilkommen in Franzis fantastischem Online-Shop");
		

		System.out.println("Wollen Sie etwas kaufen?");

		while (scannerApp.nextLine().equalsIgnoreCase("ja")) {

			System.out.println(p.auswahlTreffen());

//		creates PurchaseItem out of the Product that was chosen with artikelnummer and adds it to Purchase which is a PurchaseItem array.		
			purchasedItems.add(PurchaseItem.productToPurchaseItem(p.auswahlArtikelAlsProduct()));

			System.out.println("Noch einen Artikel hinzufügen?");

			scannerApp.nextLine();
		}

		Purchase purchase = new Purchase(c, purchasedItems);

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
		Nahrung mettIgel = new Nahrung("Mettigel", 9, 9, "unbekannt");

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

		ProductCollection collection = new ProductCollection(produkte);

		return collection;

	}

}
