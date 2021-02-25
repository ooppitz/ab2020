package de.die_gfi.robin.arrays;

//10. Write a Java program to find the maximum and minimum value of an array.
public class Exercise10 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,6,11,4,4,0};
		int min = arr[0];
		int max = arr[0];
		
		for (int eintrag : arr) {
			if (eintrag > max) {
				max = eintrag;
			}
			if (eintrag < min) {
				min = eintrag;
			}
		}
		
		System.out.println("Kleinster Wert: " + min);
		System.out.println("Groester Wert: " + max);
		
		
		
		
	}
	
	
	
	
}
