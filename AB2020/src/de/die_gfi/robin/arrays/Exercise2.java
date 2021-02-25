package de.die_gfi.robin.arrays;

//2. Write a Java program to sum values of an array.
public class Exercise2 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {4,1,6,2,7,5};
		
		int summe = 0;
		
		for (int eintrag : arr) {
			summe += eintrag;
		}
		
		System.out.println(summe);
		
		
		
	}
	
}
