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
				kundenNummer = Integer.parseInt(input.nextLine());
				istKundenNummerZahl = true;
			} catch (Exception e) {
				
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

		String eingabe = "";
		int produktNummer = 0;
		int produktMenge = 0;

		do {

			produktlisteAusgeben(products);
			System.out.println("Produktnummer eingeben ('fertig' beendet den Einkauf,'warenkorb' zeigt Ihren Warenkorb an) ");
			eingabe = input.nextLine();
			if (eingabe.equalsIgnoreCase("fertig")) {
				break;
			}
			else if (eingabe.equalsIgnoreCase("warenkorb")) {
				warenkorbAusgeben(einkaufswagen);
				continue;
			}
			else {
				try {
					produktNummer = Integer.parseInt(eingabe);
				}catch (Exception e){
					System.out.println("\nIhre Eingabe wurde nicht erkannt. Bitte versuchen Sie es erneut\n");
					continue;
				}
				
			}
			
			boolean gefunden = false; 														// Prüft ob die eingegebene Produktnummer mit der eines Produktes
			for (Product product : products) { 												// in der ArrayList 'products' übereinstimmt
				if (product.getProduktnummer() == produktNummer) {
					gefunden = true;
					break;
				}

			}
			if (gefunden == false) {
				System.out.println("Produkt wurde nicht gefunden\nBitte versuchen Sie es noch einmal\n");
				continue;
			}
			
			while (true) {
			System.out.println("Menge eingeben: ");										//Prüft ob die Eingabe eine Zahl ist oder nicht
				try {																	//Nur wenn eine Zahl eingegeben wurde wird die Schleife verlassen
					produktMenge = Integer.parseInt(input.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("Bitte nur ganze Zahlen eingeben");
					
				}
			}
			
			PurchaseItem pItem = new PurchaseItem(products.get(produktNummer), produktMenge);
			
			boolean itemSchonVorhanden = istItemInEinkaufswagenSchonVorhanden(einkaufswagen, pItem);
			
			itemHinzufuegen(einkaufswagen, pItem, itemSchonVorhanden);

			System.out.println("Das Produkt wurde hinzugefuegt\n");

		} while (true);

		// Erstellung des Shops
		Shop meinShop = new Shop("Mitrix AG", "Schrammstrasse 4", "73023 Doppeldorf", 132465);
		// Die fertige Arraylist sowie der Kunden und der Shop wird genutzt um ein
		// Purchase Objekt zu erzeugen
		Purchase total = new Purchase(einkaufswagen, kunde, meinShop);

		return total;

	}

	private static void itemHinzufuegen(ArrayList<PurchaseItem> einkaufswagen, PurchaseItem pItem,
			boolean itemSchonVorhanden) {
		if (itemSchonVorhanden == false) {
			einkaufswagen.add(pItem);
		}
		// Wenn der einkaufswagen noch leer ist muss pItem trotzdem hinzugefügt werden
		if (einkaufswagen.isEmpty()) {
			einkaufswagen.add(pItem);
		}
	}
	
	/**
	 * Es wird geprüft ob die Bezeichnung von pItem bereits in der ArrayList vorhanden ist,
	 * falls das der Fall ist wird die menge und gesamtpreis des Elements in der ArrayList
	 * um das von pItem erhöht (pItem wird nicht in die ArrayList übernommen)
	 * @param einkaufswagen
	 * @param pItem
	 * @return true falls vorhanden, false falls nicht
	 */
	
	private static boolean istItemInEinkaufswagenSchonVorhanden(ArrayList<PurchaseItem> einkaufswagen,
			PurchaseItem pItem) {
		boolean itemSchonVorhanden = false;

		for (PurchaseItem itemInArray : einkaufswagen) { 				
																		
			if (itemInArray.bezeichnung.equals(pItem.bezeichnung)) { 		
																			
				itemInArray.gesamtpreis += pItem.gesamtpreis; 				
																			
				itemInArray.menge += pItem.menge;
				itemSchonVorhanden = true;
			}

		}
		return itemSchonVorhanden;
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
	
	private static void warenkorbAusgeben(ArrayList<PurchaseItem> einkaufswagen) {
		System.out.println("Ihr Warenkorb:");
		if (einkaufswagen.isEmpty()) {
			System.out.println("\nDer Warenkorb ist noch leer.\n");
		}
		else {
			double einkaufswagenDiscount = 0;
			double einkaufswagenPreisGesamt = 0;
			System.out.println(("-").repeat(66));								
			for (PurchaseItem item : einkaufswagen) {
				einkaufswagenDiscount += item.discountPreis;
				einkaufswagenPreisGesamt += item.gesamtpreis;
				System.out.println(item);
			}
			System.out.println(("-").repeat(66));
			einkaufswagenPreisGesamt = einkaufswagenPreisGesamt - einkaufswagenDiscount;
			System.out.println("Summe: " + String.format("%57.2f €\n", einkaufswagenPreisGesamt));
		}
	
	}
	
	

}
