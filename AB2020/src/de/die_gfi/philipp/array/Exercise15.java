package de.die_gfi.philipp.array;

import de.die_gfi.util.Print;

import java.util.ArrayList;

/**
 * 15. Write a Java program to find the common elements between two arrays of integers.
 */
public class Exercise15 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 8, 9};
        int[] arr2 = {2, 4, 6, 8, 10, 12};

        System.out.print("Array1: ");
        Print.printArray(arr1);

        System.out.print("Array2: ");
        Print.printArray(arr2);

        ArrayList<Integer> commonElements = findCommon(arr1, arr2);

        System.out.print("Common elements are: ");
        for (int num : commonElements) {
            System.out.print(num + " ");
        }
    }

    private static ArrayList<Integer> findCommon(int[] arr1, int[] arr2) {
        ArrayList<Integer> commonElements = new ArrayList<>();

        for (int numValue1 : arr1) {
            for (int numValue2 : arr2) {
                if (numValue1 == numValue2) {
                    commonElements.add(numValue2);
                }
            }
        }
        return commonElements;
    }
}
