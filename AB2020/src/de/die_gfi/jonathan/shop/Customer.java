package de.die_gfi.jonathan.shop;

public class Customer {
	Purchase buying = new Purchase();
	String surename;
	String name;
	String mail;
	String country;
	String location;
	String street;
	int house;
	String account;

	public Customer(String s, String n) {
		surename = s;
		name = n;
		// mail=m; vorübergehend vereinfacht_,String m
		account=n + "." + s;
		mail = account + "@shop.com";
	}

// Set adress
	public void setAdress(String land, String ort, String Straße, int haus) {
		country = land;
		location = ort;
		street = Straße;
		house = haus;
	}

	public String toString() {
		return name + " " + surename + " " + mail;
	}

// zeilenweise Ausgabe der Produkte
	public void printPurchase() {
		System.out.println("\n"+this+"\nIm Warenkorb:");
		buying.printPurchase();

	}

// ein Purchase Item hinzufügen
	public void addPurchaseItem(int index,ProductCollection lager) {
		PurchaseItem objekt=lager.getProduct(index);
		lager.send(index);
		this.buying.addItem(objekt);
	}

	// erstellt eine Rechnung unter nennung des Produktnamens
	public double createBill() {
		System.out.println("\nRechnung\nKunde:"+name+" "+surename);
		double summ = buying.getItems();
		System.out.println("________________");
		System.out.println(summ + "  Gesamtpreis");
		return summ;
	}

}
