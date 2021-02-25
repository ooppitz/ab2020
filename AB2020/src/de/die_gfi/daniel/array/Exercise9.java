package de.die_gfi.daniel.array;

/**
 * 9. Write a Java program to insert an element (specific position) into an array.
 * 
 * @author Daniel
 *
 */

public class Exercise9 {

	public static void main(String[] args) {

		int[] zahlen = { 38, 754, 39, 772, 741, 469, 654, 400, 375 };
		int neuIndex = 4;
		int neuZahl = 9155; 
		
		
		int[] neuArray = new int[zahlen.length+1];
		
		
		int i = 0;
		while( i < neuIndex ) {
			neuArray[i] = zahlen[i];
			i++;
		}
		
		System.out.printf( "i = %d\n", i );
		
		neuArray[i++] = neuZahl;
		
		
		while( i < neuArray.length ) {
			neuArray[i] = zahlen[i-1];
			i++;
		}
		
		
		druckeArray( zahlen, "zahlen" );
		druckeArray( neuArray, "neuArray" );
		
		System.out.printf( "Programmende\n" );
		
	}

	
	public static void druckeArray( int[] array, String name ) {
		for( int i = 0; i < array.length; i++ ) {
			System.out.printf( "%s[%d] = %d\n", name, i, array[i] );
		}
		System.out.printf( "\n" );
		
	}
}
