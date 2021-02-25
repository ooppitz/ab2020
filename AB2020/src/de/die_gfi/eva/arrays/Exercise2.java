package de.die_gfi.eva.arrays;

public class Exercise2 {
	
	//Write a Java program to sum values of an array.

	public static void main(String[] args) {
		
		int[] intArr = {420, 21, 69, 0, 7};
		int summe = 0;
		
		for (int i : intArr) {
			summe += i;
		}    
		System.out.println("Summe des Arrays = " + summe);	
		
		

	}

}
