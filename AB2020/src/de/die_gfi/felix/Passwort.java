package de.die_gfi.felix;

import java.util.Scanner;
import java.util.Arrays;

public class Passwort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String passwort = sc.next();
		int hashcode = hashcodeErmittlung(passwort);
		
		System.out.println("Bitte geben Sie das Passwort ein um Fortzufahren");
		
		int zaehler = 0;
		boolean schalter = false;
		
		
		while(schalter == false ) {
			String passwort2 = sc.next();
		
			int hashcode2 = hashcodeErmittlung(passwort2);
			if(hashcode == hashcode2) {
				System.out.println("Korrekte Eingabe");
				schalter = true;
				break;
			} else {
				System.out.println("Inkoorekte Eingabe");
				zaehler++;
				if(zaehler >= 3) {
					System.out.println("Drei Inkorrekte Eingabe versuche. Programm wird beendet");
					System.exit(0);
				} else {
					System.out.println("Versuchen Sie es erneut");
				}
		}
		}
	
	
	}
	
	public static int hashcodeErmittlung(String passwort) {
		char[] passwortArr = passwort.toCharArray();
		int hashcode = Arrays.hashCode(passwortArr);
		return hashcode;
		
	}
	
}
