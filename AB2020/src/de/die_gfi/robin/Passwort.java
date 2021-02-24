package de.die_gfi.robin;

import java.util.Arrays;
import java.util.Scanner;
import de.die_gfi.util.*;
import java.util.ArrayList;

public class Passwort {
	public static void main(String[] args) {
		ArrayList<Integer> passwoerter = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		
		while (true) {
		
			
			int hash = readPassword(input);
		
			checkIfExists(passwoerter, hash);
		
		
		
		}
		
		
	}


	private static void checkIfExists(ArrayList<Integer> passwoerter, int hash) {
		if (passwoerter.contains(hash) == false) {
			passwoerter.add(hash);
			System.out.println("Passwort hinzugefügt");
		}
		else
			System.out.println("Dieses Passwort ist bereits vorhanden");
	}

	
	private static int readPassword(Scanner input) {
		System.out.println("Legen Sie ein Passwort fest: ");
		String passwort = input.next();
		char[] arr = passwort.toCharArray();
		int hash = Arrays.hashCode(arr);
		return hash;
	}
}
