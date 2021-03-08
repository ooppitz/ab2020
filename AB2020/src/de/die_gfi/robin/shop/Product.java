package de.die_gfi.robin.shop;

public class Product implements CounterInterface {

	static int count;
	double preis;
	int produktnummer;
	String bezeichnung;
	
	
	public Product(int pNummer,double preis, String bezeichnung) {
		
		this.produktnummer = pNummer;
		this.preis = preis;
		this.bezeichnung = bezeichnung;
	}


	@Override
	public int getCount() {
		
		return 0;
	}
	
	
}
