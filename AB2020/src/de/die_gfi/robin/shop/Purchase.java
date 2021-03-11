package de.die_gfi.robin.shop;

import java.util.ArrayList;

public class Purchase {

	// Der String zur Ausgabe der Rechung
	String rechnung;

	// Die ArrayList wird in einen String übernommen
	// Der String wird in dem Konstruktor von Purchase aufgebaut
	protected Purchase(ArrayList<PurchaseItem> artikelListe, Customer kunde, Shop shop) {

		this.rechnung = erstelleRechnung(artikelListe, kunde, shop);

	}

	private String erstelleRechnung(ArrayList<PurchaseItem> artikel, Customer c, Shop s) {

		String text = c + "\n";
		
		double gesamtpreis = 0;

		for (int i = 0; i < artikel.size(); i++) {

			text += "x " + String.format("%-6d", artikel.get(i).menge) 
					+ String.format("%-36s", artikel.get(i).bezeichnung)
					+ String.format("%20.2f", artikel.get(i).gesamtpreis) + " €\n";

			// Rabatt verrechnen
			int rabattProzent = artikel.get(i).discountPercent;
			double rabatt = (artikel.get(i).gesamtpreis * rabattProzent) / 100;
			if (rabatt > 0) {
				String q = "'-> Mengenrabatt: " + rabattProzent + "%";
				text += String.format("%-36s",q);
				text += String.format("%28.2f", -rabatt) + " €\n";

				gesamtpreis += artikel.get(i).gesamtpreis - rabatt;
			} else
				gesamtpreis += artikel.get(i).gesamtpreis;

		}
		text += "=".repeat(66);
		text += "\nSumme: " + String.format("%57.2f €", gesamtpreis);
		text += "\n\nVielen Dank für Ihren Einkauf\n";
		text += s;

		return text;
	}

	public String toString() {

		return this.rechnung;
	}

}
