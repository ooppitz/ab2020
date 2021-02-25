package de.die_gfi.robin.arrays;

import java.util.Arrays; 

//7. Write a Java program to remove a specific element from an array.
public class Exercise7 {
 
	public static void main(String[] args) {
		int[] arr = {4, 14, 2, 8, 36, 56, 6, 18, 879, 33};
   
		int removeIndex = 5;

		for(int i = removeIndex; i < arr.length -1; i++){
			arr[i] = arr[i + 1];
		}
   
		de.die_gfi.util.Print.printArray(arr);
    
	}
 }

