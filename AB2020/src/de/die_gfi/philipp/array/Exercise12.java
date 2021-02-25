package de.die_gfi.philipp.array;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 12. Write a Java program to find the duplicate values of an array of integer values.
 */
public class Exercise12 {
    public static void main(String[] args) {
        int[] ints = new int[100];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = ThreadLocalRandom.current().nextInt(100, 200);
        }

        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    if (!builder.toString().contains(Integer.toString(ints[i]))) {
                        builder.append(ints[i]).append(" ");
                    }
                }
            }
        }

        System.out.println(builder.toString());
    }

}
