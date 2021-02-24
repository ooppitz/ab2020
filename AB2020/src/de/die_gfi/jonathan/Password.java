package de.die_gfi.jonathan;

import java.util.Arrays;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] pswd = new int[10];
		int[] verwendet = new int[10];
		int zeiger = 0;
		Arrays.fill(verwendet, 0);
		boolean work = true;
		do {
			System.out.println("Bitte geben sie login oder paswd an je nachdem welsche aktion sie ausführen möchten");
			String aktion = sc.next();
			if (aktion.equalsIgnoreCase("paswd")) {
				changePaswd(sc, pswd);
			} else if (aktion.equalsIgnoreCase("login")) {
				login(sc, pswd, verwendet);
			} else {
				System.out.println("Falsche eingeabe");
			}

			System.out.println("Soll da Programm beendet werden");
			if (sc.next() == "Ja") {
				work = false;
			}

		} while (work == true);

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

	public static int readPassword(Scanner sc) {
		String p = sc.next();
		char[] buchstaben = p.toCharArray();
		int hash = Arrays.hashCode(buchstaben);
		return hash;
	}
}
