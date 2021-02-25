package de.die_gfi.robin.arrays;

import java.util.Arrays;

//16. Write a Java program to remove duplicate elements from an array.
public class Exercise16 {
	public static void main(String[] args) {
		int[] arr = new int[] {5,77,23,45,11,22,22,11,5};
		Arrays.sort(arr);
		
		int length = arr.length;
		int lengthNewArr = length;
		
		//Festlegen der Groeﬂe des neuen Arrays
		for (int i = 0; i < length; i++) {
			if (Arrays.binarySearch(arr, i + 1, length, arr[i]) >= 0) {
				lengthNewArr--;
			}
		}
		
		int[] arrNew = new int[lengthNewArr];
		int indexNewArr = 0;
		
		for (int i = 0; i < length; i++) {
			if (Arrays.binarySearch(arr, i + 1, length, arr[i]) < 0) {
				arrNew[indexNewArr] = arr[i];
				indexNewArr++;
			}
		}
		
		de.die_gfi.util.Print.printArray(arrNew);
		
	}
}
