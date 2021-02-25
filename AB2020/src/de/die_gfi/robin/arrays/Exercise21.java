package de.die_gfi.robin.arrays;

import java.util.ArrayList;

//21. Write a Java program to convert an ArrayList to an array.
public class Exercise21 {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>(); 
		arrList.add("Feuer");
		arrList.add("Wasser");
		arrList.add("Erde");
		arrList.add("Luft");
		
		
		int length = arrList.size();
		String[] arr = new String[length];
		for (int i = 0 ; i < length; i++) {
			arr[i] = arrList.get(i);
		}
		
		
		de.die_gfi.util.Print.printArray(arr);
		
		
	}
}
