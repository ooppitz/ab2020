package de.die_gfi.felix.shop;

public class Shop {
	
	String name;
	String adresse;
	int steuernummer;
	
	public Shop(String name, String adresse, int steuernummer) {
		this.name = name;
		this.adresse = adresse;
		this.steuernummer = steuernummer;
	}
	
	public String toString() {
		String result = new String("Name: " + name + ", Adrese: " + adresse + ", Steuernummer: " + steuernummer);
		return result;
	}
	
}
	