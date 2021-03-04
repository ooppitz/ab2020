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
		for (int i = 0; i < itemList.size(); i++) {
			result = result + "Name: " + itemList.get(i).p.name + ", Stueckzahl: " + itemList.get(i).stueckzahl
					+ ", Gesamtpreis Artikel: " + itemList.get(i).preisGesamt + "\n";
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
