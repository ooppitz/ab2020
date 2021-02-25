package de.die_gfi.philipp.array;

import de.die_gfi.util.Print;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(100, 500);
        }

        int min = arr[0], max = arr[0];

        for (int number : arr) {
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
        }

        Print.printArray(arr);
        System.out.println("Mininum: " + min);
        System.out.println("Maximum: " + max);
    }
}
