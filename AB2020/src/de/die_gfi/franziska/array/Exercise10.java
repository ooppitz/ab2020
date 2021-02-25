package de.die_gfi.franziska.array;

import java.util.ArrayList;

/**
 * 
 * 10.Write a Java program to find the maximum and minimum value of an array.
 * 
 * @author Franzi
 *
 */

public class Exercise10 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(1);
		arr.add(2);
		arr.add(400);
		arr.add(36);
		arr.add(14);

		System.out.println(arr);

		arr.sort(null);

		System.out.println(arr);

		System.out.println("Minimum value of the array is: " + arr.get(0));

		System.out.println("Maximum value of the array is: " + arr.get(arr.size() - 1));

	}

}
