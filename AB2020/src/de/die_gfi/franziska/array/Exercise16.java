package de.die_gfi.franziska.array;

/**
 * 
 * 16.Write a Java program to remove duplicate elements from an array.
 * 
 * @author Franzi
 *
 */

public class Exercise16 {

	public static void main(String[] args) {

		int[] arr = { 8, 9, 3, 1, 6, 9 };

		int duplicateIndex = 0;

		sortArray(arr);

		System.out.println("Original array: ");
		de.die_gfi.util.Print.printArray(arr);

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == arr[i + 1]) {

				duplicateIndex = i + 1;

			}
		}

		int[] arr1 = new int[duplicateIndex - 1];

		int[] arr2 = new int[arr.length - duplicateIndex];

		for (int j = 0; j < duplicateIndex - 1; j++) {

			arr1[j] = arr[j];

		}

		arr2[0] = arr[duplicateIndex];

		for (int i = duplicateIndex + 1; i < arr.length; i++) {

			arr2[i - duplicateIndex] = arr[i];

		}

		int[] arr12 = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, arr12, 0, arr1.length);
		System.arraycopy(arr2, 0, arr12, arr1.length, arr2.length);

		System.out.println("Array after removal: ");
		de.die_gfi.util.Print.printArray(arr12);

	}

	public static void sortArray(int[] arr) {

		int storage = 0;

		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i] > arr[i + 1]) {

					storage = arr[i + 1];

					arr[i + 1] = arr[i];

					arr[i] = storage;

				}
			}
		}

	}
}
