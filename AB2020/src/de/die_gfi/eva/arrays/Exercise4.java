package de.die_gfi.eva.arrays;


public class Exercise4 {

	// Write a Java program to calculate the average value of array elements.

	public static void main(String[] args) {
		
		int[] zahlen = {1,2,3,4,5};
		int summe = 0;

		for (int i = 0; i < zahlen.length; i++) {
			summe = summe + zahlen[i];
		}			
		double mWert = summe / zahlen.length; 
		
		System.out.println("Die Summe der Zahlen ist: " + summe);
		System.out.println("Der Durchschnitt von diesen ist: " + mWert );
		
		
	}
}
