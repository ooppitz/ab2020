package de.die_gfi.felix.shop;

import java.util.ArrayList;

public class Purchase {

	ArrayList<PurchaseItem> itemList;
	double preisEinkauf;

	public Purchase(ArrayList<PurchaseItem> itemList) {
		this.itemList = itemList;
		double preis1 = 0;
		for (int i = 0; i < itemList.size(); i++) {
			preis1 = preis1 + itemList.get(i).preisGesamt;
			this.preisEinkauf = preis1;
		}
	}

	public String toString() {
		String result = new String();
		String produktName = new String();
		String anzahl = new String();
		String preis = new String();
		
		produktName = String.format("%-50s", "Produktbezeichnung");
		anzahl = String.format("%8s", "Anzahl");
		preis = String.format("%10s", "Preis");
		
		result = result + (produktName + anzahl + preis + "\n");
		
		for (int i = 0; i < itemList.size(); i++) {
			produktName = String.format("%-50s", itemList.get(i).p.name);
			anzahl = String.format("%8d", itemList.get(i).stueckzahl);
			preis = String.format("%10.2f", itemList.get(i).preisGesamt);
			
			result = result + (produktName + anzahl + preis + "\n");
			
		}
		result = result + "Gesamtpreis: " + this.preisEinkauf;
		return result;
	}

	public String erstellenRechnung(Customer c, Shop s) {

		String result = new String();
		result = result + "\nRECHNUNG\n\n";
		result += "Rechnungssteller:\n" + s.toString() + "\n\n";
		result += "Rechnungsempfänger:\n" + c.toString() + "\n\n";
		result += this.toString();
		return result;

	}
}
