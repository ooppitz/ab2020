package de.die_gfi.jonathan.shop;

public class Product {
	String name;
	double price;
	int produktnumber;
	private int productCount = 0;

	public Product(String bezeicnbung, double preis) {
		name = bezeicnbung;
		price = preis;
		produktnumber = countProducts();
		;
	}

	// vergibt eine Productnummer durch durchzälen der produkte
	private int countProducts() {
		productCount++;
		return productCount - 1;
	}

	public String toString() {
		return "Name: " + name + " prdnm: " + produktnumber + " preis: " + price;
	}
}
