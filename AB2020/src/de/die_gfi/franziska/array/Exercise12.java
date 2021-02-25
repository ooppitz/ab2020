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

		int[] arr = { 1, 4, 4, 5, 8 };

		boolean duplicate = false;

		for (int i = 0; i < arr.length - 1; i++) {

// Fehler bemerkt: funktioniert wahrscheinlich nur, wenn die Elemente direkt nebeneinander im Array liegen
// Evtl Array sortieren um die Elemente nebeneinander zu schieben, falls sie voneinander entfernt sind und dann nach dem selben Prinzip durchsuchen. 			
			
			if (arr[i] == arr[i + 1]) {

				duplicate = true;
				break;
			}
		}

		if (duplicate) {
			System.out.println("Duplicate found");

		} else {

			System.out.println("No duplicate found");
		}

	}

}
