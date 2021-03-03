package de.die_gfi.robin.shop;

public class ProductCollection {
	
	String bezeichnung;
	double preis;
	
	
	public ProductCollection(Buch b) {
		this.bezeichnung = b.titel + " von " + b.author;
		this.preis = b.preis; 
	}
	
	public ProductCollection(Getraenk g) {
		this.bezeichnung = g.marke;
		this.preis = g.preis;
	}
	
}
