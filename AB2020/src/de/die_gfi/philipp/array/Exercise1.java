package de.die_gfi.philipp.array;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr1 = {5, 9, 2, 4, 98, 7, 1, 3, 76, 8, 6, 32};
        String[] arr2 = {"Philipp", "Eva", "Daniel", "Jonathan", "Robin", "Ulrich", "Franziska", "Felix"};

        System.out.println("Unsorted Numeric Array: " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(arr1));

        System.out.println("Unsorted String Array: " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted String Array: " + Arrays.toString(arr2));
    }
}
