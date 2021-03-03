package de.die_gfi.felix.shop;

public class PurchaseItem {
	
	Product p;
	int stueckzahl;
	double preisGesamt;
	
	public PurchaseItem(Product p, int stueckzahl) {
		this.p = p;
		this.stueckzahl = stueckzahl;
		this.preisGesamt = p.preis * stueckzahl;
	}
	
	public String toString() {
		String result = new String("Produkt: " + p.name + ", Anzahl: " + stueckzahl  + ", Gesamtpreis Posten: " + preisGesamt);			
		return result;
	}

}
