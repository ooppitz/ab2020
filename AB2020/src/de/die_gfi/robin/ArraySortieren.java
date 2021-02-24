package de.die_gfi.robin;

import java.util.Arrays;

public class ArraySortieren {
	public static void main(String[] args) {
		
		int[] arr = new int[] {0,2,4,-6,8,-10};
		Arrays.sort(arr);
		
		
		for (int eintrag : arr) {
			System.out.print(eintrag + " ");
		}
		
		System.out.println("");
		
		
		
		int length = arr.length;
		int[] arrCopy = new int[length + 1];
		
		
		for (int i = 0; i < length; i++) {
			arrCopy[i] = arr[i];
		}
		
		
		arrCopy[length] = 100;
		
		for (int eintrag : arrCopy) {
			System.out.print(eintrag + " ");
		}
		
		
		
	}
}
