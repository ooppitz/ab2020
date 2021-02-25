package de.die_gfi.franziska.array;

import java.util.ArrayList;

/**
 * 
 * 9.Write a Java program to insert an element (specific position) into an array.
 * 
 * @author Franzi
 *
 */

public class Exercise9 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		System.out.println("Original array: " + arr);

		arr.add(1, 8);

		System.out.println("Array after changes: " + arr);

	}

}
