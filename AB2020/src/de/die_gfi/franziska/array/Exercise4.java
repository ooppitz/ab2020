package de.die_gfi.franziska.array;


/**
 * 
 * 4.Write a Java program to calculate the average value of array elements.
 * 
 * @author Franzi
 *
 */

public class Exercise4 {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 6, 3, 5 };

		int sum = 0;

		double avg = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

		}

		avg = (double) sum / arr.length;

		System.out.println("The average length of this array is :  " + avg);

	}

}