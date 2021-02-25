package de.die_gfi.robin.arrays;

//5. Write a Java program to test if an array contains a specific value.
public class Exercise5 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,7,3,2,5,5};
		int searchValue = 0;
		boolean gefunden = false;
		
		for (int eintrag : arr) {
			if (eintrag == searchValue) {
				System.out.println("Das Array enthaelt den gesuchten Wert");
				gefunden = true;
				break;
			}
			
		}
		if (gefunden == false) {
			System.out.println("Das Array enthaelt nicht den gesuchten Wert");
		}
		
		
		
	}
}
