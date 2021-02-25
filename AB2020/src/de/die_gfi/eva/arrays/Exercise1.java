package de.die_gfi.eva.arrays;

import java.util.Arrays;

public class Exercise1 {
	

	//  Write a Java program to sort a numeric array and a string array.

	public static void main(String[] args) {
		
		int[] intArray = {420, 21, 69, 0, 7};
		 
		String[] stringArray = {"Java", "Package", "Class", "Methode", "Array"};
		
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		
		Arrays.sort(stringArray);
		System.out.println(Arrays.toString(stringArray));
		
		
		
	}

}
