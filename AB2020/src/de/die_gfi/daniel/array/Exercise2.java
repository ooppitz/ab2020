/* 2. Write a Java program to sum values of an array. */

package de.die_gfi.daniel.array;

public class Exercise2 {

	public static void main(String[] args) {

		int zahlen[] = { 909, 889, 941, 952, 707, 19, 246, 211 };
		int summe = 0;

		
		for (int i = 0; i < zahlen.length; i++) {
			summe += zahlen[i];
		}

		System.out.println("Summe : " + summe);
	}

}
