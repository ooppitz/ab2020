package de.die_gfi.robin.arrays;

import java.util.Arrays;

//15. Write a Java program to find the common elements between two arrays of integers.
public class Exercise15 {
	public static void main(String[] args) {
		
		int[] arr = new int[] {5,77,23,45,11,22,22};
		int[] arr2 = new int[] {1,4,34,55,77,23};
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		for (int eintrag : arr) {
			if (Arrays.binarySearch(arr2, eintrag) >= 0) {
				System.out.println("Der Integer Wert " + eintrag + " ist in beiden Arrays vorhanden");
			}
		}
		
		
	}
}
