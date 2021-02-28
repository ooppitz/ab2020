package de.die_gfi.franziska.array;

/**
 * 
 * 16.Write a Java program to remove duplicate elements from an array.
 * 
 * @author Franzi
 *
 */

import java.util.ArrayList;

public class Exercise16ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(1);
		arr.add(8);
		arr.add(9);
		arr.add(6);
		arr.add(3);
		arr.add(9);

		System.out.println("Original Array: " + arr);

		arr.sort(null);

		System.out.println("Array after sorting: " + arr);

		for (int i = 0; i < arr.size() - 1; i++) {

			if (arr.toArray()[i] == arr.toArray()[i + 1]) {

				arr.remove(i);

			}
		}

		System.out.println("Array after removal" + arr);

	}
}
