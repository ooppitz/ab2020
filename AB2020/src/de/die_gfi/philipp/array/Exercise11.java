package de.die_gfi.philipp.array;

import de.die_gfi.util.Print;

/**
 * 11. Write a Java program to reverse an array of integer values.
 */
public class Exercise11 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5};

        Print.printArray(arr);

        for (int i = 0; i < arr.length/2; i++) {
            int buffer = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = buffer;
        }

        Print.printArray(arr);
    }
}
