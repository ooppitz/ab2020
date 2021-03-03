/* 4. Write a Java program to calculate the average value of array elements. */

package de.die_gfi.daniel.array;

public class Exercise4 {

	public static void main(String[] args) {

		int zahlen[] = { 909, 889, 941, 952, 707, 19, 246, 211 };
		int summe = 0;
		
		
		for( int i = 0; i < zahlen.length; i++ ) {
			summe += zahlen[i];
		}
		
		double mittelWert = (double)summe/(double)zahlen.length;
		System.out.println( "Mittelwert: " + mittelWert );
		
	}

}
