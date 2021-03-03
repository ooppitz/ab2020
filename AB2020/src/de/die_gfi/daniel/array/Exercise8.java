package de.die_gfi.daniel.array;

/**
 * 8. Write a Java program to copy an array by iterating the array.
 * 
 * @author Daniel
 *
 */

public class Exercise8 {

	public static void main(String[] args) {
		int[] zahlen = { 367, 498, 625, 620, 255, 255, 979, 583 };
		int[] zahlenKopie = new int[zahlen.length];
		
		
		for( int i = 0; i < zahlen.length; i++ ) {
			zahlenKopie[i] = zahlen[i];
		}
		

		druckeArray( zahlen, "zahlen" );
		druckeArray( zahlenKopie,"zahlenKopie" );
	}

	
	
	public static void druckeArray( int[] array, String name ) {
		for( int i = 0; i < array.length; i++ ) {
			System.out.printf( "%s[%d] = %d\n", name, i, array[i] );
		}
		System.out.printf( "\n" );
		
	}
}
