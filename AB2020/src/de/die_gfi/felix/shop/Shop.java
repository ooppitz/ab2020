package de.die_gfi.felix.shop;

import java.util.ArrayList;

public class Shop {
	
	ArrayList<Customer> kundenListe;
	String name;
	String adresse;
	int steuernummer;
	
	public Shop(String name, String adresse, int steuernummer) {
		
		this.name = name;
		this.adresse = adresse;
		this.steuernummer = steuernummer;
		this.kundenListe = new ArrayList<Customer>();
		
	}
	
	public String toString() {
		String result = new String("Name: " + name + ", Adrese: " + adresse + ", Steuernummer: " + steuernummer);
		return result;
	}
	
	public void addCustumer(Customer c) {
		kundenListe.add(c);
	}
	
	public ArrayList<Customer> returnCustumerList() {
		return kundenListe;
	}
	
	public void printCustumerList() {
		for(Customer c : kundenListe) {
			System.out.println(c);
		}
	}
}
	