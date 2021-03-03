package de.die_gfi.felix.shop;

import java.util.ArrayList;

public class Shop {
	
	ArrayList<Custumer> kundenListe;
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
	
	public void addCustumer(Custumer c) {
		kundenListe.add(c);
	}
	
	public ArrayList<Custumer> returnCustumerList() {
		return kundenListe;
	}
	
	public void printCustumerList() {
		for(Custumer c : kundenListe) {
			System.out.println(c);
		}
	}
}
	