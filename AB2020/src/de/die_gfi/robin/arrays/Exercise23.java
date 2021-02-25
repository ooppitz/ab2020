package de.die_gfi.robin.arrays;

import java.util.Arrays;

//23. Write a Java program to test the equality of two arrays.
public class Exercise23 {
	public static void main(String[] args) {
		
		int[] arr = new int[] {3,7,45,11,5,6,11,5,100,4,2,8};
		int[] arr2 = new int[] {3,7,45,11,5,6,11,5,100,4,2,8};
		
		
		if (Arrays.equals(arr, arr2) == true) {
			System.out.println("The Arrays are equal");
		}
		else
			System.out.println("The Arrays are not equal");
	}
}
