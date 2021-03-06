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
	
	/**
	 * Prints the content of an array.
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 */
	public static void printArray(String[] array) {
		
		for (String value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	/**
	 * Prints the content of an array. 
	 * 
	 * @param array an {@link java.lang.reflect.Array} with non null content
	 */
	public static <T> void printArray(T[] array) {

		System.out.println("Generic method");
		for (T value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	
}
