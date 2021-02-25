package de.die_gfi.franziska.array;

import java.util.Arrays;

/**
 * 
 * 8.Write a Java program to copy an array by iterating the array.
 * 
 * @author Franzi
 *
 */

public class Exercise8 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 8 };

		int[] arrClone = Arrays.copyOfRange(arr, 0, arr.length);

		System.out.print("Original array: ");
		de.die_gfi.util.Print.printArray(arr);

		System.out.print("Copy of array: ");
		de.die_gfi.util.Print.printArray(arrClone);

	}

}
