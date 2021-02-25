//Write a Java program to copy an array by iterating the array.
package de.die_gfi.jonathan.arrays;

import de.die_gfi.util.Print;

public class Exercise8 {

	public static void main(String[] args) {
		String[] stringArray = { "Montag", "Array", "Dienstag", "Java", "Variante", "tippen", "lesen", "Monat",
				"Programm" };
		System.out.println("Der Ursprüngliche Array;");
		Print.printArray(stringArray);
		String[] copy = new String[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			copy[i] = stringArray[i];
		}
		System.out.println("Die Copie:");
		Print.printArray(copy);
	}

}
