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

		kundennummerAbfragen(kundenListe);

		int kundenNummer = input.nextInt();

		Purchase total = simulatePurchase(kundenListe[kundenNummer], products);
		System.out.println(total);

		// Rechnung in Datei hinzufuegen
		Rechnungen.rechnungHinzufuegen(total, kundenListe[kundenNummer]);

		input.close();
		
		

		
		
		
	}

	/**
	 * Erfragt die Kundennummer. Danach werden alle Kundennummern mit den
	 * zugehörigen Namen ausgedruckt
	 * 
	 * @param kundenListe
	 */
	private static void kundennummerAbfragen(Customer[] kundenListe) {
		System.out.println("Bitte Kundennummer eingeben");

		for (Customer kunde : kundenListe) {
			System.out.println(kunde.kundenNummer + ": " + kunde.anrede + " " + kunde.vorname + " " + kunde.nachname);

		}
	}

	private static Purchase simulatePurchase(Customer kunde, ArrayList<Product> products) {

		ArrayList<PurchaseItem> einkaufswagen = new ArrayList<PurchaseItem>();

		Scanner input = new Scanner(System.in);

		String produktNummer;
		int produktMenge = 0;

		do {

			produktlisteAusgeben(products);
			System.out.println("Produktnummer eingeben ('fertig' beendet den Einkauf) ");
			produktNummer = input.next();
			if (produktNummer.equals("fertig")) {
				break;
			}

			try {

				System.out.println("Menge eingeben: ");
				produktMenge = input.nextInt();

				PurchaseItem pItem = new PurchaseItem(products.get(Integer.parseInt(produktNummer)), produktMenge);
				einkaufswagen.add(pItem);
				System.out.println("Das Produkt wurde hinzugefuegt\n");
			} catch (Exception e) {
				System.out.println("Ihre Eingabe der Produktnummer: " + produktNummer + " oder Menge: " + produktMenge
						+ " ist fehlerhaft\nBitte versuchen Sie es erneut");
			}

		} while (produktNummer != "fertig");
		input.close();

		Shop meinShop = new Shop("Mitrix AG", "Schrammstrasse 4", "73023 Doppeldorf", 132465);

		Purchase total = new Purchase(einkaufswagen, kunde, meinShop);

		return total;

	}

	/**
	 * Gibt die gesamte produktliste formatiert auf der Konsole aus
	 * 
	 * @param products
	 */
	 private static void produktlisteAusgeben(ArrayList<Product> products) {
		for (Product product : products) {
			System.out.println(product.getProduktnummer() + ": " + String.format("%-40s", product.getBezeichnung()) + " "
					+ String.format("%6.2f", product.preis) + " €");
		}
	}

	

}
