package de.die_gfi.robin.arrays;

import java.util.Arrays;

//11. Write a Java program to reverse an array of integer values.
public class Exercise11 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,6,11,4,4,0,77,3};
		int length = arr.length;
		int[] reverseArr = new int[length];
		
		int reverseCounter = length - 1;
		
		for (int i = 0; i < length; i++) {
			reverseArr[i] = arr[reverseCounter];
			reverseCounter--;
		}
		arr = Arrays.copyOf(reverseArr, length);
		
		
		
		de.die_gfi.util.Print.printArray(arr);
		
		
	}
}
