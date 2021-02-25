package de.die_gfi.robin.arrays;

//24. Write a Java program to find a missing number in an array.
public class Exercise24 {
	public static void main(String[] args) {
		int[] arr = new int[] {2,3,4,5,7};
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] != 1) {
				System.out.println("Es fehlt: " + (arr[i] + 1));
			}
		}
		
	}
}
