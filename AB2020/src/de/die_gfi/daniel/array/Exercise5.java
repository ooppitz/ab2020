/** 
 * 5. Write a Java program to test if an array contains a specific value.
 * 
 * */


package de.die_gfi.daniel.array;

public class Exercise5 {

	public static void main(String[] args) {
		int[] zahlen = { 227, 612, 60, 423, 710, 386, 765, 159, 50, 413, 722 };
		int wert = zahlen[2];
		boolean enthalten = false;
		
		
		for( int i = 0; i < zahlen.length  &&  enthalten == false; i++ ) {
			if( zahlen[i] == wert ) {
				enthalten = true;
				System.out.printf( "i = %d\n", i );
			}
		}
		
		
		if( true == enthalten )	{
			System.out.printf( "Der Wert %d ist enthalten", wert );
		} else {
			System.out.printf( "Der Wert %d ist nicht enthalten", wert );
		}
		
	}

}
