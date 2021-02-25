package de.die_gfi.franziska.array;

/**
 * 
 * 5.Write a Java program to test if an array contains a specific value.
 * 
 * @author Franzi
 *
 */

public class Exercise5Primitive {

	public static void main(String[] args) {

		int[] arr = {1,6,9,5};
		
		int target = 0;
		
		int score = 0;
				
		for (int i = 0; i < arr.length; i++) {
			
			target = arr[i];
			
			if (target == 9) {
								
				score = score + 1;
				
			}
		}
		
		if(score != 0) {
			System.out.println("The number(9) you were looking for is contained in the array");
		}else {
			System.out.println("The number(9) you were looking for is not contained in the array");
		}
		
	}
}
