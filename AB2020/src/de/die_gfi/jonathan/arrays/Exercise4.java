//Write a Java program to calculate the average value of array elements.
package de.die_gfi.jonathan.arrays;

public class Exercise4 {

	public static void main(String[] args) {
		int[] intArray = { 70, 3000, 5, 40, 20, 35, 89, -1, -60, -500, 70, 8 };
		int summ = 0;
		for (int i = 0; i < intArray.length; i++) {
			summ = summ + intArray[i];
		}
		double average = (double) summ / intArray.length;
		average = ((int) (average * 100) + 1) / 100.0;
		System.out.println(average);
	}

}
