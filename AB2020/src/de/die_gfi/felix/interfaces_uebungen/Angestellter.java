package de.die_gfi.felix.interfaces_uebungen;

public abstract class Angestellter {
	
	String name;
	String eMail;
	double gehalt;
	String abteilung;
	
	public Angestellter(String name, String eMail, double gehalt, String abteilung) {
		this.name = name;
		this.eMail = eMail;
		this.gehalt = gehalt;
		this.abteilung = abteilung;
	}
	
	public abstract void spezialität(String aufgabe);

}
