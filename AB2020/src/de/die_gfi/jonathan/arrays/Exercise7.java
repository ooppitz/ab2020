//Write a Java program to remove a specific element from an array.
package de.die_gfi.jonathan.arrays;
// stelle verschwindet
import java.util.Scanner;

import de.die_gfi.util.Print;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] stringArray = { "Montag", "Array", "Dienstag", "Java", "Variante", "tippen", "lesen", "Monat",
				"Programm" };
		Print.printArray(stringArray);
		System.out.println("Bitte den Such Wert angeben");
		String value = sc.next();

		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(value)) {
				stringArray[i] = null;
			}
		}
		Print.printArray(stringArray);
		sc.close();
	}

}
