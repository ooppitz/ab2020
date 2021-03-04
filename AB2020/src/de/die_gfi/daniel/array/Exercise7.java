package de.die_gfi.daniel.array;


/**
 * 7. Write a Java program to remove a specific element from an array
 * 
 * @author Daniel
 *
 */


public class Exercise7 {

	public static void main(String[] args) {
		int zahlen[] = { 995, 658, 350, 266, 583, 824, 314, 617, 454, 462 };
		int removeIndex = 3;
		
		druckeArray( zahlen, "zahlen" );
		int neuArray[] = new int[zahlen.length-1];
		
		
		int i = 0;
		while( i < removeIndex ) {
			neuArray[i] = zahlen[i];
			i++;
		}

		
		while( i < neuArray.length ) {
			neuArray[i] = zahlen[i+1];
			i++;
		}
		
		
		

		druckeArray( neuArray, "neuArray" );
	}
	
	
	
	public static void druckeArray( int[] array, String name ) {
		for( int i = 0; i < array.length; i++ ) {
			System.out.printf( "%s[%d] = %d\n", name, i, array[i] );
		}
		System.out.printf( "\n" );
		
	}

}
