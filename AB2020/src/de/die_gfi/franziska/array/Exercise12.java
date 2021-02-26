package de.die_gfi.franziska.array;

/**
 * 
 * 12.Write a Java program to find the duplicate values of an array of integer values.
 * 
 * @author Franzi
 *
 */

public class Exercise12 {

	public static void main(String[] args) {

		int[] arr = { 8, 1, 4, 5, 4 };

		boolean duplicateFound = false;

		int storage = 0;
		
		int duplicate = 0;

		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i] > arr[i + 1]) {

					storage = arr[i + 1];

					arr[i + 1] = arr[i];

					arr[i] = storage;

				}
			}
		}

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == arr[i + 1]) {

				duplicateFound = true;
				duplicate = arr[i];
				break;
			}
		}

		if (duplicateFound) {

			System.out.println("There is a duplicate of the number " + duplicate);

		} else {

			System.out.println("No duplicate found");
		}

	}

}
