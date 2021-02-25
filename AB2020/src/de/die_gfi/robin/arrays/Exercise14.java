package de.die_gfi.robin.arrays;

import java.util.Arrays;

//Write a Java program to find the common elements between two arrays (string values).
public class Exercise14 {
	public static void main(String[] args) {
		
		String[] arr = new String[] {"Hans", "Thomas", "Dieter", "Hans", "Hubert", "Krammel", "Turan", "Cupcake"};
		String[] arr2 = new String[] {"Thomas", "Kreut", "Deutsch", "Krammel", "Hubert", "Hinterberg"};
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		for (String eintrag : arr) {
			if (Arrays.binarySearch(arr2, eintrag) >= 0) {
				System.out.println("Der String " + eintrag + " ist in beiden Arrays vorhanden");
			}
		}
		
	}
}
