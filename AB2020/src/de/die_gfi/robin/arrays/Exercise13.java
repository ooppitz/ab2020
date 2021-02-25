package de.die_gfi.robin.arrays;

import java.util.ArrayList;

//13. Write a Java program to find the duplicate values of an array of string values.
public class Exercise13 {
	public static void main(String[] args) {
		
		String[] arr = new String[] {"Hans", "Thomas", "Dieter", "Hans", "Hubert", "Thomas"};
		ArrayList<String> arrCheckList = new ArrayList<String>();
		
		for (String eintrag : arr) {
			if (arrCheckList.contains(eintrag)) {
				System.out.println("Duplikat erkannt: " + eintrag);
			}
			else {
				arrCheckList.add(eintrag);
			}
		}
		
		
	}
}
