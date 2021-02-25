package de.die_gfi.robin.arrays;

import java.util.Arrays;

//17. Write a Java program to find the second largest element in an array.
public class Exercise17 {
	public static void main(String[] args) {
		
		int[] arr = new int[] {5,23,45,11,22,22,11,5,100};
		
		int max = arr[0];
		int max2 = 0;
		
		
		for (int eintrag : arr) {
			if (eintrag > max) {
				max = eintrag;
				
			}
		}
		
		for (int eintrag : arr) {
			if (eintrag > max2 && eintrag < max) {
				max2 = eintrag;
			}
		}
		
		System.out.println("second largest element: " + max2);
		
		
	}
}
