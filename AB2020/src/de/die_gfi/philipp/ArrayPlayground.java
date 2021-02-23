package de.die_gfi.philipp;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayPlayground {
    public static void main(String[] args) {
        int[] intArray = new int[25];
        Arrays.fill(intArray, 1);
        for (int h = 1; h <= intArray.length; h++)
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = intArray[i] + i * h;
            }

        System.out.println(Arrays.toString(intArray));

        int[][] multiInt = new int[5][5];
        for (int i = 0; i < multiInt.length; i++) {
            for (int j = 0; j < multiInt[i].length; j++) {
                multiInt[i][j] = ThreadLocalRandom.current().nextInt(i * j * 10, (i + 1) * 100);
            }
        }

        System.out.print("[");
        for (int i = 0; i < multiInt.length; i++) {
            System.out.print(Arrays.toString(multiInt[i]));
            if (i != multiInt.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
