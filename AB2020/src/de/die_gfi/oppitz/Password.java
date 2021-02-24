package de.die_gfi.oppitz;

import java.util.Arrays;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		int hash = readPassword();
		System.out.println("Hash = " + hash);

		int hash2 = readPassword();
		System.out.println("Hash = " + hash2);

		if (hash == hash2) {
			System.out.println("Die Passwörter sind gleich.");
		} else {
			System.out.println("Die Passwörter unterscheiden sich.");
		}

	}

	public static int readPassword() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein Passwort ein: ");
		String password = sc.nextLine();
		char[] arr = password.toCharArray();
		int hash = Arrays.hashCode(arr);
		return hash;

	}

}
