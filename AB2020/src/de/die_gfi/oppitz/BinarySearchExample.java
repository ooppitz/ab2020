package de.die_gfi.oppitz;

import java.util.Arrays;

public class BinarySearchExample {

	public static void main(String[] args) {

		//              0   1      2     3     4     5    6
		int[] isbn = { 98,  122,  434,  443,  455,  678, 944}; // Is already sorted
		String[] title = {"The bible", "The Koran", "The constitution", "1984", "Grundgesetz", "BGB" };
		
		printIntArray(isbn);
		
		int bookNr = 455;
		int index = Arrays.binarySearch(isbn, bookNr);
		
		if (index < 0) {
			System.out.println("The book was not found.");
		} else {
			System.out.println("The title is '" + title[index] + "'.");
		}
		
	}
	
	public static void printIntArray(int[] a) {
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
