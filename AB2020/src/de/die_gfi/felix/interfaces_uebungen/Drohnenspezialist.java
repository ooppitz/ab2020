package de.die_gfi.felix.interfaces_uebungen;

public class Drohnenspezialist extends Angestellter{
	
	public Drohnenspezialist(String name, String eMail, double gehalt, String abteilung) {
		super (name, eMail, gehalt, abteilung);			
		}
	
	public void spezialität(String aufgabe) {
		System.out.println(aufgabe);
	}

}
