package de.die_gfi.robin.oop;

public class Labor {
	
	static void ueberpruefeLaborwerte(Laborpatient pat) {
		
		System.out.println("\nPatient: " + pat.vorname + " " + pat.nachname + "\n");
		
		
		
		if(pat.vitA < 100) {
			System.out.println(String.format("Vitamin A: %d µg/l liegt unter dem Normalwert", pat.vitA));
		}
		else if (pat.vitA > 1000) {
			System.out.println(String.format("Vitamin A: %d µg/l liegt über dem Normalwert", pat.vitA));
		}
		else {
			System.out.println(String.format("Vitamin A: %d µg/l liegt innerhalb des Normalwertes", pat.vitA));
		}
		
		if(pat.vitC < 5) {
			System.out.println(String.format("Vitamin C: %d mg/l liegt unter dem Normalwert", pat.vitC));
		}
		else if (pat.vitC > 15) {
			System.out.println(String.format("Vitamin C: %d mg/l liegt über dem Normalwert", pat.vitC));
		}
		else {
			System.out.println(String.format("Vitamin C: %d mg/l liegt innerhalb des Normalwertes", pat.vitC));
		}
		
		if(pat.vitD < 30) {
			System.out.println(String.format("Vitamin D: %d µg/l liegt unter dem Normalwert", pat.vitD));
		}
		else if (pat.vitD > 50) {
			System.out.println(String.format("Vitamin D: %d µg/l liegt über dem Normalwert", pat.vitD));
		}
		else {
			System.out.println(String.format("Vitamin D: %d µg/l liegt innerhalb des Normalwertes", pat.vitD));
		}
		
		System.out.println("\nNormwerte:\nVitamin A: 100-1000µg/l\nVitamin C: 5-15mg/l\nVitamin D: 30-50µg/l\n");
		
	}
}
