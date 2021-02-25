package de.die_gfi.robin.arrays;

//9. Write a Java program to insert an element (specific position) into an array.
public class Exercise9 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,63,23,77,4,2};
		int addValue = 9;
		int addToIndex = 2;
		
		arr[addToIndex] = addValue;
		
		de.die_gfi.util.Print.printArray(arr);
	}
	
	
}
