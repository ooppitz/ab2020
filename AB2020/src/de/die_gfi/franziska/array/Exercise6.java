package de.die_gfi.franziska.array;

import java.util.ArrayList;

/**
 * 
 * 6.Write a Java program to find the index of an array element.
 * 
 * @author Franzi
 *
 */

public class Exercise6 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(44);
		arr.add(5);
		arr.add(8);

		System.out.println("The number(8) can be found at index: " + arr.indexOf(8));

	}

}
