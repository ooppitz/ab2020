package de.die_gfi.oppitz;

import java.util.Arrays;

public class ExtendArray {

	public static void main(String[] args) {

		int[] intArray = { 8, 5, 2, 0, 5, 4 }; // size = 6

		for (int i : intArray) {
			System.out.println(i);
		}
		System.out.println("--------------");

		int[] copiedArray = Arrays.copyOf(intArray, intArray.length + 10);
		copiedArray[copiedArray.length - 1] = 99;
		System.out.println("copiedArray = ");
		for(int n : copiedArray) {
			System.out.print(n + " ");
		}
		
	}

}
