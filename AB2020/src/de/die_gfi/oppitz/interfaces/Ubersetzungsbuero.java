package de.die_gfi.oppitz.interfaces;

public class Ubersetzungsbuero {

	public static void main(String[] args) {
		
		Angestellter anna = new SpanischUebersetzer("Anna", 3000, "anna@traducciones.es");
		Angestellter paolo = new ItalienischUebersetzer("Paolo", 3000, "paolo@traduzioni.it");

		System.out.println("Anna: ");
		anna.spezialitaetDesAngestellten("Guten Morgen!");
		
		System.out.println();
		System.out.println("Paolo:");
		paolo.spezialitaetDesAngestellten("Auf Wiedersehen!");

	}

}


 abstract class Angestellter {
	
	String name; 
	int gehalt;
	String email;
	
	public Angestellter(String name, int gehalt, String email) {
		this.name = name;
		this.gehalt = gehalt;
		this.email = email;
	}
	
	abstract void spezialitaetDesAngestellten(String aufgabe);
	
}

class SpanischUebersetzer extends Angestellter {

	public SpanischUebersetzer(String name, int gehalt, String email) {
		super(name, gehalt, email);
	
	}

	@Override
	void spezialitaetDesAngestellten(String aufgabe) {
	
		if (aufgabe.equals("Guten Morgen!")) {
			System.out.println("¡Buenos días!");
		}	
		
		if (aufgabe.equals("Auf Wiedersehen!")) {
			System.out.println("¡Adios!");
		}
	}	
	
}

class ItalienischUebersetzer extends Angestellter {

	public ItalienischUebersetzer(String name, int gehalt, String email) {
		super(name, gehalt, email);
	
	}

	@Override
	void spezialitaetDesAngestellten(String aufgabe) {
	
		if (aufgabe.equals("Guten Morgen!")) {
			System.out.println("Buon giorno!");
		}	
		
		if (aufgabe.equals("Auf Wiedersehen!")) {
			System.out.println("Arrivederci!");
		}
	}	
	
}
