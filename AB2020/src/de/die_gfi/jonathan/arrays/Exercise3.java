//Write a Java program to print the following grid.
package de.die_gfi.jonathan.arrays;

import java.util.Arrays;

import de.die_gfi.util.Print;

public class Exercise3 {
public static void main(String[] args) {
	String [] minus=new String[11];
	Arrays.fill(minus, "\n- - - - - - - - - -");
	Print.printArray(minus);
}
}
