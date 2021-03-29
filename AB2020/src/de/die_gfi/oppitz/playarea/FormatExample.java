package de.die_gfi.oppitz.playarea;

import java.util.Scanner;

public class FormatExample {

	public static void main(String[] args) {
	
	    System.out.println(formatiereZeile(33, 33.22, "Butterkekse"));
	    System.out.println(formatiereZeile(99999, 3333.22, "Mineralwasser"));
	    System.out.println(formatiereZeile(12, 3.99, "Haarbürste"));

	}

	private static String formatiereZeile(int intAnzahl, double doublePreis, String prod) {
		
		String produkt = String.format("%-50s", prod); // Mit 50 Zeichen formatieren
	    String anzahl = String.format("%5d", intAnzahl);    // Mit 5 Zeichen formatieren
	    String preis = String.format("%8.2f", doublePreis);  // Mit 8 Zeichen formatieren
	    
	    String zeile = produkt + " " + anzahl + " Stück "+ preis + " Euro";
		return zeile;
	}
	



}
