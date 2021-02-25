package de.die_gfi.philipp.array;

/**
 * 4. Write a Java program to calculate the average value of array elements.
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 78, 154, 498, 2, 4, 98, 76, 8, 6, 32, 110, 34, 35, 87, 94, 121, 589, 382, 190, 583, 238, 382, 19};

        int sum = 0;

        for (int number : arr) {
            sum += number;
        }

        double average = (double) sum / arr.length;

        System.out.println("The average value of the array is: " + average);
    }
}
