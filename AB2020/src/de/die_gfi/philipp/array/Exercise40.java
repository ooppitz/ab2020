package de.die_gfi.philipp.array;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 40. Write a Java program to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero.
 */
public class Exercise40 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        fillArrayWithUniqueRandom(arr, -1000, 1000);

        int min1Pos = 0;
        int min2Pos = 1;
        int minSum = arr[0] + arr[1];

        for (int i = 0; i < arr.length - 1; i++) {
            for ( int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(minSum) > Math.abs(sum)) {
                    minSum = sum;
                    min1Pos = i;
                    min2Pos = j;
                }
            }
        }

        System.out.println("Sum closest to 0 is " + minSum + " with the elements at index " + min1Pos + " (" +
                arr[min1Pos] + ") and index " + min2Pos + " (" + arr[min2Pos] + ")");



    }

    /**
     * Fills an {@link java.lang.reflect.Array} with random elements, of which all are unique
     * @param array an empty, non null, array
     *
     * @param lBound left (low) bound (inclusive) of the random range
     * @param rBound right (high) bound (inclusive) of the random range
     * @throws IllegalArgumentException Thrown if the amount of possible values is less than the length of the array.
     */
    public static void fillArrayWithUniqueRandom(int[] array, int lBound, int rBound) {
        if (Math.abs(lBound) + Math.abs(rBound) < array.length) {
            throw new IllegalArgumentException("Less possible values than array has elements.");
        }
        for (int i = 0; i < array.length; i++) {
            int num;
            while (true) {
                num = ThreadLocalRandom.current().nextInt(lBound, rBound + 1);
                boolean found = false;

                for (int j = i - 1; j >= 0; j--) {
                    if (num == array[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    break;
                }
            }
            array[i] = num;
        }

    }
}
