/*
 * 3. Write a Java program to print the following grid. Go to the editor
 * 
 * Expected Output :
 * 
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * - - - - - - - - - -
 * 
 */

package de.die_gfi.daniel.array;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for( int i = 1; i <= 100; i++ ) {
			System.out.print( "- " );
			
			if( i % 10 == 0 ) {
				System.out.println();
				
			}
			
		}
	}

}
