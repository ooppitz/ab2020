package de.die_gfi.robin;

import java.util.Arrays;
import java.util.Scanner;
import de.die_gfi.util.*;

public class Passwort {
	public static void main(String[] args) {
		
		System.out.println("Legen Sie ein Passwort fest: ");
		Scanner input = new Scanner(System.in);
		
		int hash = readPassword(input);
		
		
		System.out.println("Geben Sie das Passwort ein: ");
		
		int hashNeu = readPassword(input);
		
		
		if (hash == hashNeu) {
			System.out.println("Korrekte Eingabe");
		}
		else
			System.out.println("Inkorrekte Eingabe");
		
		
		input.close();
	}

	
	private static int readPassword(Scanner input) {
		String passwort = input.next();
		char[] arr = passwort.toCharArray();
		int hash = Arrays.hashCode(arr);
		return hash;
	}
}
