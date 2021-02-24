package de.die_gfi.franziska;

import java.util.Scanner;
import java.util.Arrays;

public class Passwort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte Passwort eingeben");

		String passwort1 = scanner.nextLine();

		System.out.println("Bitte Passwort erneut eingeben");

		String passwort2 = scanner.nextLine();

		scanner.close();

		char[] zeichen1 = passwort1.toCharArray();

		char[] zeichen2 = passwort2.toCharArray();

		int hash1 = Arrays.hashCode(zeichen1);

		int hash2 = Arrays.hashCode(zeichen2);

		if (hash1 == hash2) {

			System.out.println("Die Passwörter sind gleich.");
		} else {

			System.out.println("Die Passwörter unterscheiden sich.");
		}

	}

}
