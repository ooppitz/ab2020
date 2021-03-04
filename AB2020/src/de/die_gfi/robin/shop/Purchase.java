package de.die_gfi.robin.shop;

import java.util.ArrayList;

public class Purchase {

	// Der String zur Ausgabe der Rechung
	String bezeichnung;

	// Die ArrayList wird in einen String übernommen
	// Der String wird in dem Konstruktor von Purchase aufgebaut
	public Purchase(ArrayList<PurchaseItem> arrList, Customer c, Shop s) {
		bezeichnung = c + "\n";
		double gesamt = 0;

		for (int i = 0; i < arrList.size(); i++) {
			bezeichnung += arrList.get(i).menge + " x " + String.format("%-60s", arrList.get(i).bezeichnung)
					+ String.format("%14.2f", arrList.get(i).preis) + " €\n";
			gesamt += arrList.get(i).preis;
		}
		bezeichnung += "-".repeat(80);
		bezeichnung += "\nSumme: " + String.format("%71.2f €", gesamt);
		bezeichnung += "\n\nVielen Dank für Ihren Einkauf\n";
		bezeichnung += s;

	}

	public String toString() {

		return this.bezeichnung;
	}

}
