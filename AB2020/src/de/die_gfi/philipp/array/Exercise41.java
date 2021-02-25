package de.die_gfi.philipp.array;

/**
 * 41. Write a Java program to find smallest and second smallest elements of a given array.
 */
public class Exercise41 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        Exercise40.fillArrayWithUniqueRandom(arr, 1, 1000);

        int smallest = arr[0];
        int secondSmallest = arr[1];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            } else {
                if (arr[i] < secondSmallest) {
                    secondSmallest = arr[i];
                }
            }
        }

        System.out.println("Smallest number in array is " + smallest + ", the second smallest is " + secondSmallest);
    }
}
