package de.die_gfi.philipp.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 20. Write a Java program to convert an array to ArrayList.
 */
public class Exercise20 {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};

        ArrayList<Integer> arrList = convertArrayToArrayList(arr);

        System.out.print(arrList.toString());
    }

    public static <E> ArrayList<E> convertArrayToArrayList(E[] array) {

        return new ArrayList<>(Arrays.asList(array));
    }


}
