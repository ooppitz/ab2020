package de.die_gfi.util;

public class Print {

	/**
	 * Prints the content of an array.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 */
	public static void printArray(int[] array) {
		for (int value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
}
