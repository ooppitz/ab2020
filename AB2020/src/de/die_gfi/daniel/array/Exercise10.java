package de.die_gfi.daniel.array;

/**
 * 10. Write a Java program to find the maximum and minimum value of an array.
 * 
 * @author Daniel
 *
 */

public class Exercise10 {

	public static void main(String[] args) {
		int[] zahlen = { 290, 666, 40, 707, 131, 510, 122, 239, 831, 990 };
		int min;
		int max;
		
		
		max = min = zahlen[0];
		for( int i = 1; i < zahlen.length; i++ ) {
			/*
			if( zahlen[i] > max ) {
				max = zahlen[i];
			}
			
			if( zahlen[i] < min ) {
				min = zahlen[i];
			}
			*/
			
			
			if( zahlen[i] > max ) {
				max = zahlen[i];
			} else {
				if( zahlen[i] < min ) {
					min = zahlen[i];
				}
			}
		}
		
		System.out.printf( "min = %d\n", min );
		System.out.printf( "max = %d\n", max );
		

	}

}
