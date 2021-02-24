package de.die_gfi.franziska;

import java.util.Arrays;

public class HashExample {

	public static void main(String[] args) {

		int[] arr1 = {3,9,45,21,8};

		arr1[0] = 4;

		for (int i = 0; i < arr1.length; i++) {

			System.out.println("Inhalte: " + arr1[i]);
		}

		System.out.println("\nHashcode: " + Arrays.hashCode(arr1) + "\n");

		arr1[0] = 37;

		for (int i = 0; i < arr1.length; i++) {

			System.out.println("Inhalte nach Änderung: " + arr1[i]);
		}

		System.out.println("\nHashcode: " + Arrays.hashCode(arr1));

	}
}
