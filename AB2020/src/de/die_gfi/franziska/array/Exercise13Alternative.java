package de.die_gfi.franziska.array;

/**
 * 
 * 13.Write a Java program to find the duplicate values of an array of string values.
 * 
 * @author Franzi
 *
 */

public class Exercise13Alternative {

	public static void main(String[] args) {

		String[] arr = { "Baum", "Dachs", "Wetter", "Obstkuchen", "Seife", "Dachs", "Reifen" };

		boolean duplicateFound = false;
		
		String duplicate = "";

		String storage = "";

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				
				if (arr[j] != arr[j + 1]) {

					storage = arr[j + 1];

					arr[j + 1] = arr[j];

					arr[j] = storage;
					
				}else {
					break;
				}
			}

			de.die_gfi.util.Print.printArray(arr);
		}

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i].contains(arr[i + 1])) {

				duplicateFound = true;
				
				duplicate = arr[i];
				break;
			}

		}

		if (duplicateFound) {
			System.out.println("The duplicate is: " + duplicate);
		} else {
			System.out.println("No duplicate found");
		}
	}

}