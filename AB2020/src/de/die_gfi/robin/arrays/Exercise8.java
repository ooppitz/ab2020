package de.die_gfi.robin.arrays;

//8. Write a Java program to copy an array by iterating the array.
public class Exercise8 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,63,23,77,4,2};
		int[] arrNeu = new int[arr.length];
		
		de.die_gfi.util.Print.printArray(arr);
		
		for (int i = 0; i < arr.length; i++) {
			 arrNeu[i] = arr[i];
		}
		
		de.die_gfi.util.Print.printArray(arrNeu);
		
	}
}
