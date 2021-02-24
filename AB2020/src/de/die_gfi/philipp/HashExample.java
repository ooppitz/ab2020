package de.die_gfi.philipp;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HashExample {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int lowerBound = 100, upperBound = 500;

        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(lowerBound, upperBound + 1);
        }

        int counter = 0, amountRandomizations = 0;
        int initialHash = Arrays.hashCode(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Integer.toBinaryString(initialHash));

        while (true) {
            int[] copiedArray = array.clone();

            if (counter % 1000 == 0) {
                ++amountRandomizations;
                if (amountRandomizations % (array.length/4) == 0) {
                    System.out.println("Current amount of randomizations: " + amountRandomizations);
                }
            }

            for (int i = 0; i < amountRandomizations; i++) {
                arrayRandomizer(copiedArray, lowerBound, upperBound);
            }
            int newHash = Arrays.hashCode(copiedArray);
            if (initialHash == newHash && Arrays.mismatch(array, copiedArray) != -1) {
                System.out.println(Arrays.toString(copiedArray));
                System.out.println(Integer.toBinaryString(newHash));
                break;
            }

            if (amountRandomizations > (array.length/40) * array.length) {
                break;
            }

            counter++;
        }

    }

    private static void arrayRandomizer(int[] array, int fromValue, int toValue) {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, array.length);
        array[randomIndex] = ThreadLocalRandom.current().nextInt(fromValue, toValue + 1);
    }
}
