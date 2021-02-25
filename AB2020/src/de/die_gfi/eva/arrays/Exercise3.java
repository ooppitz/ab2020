package de.die_gfi.eva.arrays;

/** Exercise 3 : Write a Java program to print the following grid. */

public class Exercise3 {

	public static void main(String[] args) {

		char[] arr = new char[21];
		for (int i = 0; i < 20; i += 2) {
			arr[i] = '_';
			arr[i + 1] = ' ';
		}

		for (int i = 0; i < 10; i++) {
			for (char c : arr) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
