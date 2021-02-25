package de.die_gfi.franziska.array;


/**
 * 
 * 7.Write a Java program to remove a specific element from an array. 
 * 
 * @author Franzi
 *
 */

public class Exercise7Primitive {

	public static void main(String[] args) {

		String[] arr = { "Affe", "Hund", "Akku", "Tiger" };

		String[] arrClone = { "", "", "", "" };

		int pointer = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == "Akku") {

				pointer = i;
			}
		}

		for (int i = 0; i < pointer; i++) {

			arrClone[i] = arr[i];
		}

		for (int i = pointer + 1; i < arr.length; i++) {

			arrClone[i] = arr[i];

		}

		de.die_gfi.util.Print.printArray(arr);

		de.die_gfi.util.Print.printArray(arrClone);

	}
}
