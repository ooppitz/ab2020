package de.die_gfi.robin.interfaces;

public abstract class Angestellter {
	String name;
	double gehalt;
	String email;
	
	abstract void spezialitaetDesAngestellten(String aufgabe);
	
}


class Reinigungskraft extends Angestellter {

	
	
	void spezialitaetDesAngestellten(String aufgabe) {
		System.out.println("Ich kann " + aufgabe);
		
	}
	
}

class Bueroarbeiter extends Angestellter {
	
	void spezialitaetDesAngestellten(String aufgabe) {
		System.out.println("Ich kann " + aufgabe);
	}
	
}

class Abteilungsleiter extends Angestellter {
	
	void spezialitaetDesAngestellten(String aufgabe) {
		System.out.println("Ich kann " + aufgabe);
	}
}

class App {
	public static void main(String[] args) {
		
		Bueroarbeiter tom = new Bueroarbeiter();
		tom.spezialitaetDesAngestellten("Tasten drücken");
		
		
		Abteilungsleiter peter = new Abteilungsleiter();
		peter.spezialitaetDesAngestellten("Kommandos geben");
		
		
		Reinigungskraft karsten = new Reinigungskraft();
		karsten.spezialitaetDesAngestellten("sauber machen");
	}
}

