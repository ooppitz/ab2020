package de.die_gfi.philipp.array;

import de.die_gfi.util.Print;

/**
 * 8. Write a Java program to copy an array by iterating the array.
 */
public class Exercise8 {
    public static void main(String[] args) {
        int[] arr1 = {6, 4, 34, 75, 8, 45, 8, 8, 56, 54, 55, 88, 4, 8, 4, 5, 8, 98, 3, 5};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }

        Print.printArray(arr1);
        Print.printArray(arr2);
    }
}
