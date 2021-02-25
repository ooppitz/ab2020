package de.die_gfi.philipp.array;

import java.util.Arrays;

/**
 * 5. Write a Java program to test if an array contains a specific value.
 */
public class Exercise5 {
    public static void main(String[] args) {
        int[] arr = {53, 95, 78, 154, 49, 276, 44, 98, 76, 88, 69, 32, 110, 34, 35, 87, 94, 121, 589, 382, 190, 583, 238, 382, 19};

        int numberToLookFor = 87;

        findNumberInArray(arr, numberToLookFor);
    }

    private static void findNumberInArray(int[] arr, int numberToLookFor) {
        int[] cloneArray = arr.clone();
        Arrays.sort(cloneArray);
        int indexOfNumber = Arrays.binarySearch(cloneArray, numberToLookFor);

        if (indexOfNumber >= 0) {
            System.out.println("The number you are looking for is in the array.");
        } else {
            System.out.println("The number you are looking for isn't in the array.");
        }
    }
}
