package de.die_gfi.franziska.array;

/**
 * 
 * 2.Write a Java program to sum values of an array.
 * 
 * @author Franzi
 *
 */

public class Exercise2 {

	public static void main(String[] args) {

		int[] arr = { 1, 6, 2, 1 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

		}

		System.out.println("The sum is: " + sum);
	}

}
