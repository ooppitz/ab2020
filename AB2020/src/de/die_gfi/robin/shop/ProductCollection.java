package de.die_gfi.robin.shop;

import java.util.ArrayList;

public class ProductCollection {

	ArrayList<Product> lager;
	
	public ProductCollection() {
		
		this.lager = createProductCollection();
		
	}
	
	public  ArrayList<Product> getProducts() {
		
		return lager;
	}
	/**
	 * Erstellt eine vorgefertigte ArrayListe mit allen Produkten
	 * 
	 * @return ArrayList
	 */
	public  ArrayList<Product> createProductCollection() {
		
		ArrayList<Product> produkte = new ArrayList<Product>();
		
		Buch inferno = new Buch(14.0, "Inferno", "Dante Alighieri");
		Buch harryPotter = new Buch(11.0, "Harry Potter", "J.K.Rowling");
		Buch paradiso = new Buch(13.0, "Paradiso", "Dante Alighieri");
		Buch satanBibel = new Buch(14.0, "Die satanische Bibel", "Anton LaVey");
		Getraenk wasser = new Getraenk(0.6, 0.5, "Wasser");
		Getraenk bier = new Getraenk(2.0, 0.5, "Bier");
		Getraenk eistee = new Getraenk(1.5, 0.5, "Eistee");
		Getraenk wein = new Getraenk(5.0, 0.5, "Wein");

		produkte.add(inferno);
		produkte.add(harryPotter);
		produkte.add(paradiso);
		produkte.add(satanBibel);
		produkte.add(wasser);
		produkte.add(bier);
		produkte.add(eistee);
		produkte.add(wein);
		

		return produkte;

	}


	/** Druckt alle Produkte des Lagers aus */
	public String toString() {
		return ""; // produktNummer + " " + bezeichnung + " " + preis + " €\n";
	}
}
