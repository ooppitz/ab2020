package de.die_gfi.oppitz;

import java.util.Arrays;

public class MismatchExample {

	public static void main(String[] args) {

		         // 0   1    2     3     4
		int[] a = { 1, 10, 100, 1000, 10000 };
		int[] b = { 1, 10, 100, 1000, 10000 };

		Arrays.fill(b, 1, 3, 99);
		printIntArray(b);
		
		if (Arrays.equals(a, b)) {
			
			System.out.println("The two arrays have the same contents.");
			
		} else {

			int index = Arrays.mismatch(a, b);
			if (index >= 0) {
				// Normal case
				System.out.println("The first mismatch is at index = " + index);
			} 

		}

	}
	
	public static void printIntArray(int[] a) {
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
