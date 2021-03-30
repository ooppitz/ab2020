package de.die_gfi.robin.oop;

public class Laborpatient extends Patient implements Vitaminspiegel {
	
	int vitA; 
	int vitC;
	int vitD;
	
	
	/**
	 * 
	 * @param vorname
	 * @param nachname
	 * @param alter
	 * @param gewicht
	 * @param groesse
	 * @param diagnose
	 * @param symptome
	 * @param vitA
	 * @param vitC
	 * @param vitD
	 */
	public Laborpatient(String vorname, String nachname, int alter, double gewicht, double groesse, String diagnose, String symptome) {
		super(vorname,nachname,alter,gewicht,groesse,diagnose,symptome);
		vitaminAEinlesen();
		vitaminCEinlesen();
		vitaminDEinlesen();
	}

	public void vitaminAEinlesen() {
		this.vitA = (int) ((Math.random()*1500 )+ 1);
		
	}
	
	public int vitaminAAuslesen() {
		return this.vitA;
	}

	
	public void vitaminCEinlesen() {
		this.vitC = (int) ((Math.random()*20 )+ 1);
	}
	
	public int vitaminCAuslesen() {
		return  this.vitC;
	}

	public void vitaminDEinlesen() {
		this.vitD = (int) ((Math.random()*70 )+ 10);
		
	}
	
	public int vitaminDAuslesen() {
		return  this.vitD;
	}
	
	
	
	
	public String toString() {
		 String s = "";
		 s += super.toString();
		 s += "Vitamin A Spiegel: " + this.vitA + " µg/l\n";
		 s += "Vitamin C Spiegel: " + this.vitC + " mg/l\n";
		 s += "Vitamin D Spiegel: " + this.vitD + " µg/l\n";
		 return s;
	}
	
	
	
}
