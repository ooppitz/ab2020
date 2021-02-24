package de.die_gfi.felix;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Passwort {
	public static void main(String args[]) {

		ArrayList<String> hashListe = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		passwortFestlegen(hashListe, sc);

		passwortUeberpruefen(hashListe, sc);

		sc.close();

	}

	/**
	 * Der Benutzer kann ein Passwort eingeben. Es wird überprüft anhand des Hashwertes,
	 * ob dieses in der Liste der Passwörter vorhanden ist. Der Benutzer hat drei Versuche.
	 * Sind diese aufgebraucht, beendet sich das Programm.
	 * 
	 * @param passwortListe
	 * @param sc
	 */
	private static void passwortUeberpruefen(ArrayList<String> passwortListe, Scanner sc) {
		
		System.out.println("Bitte geben Sie das Passwort ein um Fortzufahren");
		int zaehler = 0;
		boolean schalter = false;

		while (schalter == false) {
			String passwort2 = sc.next();

			String hashcode2 = hashcodeErmittlung(passwort2);
			int index = passwortListe.indexOf(hashcode2);

			if (index != -1) {
				System.out.println("Korrekte Eingabe");
				schalter = true;
				break;
			} else {
				System.out.println("Inkoorekte Eingabe");
				zaehler++;
				if (zaehler >= 3) {
					System.out.println("Drei Inkorrekte Eingabe versuche. Programm wird beendet");
					sc.close();
					System.exit(0);
				} else {
					System.out.println("Versuchen Sie es erneut");
				}
			}
		}
	}

	/**
	 * Lässt den User ein erstes Passwort eingeben und speichert dessen Hashcode.
	 * Anschließend bekommt der User die Möglichkeit, weitere Passwörter einzugeben.
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
				System.out.println("Weiteres Passwort hinzugef�gt");
				hashListe.add(hashcode);
			} else {
				System.out.println("Passwort bereits Vorhanden");
			}

			System.out.println("M�chten Sie noch ein Passwort setzen? Wenn Ja geben Sie 'xxxJa' ein");
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
