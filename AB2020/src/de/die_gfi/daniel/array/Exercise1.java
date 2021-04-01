/* 1. Write a Java program to sort a numeric array and a string array. */

package de.die_gfi.daniel.array;

import java.util.Arrays;

public class Exercise1 {

	public static void main(String[] args) {

		int[] zahlen = { 5, 7, 8, 9, 1, 3, 4, 2, 6, 0 };
		String[] saetze = { "Hello World", "Hallo Welt" };
		
		
		druckeArray( zahlen, "zahlen" );
		System.out.printf( "Sortieren ...\n\n" );
		Arrays.sort( zahlen );
		druckeArray( zahlen, "zahlen" );
		
		
		druckeArray( saetze, "saetze" );
		System.out.printf( "Sortieren ...\n\n" );
		Arrays.sort( saetze );
		druckeArray( saetze, "saetze" );
		
	}

	
	public static void druckeArray( int[] array, String name ) {
		for( int i = 0; i < array.length; i++ ) {
			System.out.printf( "%s[%d] = %d\n", name, i, array[i] );
		}
		System.out.printf( "\n" );
		
	}
	
	
	public static void druckeArray( String[] array, String name ) {
		for( int i = 0; i < array.length; i++ ) {
			System.out.printf( "%s[%d] => %s\n", name, i, array[i] );
		}
		System.out.printf( "\n" );
		
	}
}
