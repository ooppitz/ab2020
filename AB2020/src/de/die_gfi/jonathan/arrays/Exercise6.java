//Write a Java program to find the index of an array element
package de.die_gfi.jonathan.arrays;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] stringArray = { "Montag", "Array", "Dienstag", "Java", "Variante", "tippen", "lesen", "Monat",
				"Programm" };
		System.out.println("Bitte den Such Wert angeben");
		String value = sc.next();
		int gesuchterIndex = -1;

		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(value)) {
				gesuchterIndex = i;
			}
		}
		if (gesuchterIndex == -1) {
			System.out.println("Der gesuchte wert ist nicht vorhanden");
		} else {
			System.out.println("Das Objekt " + value + "befindet sich an der stelle " + gesuchterIndex);

		}
		sc.close();
	}

}
