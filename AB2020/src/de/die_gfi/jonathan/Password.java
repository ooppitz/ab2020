package de.die_gfi.jonathan;

import java.util.Arrays;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		System.out.println("Bitte Passwod eingeben:");
		int hashPaswd = readPassword();
		System.out.println("Bitte Anmelden");
		int hashEingabe = readPassword();
		if (hashEingabe == hashPaswd) {
			System.out.println("Anmeldung erfolgreich");
		} else {
			System.out.println("Anmeldung Fehlgeschlagen");
		}

	}

	@SuppressWarnings("resource")
	public static String eingabe() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		return s;
	}

	public static int readPassword() {
		String p = eingabe();
		char[] buchstaben = p.toCharArray();
		int hash = Arrays.hashCode(buchstaben);
		return hash;
	}
}
