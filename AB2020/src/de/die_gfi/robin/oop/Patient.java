package de.die_gfi.robin.oop;

public class Patient extends Person {
	
	String diagnose;
	String symptome;
	
	
	static String UNBEKANNTE_DIAGNOSE;
	static String UNBEKANNTE_SYMPTOME;
	
	public Patient() {
		UNBEKANNTE_DIAGNOSE = null;
		UNBEKANNTE_SYMPTOME = null;
	}
	
	public Patient(String vorname, String nachname, int alter, double gewicht, double groesse, String diagnose, String symptome) {
		super(vorname,nachname,alter,gewicht,groesse);
		this.diagnose = diagnose;
		this.symptome = symptome;
		
		
	}
	
	
	public String toString() {
		String s = "";
		s += super.toString();
		s += (this.diagnose != UNBEKANNTE_DIAGNOSE) ? ("Diagnose: " + this.diagnose + "\n") : ("!Diagnose fehlt!\n");
		s += (this.symptome != UNBEKANNTE_SYMPTOME) ? ("Symptome: " + this.symptome + "\n") : ("!Symptome fehlen!\n");
		
		return s;
	}
	
	
	
	
}
