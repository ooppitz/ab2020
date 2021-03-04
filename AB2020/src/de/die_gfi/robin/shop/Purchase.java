package de.die_gfi.robin.shop;

import java.util.ArrayList;

public class Purchase {

	// Der String zur Ausgabe der Rechung
	String rechnung;

	// Die ArrayList wird in einen String übernommen
	// Der String wird in dem Konstruktor von Purchase aufgebaut
	public Purchase(ArrayList<PurchaseItem> artikelListe, Customer kunde, Shop shop) {
		
		this.rechnung = erstelleRechnung(artikelListe, kunde, shop);

	}

	private String erstelleRechnung(ArrayList<PurchaseItem> artikel, Customer c, Shop s) {
		
		String text = c + "\n";
		
		double gesamtpreis = 0;

		for (int i = 0; i < artikel.size(); i++) {
			
			text += artikel.get(i).menge + " x " + String.format("%-60s", artikel.get(i).bezeichnung)
					+ String.format("%14.2f", artikel.get(i).gesamtpreis) + " €\n";
			gesamtpreis += artikel.get(i).gesamtpreis;
		}
		text += "-".repeat(80);
		text += "\nSumme: " + String.format("%71.2f €", gesamtpreis);
		text += "\n\nVielen Dank für Ihren Einkauf\n";
		text += s;
		
		return text;
	}

	public String toString() {

		return this.rechnung;
	}

}
