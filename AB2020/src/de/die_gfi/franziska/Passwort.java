package de.die_gfi.franziska;

import java.util.Scanner;
import java.util.Arrays;

public class Passwort {

	public static void main(String[] args) {

		int hash1; 
		int hash2;
		  
		hash1 = readPassword();
		
		hash2 = readPassword();
		
		int[] passwords = {hash1, hash2};
		

		if (hash1 == hash2) {

			System.out.println("Die Passwörter sind gleich.");
		} else {

			System.out.println("Die Passwörter unterscheiden sich.");
		}

	}

	private static int readPassword(){
		int hash1;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte Passwort eingeben");
	
		String passwort1 = scanner.nextLine();

		char[] zeichen1 = passwort1.toCharArray();
		
		hash1 = Arrays.hashCode(zeichen1);
		
		return hash1;
	}

}
