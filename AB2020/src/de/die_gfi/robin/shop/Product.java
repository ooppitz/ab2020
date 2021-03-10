package de.die_gfi.robin.shop;

public class Product {

	
	protected double preis;
	private int produktnummer;
	private String bezeichnung;
	
	
	public Product(int pNummer,double preis, String bezeichnung) {
		
		this.produktnummer = pNummer;
		this.preis = preis;
		this.bezeichnung = bezeichnung;
	}


	public String getBezeichnung() {
		return bezeichnung;
	}


	public int getProduktnummer() {
		return produktnummer;
	}


	
	
	
	
}
