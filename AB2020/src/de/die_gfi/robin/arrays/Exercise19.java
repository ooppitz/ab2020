package de.die_gfi.robin.arrays;

//19. Write a Java program to add two matrices of the same size.
public class Exercise19 {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		int[][] arr2 = new int[3][3];
		int[][] summe = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = j;
				arr2[i][j] = j;
			}
		}
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				summe[i][j] = arr[i][j] + arr2[i][j];
				
				
			}
			
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(summe[i][j] + " ");
				
			}
		System.out.println("");
		}
			
		
		
	}
}
