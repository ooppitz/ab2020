package de.die_gfi.robin.arrays;

import java.util.ArrayList;

//12. Write a Java program to find the duplicate values of an array of integer values.
public class Exercise12 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,6,2,4,4,0,77,3};
		ArrayList<Integer> arrCheckList = new ArrayList<Integer>();
		
		for (int eintrag : arr) {
			if (arrCheckList.contains(eintrag)) {
				System.out.println("Duplikat erkannt: " + eintrag);
			}
			else {
				arrCheckList.add(eintrag);
			}
		}
		
	}
}
