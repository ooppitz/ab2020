package de.die_gfi.jonathan.shop;

public class Product {
	String name;
	double price;
	int produktnumber;
// die Produktnummer wird erst zugewiesen wenn das Produkt in das Sortiement aufgenomen wurde

	public Product(String bezeicnbung, double preis) {
		name = bezeicnbung;
		price = preis;
		produktnumber = -1;
		
	}
	// add to storage
	// public void add(int anzahl) {

	// }

	// vergibt eine Productnummer anhand des Index im Storage vor der aufnahme ins Lager nicht belegt
	private void getProduktNummer(int zahl) {
		produktnumber=zahl;
	}

	public String toString() {
		return "Name: " + name + " Produktnummer: " + produktnumber + " preis: " + price;
	}
}
