package de.die_gfi.jonathan.interfaces;

public class Hausmeister extends Angestellter {

	public Hausmeister(String name, double gehalt) {
		super(name, gehalt);
	}

	@Override
	void spezialitaetDesAngestellten(String aufgabe) {
		System.out.println("Meine Spezialität ist es den Laubbläser zu bedienen");
	}

	
}

