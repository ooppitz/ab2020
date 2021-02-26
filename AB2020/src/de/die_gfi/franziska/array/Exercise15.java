package de.die_gfi.franziska.array;

/**
 * 
 * 15. Write a Java program to find the common elements between two arrays of integers.
 * 
 * @author Franzi
 *
 */

public class Exercise15 {

	public static void main(String[] args) {

		int common = 0;

		boolean commonFound = false;

		int[] arr1 = { 72, 21, 133, 46, 13 };

		int[] arr2 = { 5, 69, 13, 90 };

		if (arr1.length <= arr2.length) {

			for (int i = 0; i < arr1.length; i++) {

				for (int j = 0; j < arr1.length; j++) {

					if (arr1[i] == arr2[j]) {

						common = arr1[i];

						commonFound = true;
						break;

					}
				}
			}

		} else {

			for (int i = 0; i < arr2.length; i++) {

				for (int j = 0; j < arr1.length; j++) {

					if (arr2[i] == arr1[j]) {

						common = arr2[i];

						commonFound = true;
						break;

					}
				}
			}
		}

		if (commonFound) {

			System.out.println("The common element is: " + common);
		} else {

			System.out.println("There is no common element");

		}

	}

}
