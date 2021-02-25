package de.die_gfi.oppitz.array;

import java.util.Arrays;

import de.die_gfi.util.Print;

/**
 * 1. Write a Java program to sort a numeric array and a string array.
 * 
 * @author oliveroppitz
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
		
		int[] intArray = { 8, 3, 1, 9, 10, 12 };
		Arrays.sort(intArray);
		Print.printArray(intArray);
		
		String[] strArray = {"Z", "B", "H", "A"};
		Arrays.sort(strArray);
		Print.printArray(strArray);

	}

}
