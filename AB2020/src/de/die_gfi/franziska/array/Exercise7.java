package de.die_gfi.franziska.array;

import java.util.ArrayList;

/**
 * 
 * 7.Write a Java program to remove a specific element from an array. 
 * 
 * @author Franzi
 *
 */


public class Exercise7 {

	public static void main(String[] args) {

		ArrayList<Integer> arrI = new ArrayList<Integer>();

		arrI.add(1);
		arrI.add(5);
		arrI.add(9);
		arrI.add(43);

		System.out.println("Original array: " + arrI);

		arrI.remove(arrI.indexOf(5));

		System.out.println("Array after removal: " + arrI);

	}

}
