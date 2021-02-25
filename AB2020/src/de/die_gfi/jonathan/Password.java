package de.die_gfi.jonathan;

import java.util.Arrays;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] pswdHash = new int[10];
		int[] pswdVerwendet = new int[10];
		Arrays.fill(pswdVerwendet, 0);
		
		boolean goOn;
		do {
			System.out.println(
					"Bitte geben Sie 'login' oder 'pwd' oder 'mpwd' an, je nachdem welche Aktion sie ausführen mÃ¶chten:");
			String aktion = sc.next();
			if (aktion.equalsIgnoreCase("pwd")) {
				changePaswd(sc, pswdHash);
			} else if (aktion.equalsIgnoreCase("mpwd")) {
				changeMasterPaswd(sc, pswdHash);
			} else if (aktion.equalsIgnoreCase("login")) {
				login(sc, pswdHash, pswdVerwendet);
			} else {
				System.out.println("Falsche Eingabe");
			}

			System.out.println("Soll da Programm beendet werden (ja/nein)?");
			
			goOn = !sc.next().equalsIgnoreCase("ja");			

		} while (goOn == true);

		System.out.println("Das Programm wurde beendet");
	}

	private static void login(Scanner sc, int[] pswd, int[] verwendet) {
		int zeiger;
		System.out.println("Bitte den Account angeben");
		zeiger = sc.nextInt();
		System.out.println("Bitte Anmelden");
		int hashEingabe = readPassword(sc);
		if (hashEingabe == pswd[zeiger]) {
			System.out.println("Anmeldung erfolgreich\nbis jetzt " + verwendet[zeiger] + " Anmeldungen");
			verwendet[zeiger]++;
		} else {
			System.out.println("Anmeldung Fehlgeschlagen");
		}
	}

	private static void changePaswd(Scanner sc, int[] pswd) {
		int zeiger;
		System.out.println("Bitte den Account angeben");
		zeiger = sc.nextInt();
		System.out.println("Bitte Passwod eingeben:");
		pswd[zeiger] = readPassword(sc);
	}

	private static void changeMasterPaswd(Scanner sc, int[] pswd) {
		// auch forsellbar mit für jeden account individuelle zufallszahlen
		System.out.println("Bitte das Default Password für alle accounts festlegen");
		int ersatz = readPassword(sc);
		Arrays.fill(pswd, ersatz);
	}

	public static int readPassword(Scanner sc) {
		String p = sc.next();
		char[] buchstaben = p.toCharArray();
		int hash = Arrays.hashCode(buchstaben);
		return hash;
	}
}
