package de.die_gfi.franziska.array;

/**
 * 
 * 14.Write a Java program to find the common elements between two arrays (string values)
 * 
 * @author Franzi
 *
 */

public class Exercise14 {

	public static void main(String[] args) {

		String common = "";

		boolean commonFound = false;

		String[] arr1 = { "fill", "stahl", "test", "kein B", "auch kein B", "B" };

		String[] arr2 = { "kamel", "schock", "B" };

// Das arr1 ist kleiner oder gleich groß im Vergleich zu arr2 und deshalb gibt es keine Probleme mit dem Index von arr1.length (der Index wäre sonst zu groß)

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

				for (int j = 0; j < arr2.length; j++) {

					if (arr2[i] == arr2[j]) {

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
