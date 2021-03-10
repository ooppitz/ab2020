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

		int kundenNummer = kundennummerAbfragen(kundenListe, input);

		Purchase total = simulatePurchase(kundenListe[kundenNummer], products, input);
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
	private static int kundennummerAbfragen(Customer[] kundenListe, Scanner input) {

		System.out.println("Bitte Kundennummer eingeben");

		for (Customer kunde : kundenListe) {
			System.out.println(kunde.kundenNummer + ": " + kunde.anrede + " " + kunde.vorname + " " + kunde.nachname);

		}
		int kundenNummer = 0;
		boolean istKundenNummerZahl = false;
		boolean istKundenNummerVorhanden = false;
		do {
			istKundenNummerZahl = false;
			try {
				kundenNummer = input.nextInt();
				istKundenNummerZahl = true;
			} catch (java.util.InputMismatchException e) {
				input.next();
				System.out.println("Bitte nur ganze Zahlen eingeben");
				continue;
			}

			istKundenNummerVorhanden = false;
			for (Customer kunde : kundenListe) {
				if (kunde.kundenNummer == kundenNummer) {
					istKundenNummerVorhanden = true;
				}
			}
			if (istKundenNummerVorhanden == false) {
				System.out.println("Kundennummer nicht vorhanden. Bitte versuchen Sie es erneut.");
			}

		} while (istKundenNummerZahl == false || istKundenNummerVorhanden == false);
		System.out.println("Herzlich Willkommen " + kundenListe[kundenNummer].anrede + " "
				+ kundenListe[kundenNummer].nachname + "\n");
		return kundenNummer;
	}

	private static Purchase simulatePurchase(Customer kunde, ArrayList<Product> products, Scanner input) {

		ArrayList<PurchaseItem> einkaufswagen = new ArrayList<PurchaseItem>();

		String produktNummer;
		int produktMenge = 0;

		do {

			produktlisteAusgeben(products);
			System.out.println("Produktnummer eingeben ('fertig' beendet den Einkauf,'warenkorb' zeigt Ihren Warenkorb an) ");
			produktNummer = input.next();
			if (produktNummer.equalsIgnoreCase("fertig")) {
				break;
			}
			if (produktNummer.equalsIgnoreCase("warenkorb")) {
				for (PurchaseItem item : einkaufswagen) {
					System.out.println(item);
				}
				
				input.next();
				continue;
			}
			
			

			boolean gefunden = false; 														// Prüft ob die eingegebene Produktnummer mit der eines Produktes
			for (Product product : products) { 												// in der ArrayList 'products' übereinstimmt
				if (product.getProduktnummer() == (Integer.parseInt(produktNummer))) {
					gefunden = true;
					break;
				}

			}
			if (gefunden == false) {
				System.out.println("Produkt wurde nicht gefunden\nBitte versuchen Sie es noch einmal");
				continue;
			}
			
			while (true) {
			System.out.println("Menge eingeben: ");										//Prüft ob die Eingabe eine Zahl ist oder nicht
				try {																	//Nur wenn eine Zahl eingegeben wurde wird die Schleife verlassen
					produktMenge = input.nextInt();
					break;
				}catch(Exception e) {
					System.out.println("Bitte nur ganze Zahlen eingeben");
					input.next();
				}
			}
			
			PurchaseItem pItem = new PurchaseItem(products.get(Integer.parseInt(produktNummer)), produktMenge);
			boolean itemSchonVorhanden = false;

			for (PurchaseItem itemInArray : einkaufswagen) { 					// Es wird geprüft ob die Bezeichnung von pItem bereits in
																				// der ArrayList vorhanden ist,
				if (itemInArray.bezeichnung.equals(pItem.bezeichnung)) { 		// falls das der Fall ist wird die menge und
																				// gesamtpreis des Elements in der ArrayList
					itemInArray.gesamtpreis += pItem.gesamtpreis; 				// um das von pItem erhöht (pItem wird nicht in die
																				// ArrayList übernommen)
					itemInArray.menge += pItem.menge;
					itemSchonVorhanden = true;
				}

			}
			if (itemSchonVorhanden == false) {
				einkaufswagen.add(pItem);
			}
			// Wenn der einkaufswagen noch leer ist muss pItem trotzdem hinzugefügt werden
			if (einkaufswagen.isEmpty()) {
				einkaufswagen.add(pItem);
			}

			System.out.println("Das Produkt wurde hinzugefuegt\n");

		} while (produktNummer != "fertig");

		// Erstellung des Shops
		Shop meinShop = new Shop("Mitrix AG", "Schrammstrasse 4", "73023 Doppeldorf", 132465);
		// Die fertige Arraylist sowie der Kunden und der Shop wird genutzt um ein
		// Purchase Objekt zu erzeugen
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
			System.out.println(product.getProduktnummer() + ": " + String.format("%-40s", product.getBezeichnung())
					+ " " + String.format("%6.2f", product.preis) + " €");
		}
	}

}
