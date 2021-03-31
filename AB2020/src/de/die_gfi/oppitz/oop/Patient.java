package de.die_gfi.oppitz.oop;

public class Patient extends Person {

	String symptome; 
	
	public Patient(String vorname, String nachname, String symptome) {
		
		super(vorname, nachname);
		
		this.symptome = symptome;
	}
}
