package de.die_gfi.franziska.array;

/**
 * 
 * 3. Write a Java program to print the following grid.

Expected Output :

1  - - - - - - - - - -                                                                                           
2  - - - - - - - - - -                                                                                           
3  - - - - - - - - - -                                                                                           
4  - - - - - - - - - -                                                                                           
5  - - - - - - - - - -                                                                                           
6  - - - - - - - - - -                                                                                           
7  - - - - - - - - - -                                                                                           
8  - - - - - - - - - -                                                                                           
9  - - - - - - - - - -                                                                                           
10 - - - - - - - - - -  
 * 
 * 
 * @author Franzi
 *
 */

public class Exercise3 {

	public static void main(String[] args) {

		String[] zeile = { "-" };

		for (int k = 0; k < 10; k++) {

			for (int i = 0; i < 10; i++) {

				for (String value : zeile) {
					System.out.print(value + " ");
				}
				System.out.print("");
			}

			System.out.println("");
		}
	}
}
