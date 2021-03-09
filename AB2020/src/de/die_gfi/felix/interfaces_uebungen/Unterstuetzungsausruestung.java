package de.die_gfi.felix.interfaces_uebungen;

public class Unterstuetzungsausruestung extends Angestellter{
	
	public Unterstuetzungsausruestung(String name, String eMail, double gehalt, String abteilung) {
		super (name, eMail, gehalt, abteilung);			
		}
	
	public void spezialitaet(String aufgabe) {
		System.out.println(aufgabe);
	}

}
