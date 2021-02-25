package de.die_gfi.felix;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Passwort {
	public static void main(String args[]) {

		ArrayList<String> hashListe = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		passwortFestlegen(hashListe, sc);

		boolean passwortKorrekt = passwortUeberpruefen(hashListe, sc);
		
		System.out.println(passwortKorrekt);
		
		sc.close();

	}

	/**
	 * Der Benutzer kann ein Passwort eingeben. Es wird ueberprueft anhand des Hashwertes,
	 * ob dieses in der Liste der Passwoerter vorhanden ist. Der Benutzer hat drei Versuche.
	 * Sind diese aufgebraucht, beendet sich das Programm.
	 * 
	 * @param passwortListe
	 * @param sc
	 */
	private static boolean passwortUeberpruefen(ArrayList<String> passwortListe, Scanner sc) {
		
		System.out.println("Bitte geben Sie das Passwort ein um Fortzufahren");
		int zaehler = 0;
		boolean schalter = false;
		boolean passwortKorrekt = false;
		
		while (schalter == false) {
			String passwort2 = sc.next();

			String hashcode2 = hashcodeErmittlung(passwort2);
			int index = passwortListe.indexOf(hashcode2);

			if (index != -1) {
				System.out.println("Korrekte Eingabe");
				schalter = true;
				passwortKorrekt = true;
				break;
			} else {
				System.out.println("Inkoorekte Eingabe");
				zaehler++;
				if (zaehler >= 3) {
					System.out.println("Drei Inkorrekte Eingabe versuche. Programm wird beendet");
					passwortKorrekt = false;
				} else {
					System.out.println("Versuchen Sie es erneut");
				}
			}
		}
		return passwortKorrekt;
	}

	/**
	 * Laesst den User ein erstes Passwort eingeben und speichert dessen Hashcode.
	 * Anschlieﬂend bekommt der User die Moeglichkeit, weitere Passwoerter einzugeben.
	 * Gegebenenfalls werden die Hashcodes gespeichert.
	 * 
	 * @param hashListe
	 * @param sc
	 */
	private static void passwortFestlegen(ArrayList<String> hashListe, Scanner sc) {

		String hashcode;
		String weiteresPasswortGewuenscht;
		
		do {
			System.out.println("Geben Sie ein Passwort ein: ");
			String passwort = sc.nextLine();

			hashcode = hashcodeErmittlung(passwort);

			int index = hashListe.indexOf(hashcode);
			if (index == -1) {
				System.out.println("Weiteres Passwort hinzugefuegt");
				hashListe.add(hashcode);
			} else {
				System.out.println("Passwort bereits Vorhanden");
			}

			System.out.println("Moechten Sie noch ein Passwort setzen? Wenn Ja geben Sie 'xxxJa' ein");
			weiteresPasswortGewuenscht = sc.nextLine();

		} while(weiteresPasswortGewuenscht.equals("xxxJa"));
		
		System.out.println("Ende von PasswortFestlegen()");
		
	}

	public static String hashcodeErmittlung(String passwort) {

		char[] passwortArr = passwort.toCharArray();
		int hashcode = Arrays.hashCode(passwortArr);
		String hashcodeString = String.valueOf(hashcode);
		return hashcodeString;

	}

}
