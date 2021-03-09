package de.die_gfi.jonathan.interfaces;

public class Asistent extends Angestellter {

	public Asistent(String name, double gehalt) {
		super(name, gehalt);
	}

	@Override
	void spezialitaetDesAngestellten(String aufgabe) {
		System.out.println("Meine Spezalität ist es Akten zu schrederen");
	}

}
