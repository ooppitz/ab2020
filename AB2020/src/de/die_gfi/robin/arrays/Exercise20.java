package de.die_gfi.robin.arrays;

import java.util.ArrayList;

//20. Write a Java program to convert an array to ArrayList.
public class Exercise20 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,23,45,11,22,22,11,5,100,1};
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		for (int eintrag : arr) {
			arrList.add(eintrag);
		}
		
		System.out.println(arrList.toString());
		
	}
}
