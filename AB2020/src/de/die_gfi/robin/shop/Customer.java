package de.die_gfi.robin.shop;

public class Customer {
	
	String vorname;
	String nachname;
	String strasse;
	String plz;
	String ort;
	boolean vipKunde;
	
	
	public Customer(String v, String n, String s, String p, String o, boolean vip) {
		this.vorname = v;
		this.nachname = n;
		this.strasse = s;
		this.plz = p;
		this.ort = o;
		this.vipKunde = vip;
	}
	
	public String toString() {
		return "Kunde: " + this.vorname + " " + this.nachname + " " + this.strasse + " " + this.plz + " " + this.ort + " VIP-Status: " + this.vipKunde;
	}
	
	
	
	
}
