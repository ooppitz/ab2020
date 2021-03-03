package de.die_gfi.daniel.array;

/**
 * 6. Write a Java program to find the index of an array element.
 * 
 * @author Daniel
 *
 */

public class Exercise6 {

	public static void main(String[] args) {
		int[] zahlen = { 227, 612, 60, 423, 710, 386, 765, 159, 50, 413, 722 };
		int wert = zahlen[2];
		boolean enthalten = false;
		int i;
		

		
		
		for( i = 0; i < zahlen.length  &&  enthalten == false; i++ ) {
			if( zahlen[i] == wert ) {
				enthalten = true;
				System.out.printf( "i = %d\n", i );
			}
		}
		
		
		if( true == enthalten )	{
			System.out.printf( "Der Wert %d ist enthalten bei Index %d\n", wert, i-1 );
		} else {
			System.out.printf( "Der Wert %d ist nicht enthalten", wert );
		}
		
	}

}
