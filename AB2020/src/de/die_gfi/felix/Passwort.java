package de.die_gfi.felix;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Passwort {
	public static void main(String args[]) {
		
		ArrayList<String> passwortListe = new ArrayList<String>();
		boolean schalter2 = false;
		String hashcode = "";
		Scanner sc = new Scanner(System.in);
		
		while(schalter2 == false) {
			
			String passwort = sc.next();
			
			hashcode = hashcodeErmittlung(passwort);
			
			if(passwortListe.size() > 0) {
				int index = passwortListe.indexOf(hashcode);
				if(index == -1) {
					System.out.println("Weiteres Passwort hinzugefügt");
					passwortListe.add(hashcode);
				} else {
					System.out.println("Passwort bereits Vorhanden");
				}
				
			} else {
				passwortListe.add(hashcode);
			}
			
			System.out.println("Möchten Sie noch ein Passwort setzen? Wenn Ja geben Sie 'xxxJa' ein");
			String weiteresPasswortGewünscht = sc.next();
			if(weiteresPasswortGewünscht.equals("xxxJa")) {
				schalter2 = false;
			} else {
				schalter2 = true;
			}
		}	
		
		//------------------------
		
		System.out.println("Bitte geben Sie das Passwort ein um Fortzufahren");
		int zaehler = 0;
		boolean schalter = false;
		
		while(schalter == false ) {
			String passwort2 = sc.next();
		
			String hashcode2 = hashcodeErmittlung(passwort2);
			int index = passwortListe.indexOf(hashcode2);
			
			if(index != -1) {
				System.out.println("Korrekte Eingabe");
				schalter = true;
				break;
			} else {
				System.out.println("Inkoorekte Eingabe");
				zaehler++;
				if(zaehler >= 3) {
					System.out.println("Drei Inkorrekte Eingabe versuche. Programm wird beendet");
					sc.close();
					System.exit(0);
				} else {
					System.out.println("Versuchen Sie es erneut");
				}
			}
		}
	sc.close();
	
	}
	
	public static String hashcodeErmittlung(String passwort) {
		char[] passwortArr = passwort.toCharArray();
		int hashcode = Arrays.hashCode(passwortArr);
		String hashcodeString = String.valueOf(hashcode);
		return hashcodeString;
		
	}
	
	
	
}
