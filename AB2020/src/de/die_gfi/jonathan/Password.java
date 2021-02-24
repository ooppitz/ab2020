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
		boolean work= true;
		do {
		System.out.println
		("Bitte geben sie login oder paswd an je nachdem welsche aktion sie ausführen möchten");
		String aktion=sc.next();
		if (aktion.equalsIgnoreCase("paswd")) {
			System.out.println("Bitte den Account angeben");
			zeiger = sc.nextInt();
			System.out.println("Bitte Passwod eingeben:");
			pswd[zeiger] = readPassword();
		} else if (aktion.equalsIgnoreCase("login")) {
			System.out.println("Bitte den Account angeben");
			zeiger = sc.nextInt();
			System.out.println("Bitte Anmelden");
			int hashEingabe = readPassword();
			if (hashEingabe == pswd[zeiger]) {
				System.out.println("Anmeldung erfolgreich\nbis jetzt " + verwendet[zeiger] + " Anmeldungen");
				verwendet[zeiger]++;
		}}
		else {
			System.out.println("Falsche eingeabe");
		}
		
		System.out.println("Soll da Programm beendet werden");
		if (sc.next()=="Ja") {
			work=false;
		}
		
		} while (work==true);

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
