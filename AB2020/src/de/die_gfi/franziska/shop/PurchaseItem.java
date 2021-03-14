package de.die_gfi.franziska.shop;

import java.util.ArrayList;

public class PurchaseItem {

	double preis;
	int menge;
	Product p;

	public static void main(String[] args) {
		/*
		 * 
		 * Book proG = new Book("Gulaschsuppe für Fortgeschrittene", 9.99, 1, 347); Book
		 * sLernen = new Book("Stricken lernen", 67.00, 2, 345578); Getraenke eLimo =
		 * new Getraenke("Erdbeerlimo", 1.00, 3, "22.08.2023"); Getraenke bier = new
		 * Getraenke("Bier", 1.86, 4, "nächster Tag bis 4 Uhr"); Nahrung sandwich = new
		 * Nahrung("Sandwich", 2.00, 5, "04.03.2021"); Nahrung brei = new
		 * Nahrung("Babybrei", 10.00, 6, "01.01.2030"); Nahrung mGulasch = new
		 * Nahrung("Minderwertiges Gulasch", 28, 7, "jetzt"); Nahrung erbsen = new
		 * Nahrung("N' Batzen Bohnen", 3, 8,
		 * "wahrscheinlich noch ne gute Zeit entfernt"); Nahrung mettIgel = new
		 * Nahrung("Mettigel", 9, 9, "unbekannt");
		 * 
		 * ArrayList<PurchaseItem> list = new ArrayList<PurchaseItem>();
		 * 
		 * list.add(productToPurchaseItem(proG));
		 * list.add(productToPurchaseItem(sLernen));
		 * list.add(productToPurchaseItem(eLimo));
		 * list.add(productToPurchaseItem(proG));
		 * 
		 * System.out.println("Original list"); for (PurchaseItem purchaseItem : list) {
		 * System.out.println(purchaseItem); }
		 * 
		 * zusammenfassen(list);
		 * 
		 * System.out.println("\nNach zusammenfassen"); for (PurchaseItem purchaseItem :
		 * list) { System.out.println(purchaseItem); }
		 */

	}

	public PurchaseItem(Product p, int m, double preis) {
		this.preis = p.preis;
		this.p = p;
		this.menge = m;
	}

	public static int mengenAbfrage() {

		System.out.println("Bitte Menge eingeben: ");

		int anzahl = App.scannerApp.nextInt();

		int tryCounter = 0;

		int tryCounterS = 0;

		if (anzahl == 69) {

			System.out.println("nice");

		}

		while (anzahl >= 100) {

			if (anzahl >= 100 && anzahl != 420) {

				System.out.println(
						"Es werden nur haushaltsübliche Mengen verkauft. Bitte erneut Menge (unter 100) eingeben!\n");

				tryCounter++;

				if (tryCounter >= 3) {
					System.out.println("\nNUR HAUSHALTSÜBLICHE MENGEN!\n");
				}

				anzahl = App.scannerApp.nextInt();

			} else if (anzahl == 420) {

				System.out.println("nice... aber nur haushaltsübliche Mengen angeben, bitte\n");

				tryCounterS++;

				if (tryCounterS >= 3) {

					System.out.println("Okay. Wir machen dieses Mal eine Ausnahme ;D\n");
					break;
				}

				anzahl = App.scannerApp.nextInt();
			}
		}

		return anzahl;

	}

	public String toString() {

		double preisGesamt = p.preis * menge;

		String mengeP = String.format("%-5s", menge + "x");

		String nameP = String.format("%-40s", p.name);

		String preisP = String.format("%11s", App.f.format(preisGesamt));

		return mengeP + nameP + preisP + "€";
	}

	/**
	 * 
	 * @param p
	 * @return PurchaseItem out of a products values and quantity from method
	 *         mengenAbfrage
	 */
	public static PurchaseItem productToPurchaseItem(Product p) {

		PurchaseItem item = new PurchaseItem(p, PurchaseItem.mengenAbfrage(), p.preis);

		return item;
	}

	/**
	 * 
	 * @param a Purchases PurchaseItem ArrayList
	 * @return the same PurchaseItem ArrayList but merged so every item only occurs
	 *         once
	 */
	public static ArrayList<PurchaseItem> zusammenfassen(ArrayList<PurchaseItem> alleItems) {

		for (int i = 0; i < alleItems.size(); i++) {

			for (int j = 0; j < alleItems.size(); j++) {

				if ((alleItems.get(i).p.name.equals(alleItems.get(j).p.name)) && j != i) {

					alleItems.get(i).menge = alleItems.get(i).menge + alleItems.get(j).menge;

					alleItems.remove(j);

				}

			}

		}

		return alleItems;
	}

}
