package de.die_gfi.franziska.array;

import java.util.Arrays;

/**
 * 
 * 1.Write a Java program to sort a numeric array and a string array.
 * 
 * @author Franzi
 *
 */

public class Exercise1 {

	public static void main(String[] args) {

		String[] sArray = { "fries", "old", "minion", "axolotl", "aa" };

		int[] iArray = { 23, 4, 8, 3 };

		Arrays.sort(iArray);

		for (int i = 0; i < iArray.length; i++) {

			System.out.println(iArray[i]);

		}

		Arrays.sort(sArray);

		for (int i = 0; i < sArray.length; i++) {

			System.out.println(sArray[i]);

		}

	}

}
