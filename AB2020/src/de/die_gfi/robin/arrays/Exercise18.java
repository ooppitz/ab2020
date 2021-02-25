package de.die_gfi.robin.arrays;

//Write a Java program to find the second smallest element in an array.
public class Exercise18 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,23,45,11,22,22,11,5,100,1};
		
		
		int min = arr[0];
		int min2 = Integer.MAX_VALUE;
		
		
		for (int eintrag : arr) {
			if (eintrag < min) {
				min = eintrag;
				
			}
		}
		
		for (int eintrag : arr) {
			if (eintrag < min2 && eintrag > min) {
				min2 = eintrag;
			}
		}
		
		System.out.println("second smallest element: " + min2);
		
		
	}
}
