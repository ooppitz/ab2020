package de.die_gfi.franziska.array;

import java.util.ArrayList;

/**
 * 
 * 5.Write a Java program to test if an array contains a specific value.
 * 
 * @author Franzi
 *
 */

public class Exercise5 {

	public static void main(String[] args) {

		ArrayList<Integer> arrI = new ArrayList<Integer>();

		arrI.add(2);
		arrI.add(7);
		arrI.add(57);

		if (arrI.contains(2)) {

			System.out.println("Die gesuchte Zahl (2) ist enthalten.");

		}

		else {

			System.out.println("Die gesuchte Zahl ist nicht erhalten. ");
		}

		ArrayList<String> arrS = new ArrayList<String>();

		arrS.add("nuss");
		arrS.add("hund");
		arrS.add("supernova");

		if (arrS.contains("nuss")) {

			System.out.println("Es wurd eine Nuss gefunden");

		}

		else {

			System.out.println("Wo sind die Nüsse??");
		}
	}

}
