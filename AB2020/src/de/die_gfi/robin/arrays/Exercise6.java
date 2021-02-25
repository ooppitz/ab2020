package de.die_gfi.robin.arrays;

//6. Write a Java program to find the index of an array element.
public class Exercise6 {
	public static void main(String[] args) {
		int[] arr = new int[] {2,56,2,5467,1,45,3};
		int searchValue = 2;
		boolean gefunden = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchValue) {
				System.out.println("Der gesuchte Wert hat den Index = " + i);
				gefunden = true;
				break;
			}
		}
		
		if (gefunden == false) {
			System.out.println("Der gesuchte Wert ist nicht vorhanden");
		}
		
		
	}
}
