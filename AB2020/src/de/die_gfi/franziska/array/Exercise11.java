package de.die_gfi.franziska.array;

/**
 * 
 * 11.Write a Java program to reverse an array of integer values.
 * 
 * @author Franzi
 *
 */

public class Exercise11 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int[] arrRev = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			arrRev[i] = arr[(arr.length - 1) - i];
		}

		de.die_gfi.util.Print.printArray(arr);

		de.die_gfi.util.Print.printArray(arrRev);
	}
}
