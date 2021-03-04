package de.die_gfi.robin.shop;

import java.util.ArrayList;

public class ProductCollection {

	int produktNummer;
	String bezeichnung;
	double preis;

	// Konstruktor Buch
	public ProductCollection(Buch b) {
		this.bezeichnung = b.titel + " von " + b.author;
		this.preis = b.preis;
	}

	// Konstruktor Getraenk
	public ProductCollection(Getraenk g) {
		this.bezeichnung = g.marke;
		this.preis = g.preis;
	}

	public String toString() {
		return produktNummer + " " + bezeichnung + " " + preis + " €\n";
	}

	/**
	 * Erstellt eine vorgefertigte ArrayListe mit allen Produkten
	 * 
	 * @return ArrayList
	 */
	public static ArrayList<ProductCollection> createProductCollection() {

		ArrayList<ProductCollection> arrList = new ArrayList<ProductCollection>();
		Buch inferno = new Buch(14.0, "Inferno", "Dante Alighieri");
		Buch harryPotter = new Buch(11.0, "Harry Potter", "J.K.Rowling");
		Buch paradiso = new Buch(13.0, "Paradiso", "Dante Alighieri");
		Buch satanBibel = new Buch(14.0, "Die satanische Bibel", "Anton LaVey");
		Getraenk wasser = new Getraenk(0.6, 0.5, "Wasser");
		Getraenk bier = new Getraenk(2.0, 0.5, "Bier");
		Getraenk eistee = new Getraenk(1.5, 0.5, "Eistee");
		Getraenk wein = new Getraenk(5.0, 0.5, "Wein");

		ProductCollection item1 = new ProductCollection(inferno);
		ProductCollection item2 = new ProductCollection(harryPotter);
		ProductCollection item3 = new ProductCollection(paradiso);
		ProductCollection item4 = new ProductCollection(satanBibel);
		ProductCollection item5 = new ProductCollection(wasser);
		ProductCollection item6 = new ProductCollection(bier);
		ProductCollection item7 = new ProductCollection(eistee);
		ProductCollection item8 = new ProductCollection(wein);

		arrList.add(item1);
		arrList.add(item2);
		arrList.add(item3);
		arrList.add(item4);
		arrList.add(item5);
		arrList.add(item6);
		arrList.add(item7);
		arrList.add(item8);

		return arrList;

	}

}
