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
		
		Buch inferno = new Buch(0,14.0, "Inferno", "Dante Alighieri");
		Buch harryPotter = new Buch(1,11.0, "Harry Potter", "J.K.Rowling");
		Buch paradiso = new Buch(2,13.0, "Paradiso", "Dante Alighieri");
		Buch satanBibel = new Buch(3,14.0, "Die satanische Bibel", "Anton LaVey");
		Getraenk wasser = new Getraenk(4,0.6, 0.5, "Wasser");
		Getraenk bier = new Getraenk(5,2.0, 0.5, "Bier");
		Getraenk eistee = new Getraenk(6,1.5, 0.5, "Eistee");
		Getraenk wein = new Getraenk(7,5.0, 0.5, "Wein");
		
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

}
