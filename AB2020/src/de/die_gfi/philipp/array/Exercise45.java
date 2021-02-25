package de.die_gfi.philipp.array;

import de.die_gfi.util.Print;

/**
 * 45. Write a Java program to cyclically rotate a given array clockwise by one.
 */
public class Exercise45 {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8};

        Print.printArray(integers);

        rotateArrayLeft(integers);

        Print.printArray(integers);

        rotateArrayRight(integers);
        rotateArrayRight(integers);

        Print.printArray(integers);
    }


    public static <T> void rotateArrayLeft(T[] array) {
        T element = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        array[array.length - 1] = element;
    }

    public static <T> void rotateArrayRight(T[] array) {
        T element = array[array.length-1];
        System.arraycopy(array, 0, array, 1, array.length-1);
        array[0] = element;
    }
}
