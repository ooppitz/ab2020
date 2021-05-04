package de.die_gfi.felix.PartnerHotel;

import java.util.ArrayList;

public class Hotel {
	
	private String name;
	private ArrayList<Person> gaesteliste = new ArrayList<Person>();
	private int kapazitaet;
	
	public Hotel(String name) {
		this.name = name;
		this.kapazitaet = 5;
	}
	public Hotel(String name, int kapazitaet) {
		super();
		this.name = name;
		if(kapazitaet > 0) {
		this.kapazitaet = kapazitaet;
		} else { 
			System.out.println("hotel mit zimmeranzahl Kleiner oder Gleich Null ist nicht möglich\n Kapazität wurde auf 1 gesetzt");
			this.kapazitaet = 1;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Person> getGaesteliste() {
		return gaesteliste;
	}
	public void setGaesteliste(ArrayList<Person> gaesteliste) {
		this.gaesteliste = gaesteliste;
	}
	public int getfreieBetten() {
			return this.kapazitaet - this.gaesteliste.size();
	}
	public void einmieten(Person p) {
		if(this.getfreieBetten() <= 0) {
			System.out.println("Wir sind leider voll. Bitte versuchen Sie es eine anderes Mal");
		} else {
			if(gaesteliste.contains(p)) {
				System.out.println("diese Person ist bereits im Hotel eingemietet");
			} else {
				gaesteliste.add(p);
			}
		}
	}
	public void abreisen(Person p) {
		if(gaesteliste.contains(p)) {
			gaesteliste.remove(p);
		} else {
			System.out.println("Die angegebene Person ist nicht im Hotel zugast. Deswegen kann sie auch nicht abreisen.");
		}
	}
	public String toString() {
		String s = new String("Hotel: " + name + "\nverbleibende Kapazität: " + this.getfreieBetten() + " von 5\n\n");
		s = s + status();
		return s;
	}
	public String status() {
		String s = new String("Gaesteliste:\n");
		
		for(Person p : gaesteliste) {
			s = s + p.getName() + " " + p.getVorname() + "\n";
		}
		return s;
	}
	
}
