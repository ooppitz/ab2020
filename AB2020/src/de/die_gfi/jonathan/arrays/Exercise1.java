package de.die_gfi.jonathan.arrays;

import java.util.Arrays;
//Write a Java program to sort a numeric array and a string array
import de.die_gfi.util.Print;

public class Exercise1 {

	public static void main(String[] args) {
		int[] intArray = { 70, 3000, 5, 40, 20, 35, 89, -1, -60, -500, 70, 8 };
		String[] stringArray = { "Montag", "Array", "Dienstag", "Java", "Variante", "tippen", "lesen", "Monat",
				"Programm" };
		Print.printArray(intArray);
		Arrays.sort(intArray);
		Print.printArray(intArray);
		System.out.println();
		Print.printArray(stringArray);
		Arrays.sort(stringArray);
		Print.printArray(stringArray);

	}

}
