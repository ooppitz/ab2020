package de.die_gfi.philipp.array;

import java.util.ArrayList;

/**
 * 22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
 */
public class Exercise22 {

    public static void main(String[] args) {
        int[] arr = new int[100]; // Array um alle Zahlen von 1 bis 100 zu speichern

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // i mit einem Offset von 1 versehen um alle Zahlen von 1 bis 100 zu kriegen.
        }

        int searchedSum= 12;
        ArrayList<String> list = findSumPairs(arr, searchedSum);

        for (String str : list) {
            System.out.println(str);
        }
    }

    private static ArrayList<String> findSumPairs(int[] array, int searchedSum) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == searchedSum) {
                    list.add("Index " + i + " + Index " + j + "\t| " + array[i] + " + " + array[j] + " = " + (array[i] + array[j]));
                }
            }
        }

        return list;
    }

}
