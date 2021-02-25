package de.die_gfi.robin.arrays;

//4. Write a Java program to calculate the average value of array elements.
public class Exercise4 {
	public static void main(String[] args) {
		
		int[] arr = new int[] {4,3,5,2,3,1};
		int summe = 0;
		
		for (int eintrag : arr) {
			summe += eintrag;
		}
		int durchschnitt = summe / arr.length;
		
		System.out.println(durchschnitt);
	}
}
