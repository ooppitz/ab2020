package de.die_gfi.robin.oop;

public class Laborpatient extends Patient implements Vitaminspiegel {

	int vitA; 
	int vitC;
	int vitD;
	
	public Laborpatient(String vorname, String nachname, int alter, double gewicht, double groesse, String diagnose, String symptome) {
		super(vorname,nachname,alter,gewicht,groesse,diagnose,symptome);
		
	}

	
	public int vitaminAAuslesen() {
		this.vitA = (int) ((Math.random()*1500 )+ 1);
		
		return this.vitA;
	}

	
	public int vitaminCAuslesen() {
		this.vitC = (int) ((Math.random()*20 )+ 1);
		return  this.vitC;
	}

	
	public int vitaminDAuslesen() {
		this.vitD = (int) ((Math.random()*70 )+ 10);
		return  this.vitD;
	}
	
	
	
	
}
