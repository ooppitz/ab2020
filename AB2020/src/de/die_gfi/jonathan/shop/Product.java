package de.die_gfi.jonathan.shop;

public class Product implements Discount{
	String name;
	protected double price;
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
	@SuppressWarnings("unused")
	private void getProduktNummer(int zahl) {
		produktnumber=zahl;
	}

	public String toString() {
		return "Name: " + name + " Produktnummer: " + produktnumber + " preis: " + price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public boolean isDiscountPossible() {
		return false;
	}
	@Override
	public double getMaximumDiscount(int menge) {
		return price;
	}
	
	
}
