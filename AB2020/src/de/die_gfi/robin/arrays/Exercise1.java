package de.die_gfi.robin.arrays;
import java.util.Arrays;

//1. Write a Java program to sort a numeric array and a string array.
public class Exercise1 {
	public static void main(String[] args) {
		
		int[] intArr = new int[] {3,2,4,2,3,7};
		String[] stringArr = new String[] {"Peter","Olga","Heinz","Friedrich"}; 
		
		Arrays.sort(intArr);
		de.die_gfi.util.Print.printArray(intArr);
		
		Arrays.sort(stringArr);
		
		de.die_gfi.util.Print.printArray(stringArr);
		
		
	}
	
	
	
}
