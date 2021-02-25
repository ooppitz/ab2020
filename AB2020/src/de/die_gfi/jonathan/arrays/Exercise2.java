//Write a Java program to sum values of an array
package de.die_gfi.jonathan.arrays;

import de.die_gfi.util.Print;

public class Exercise2 {
public static void main(String[] args) {
	int[] intArray = { 70, 3000, 5, 40, 20, 35, 89, -1, -60, -500, 70, 8 };
	int summ = 0;
for (int i = 0; i < intArray.length; i++) {
	summ=summ+intArray[i];
}
Print.printArray(intArray);
System.out.println("= "+summ);
}
}
