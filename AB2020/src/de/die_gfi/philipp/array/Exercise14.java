package de.die_gfi.philipp.array;

import de.die_gfi.util.Print;

import java.util.ArrayList;

/**
 * 14. Write a Java program to find the common elements between two arrays (string values).
 */
public class Exercise14 {
    public static void main(String[] args) {

        String[] arr1 = {"Sugar", "Flour", "Honey", "Cinnamon", "Baking Powder", "Milk"};
        String[] arr2 = {"Flour", "Yeast", "Salt", "Milk", "Walnut", "Water"};

        System.out.print("Array1: ");
        Print.printArray(arr1);

        System.out.print("Array2: ");
        Print.printArray(arr2);

        ArrayList<String> commonElements = findCommon(arr1, arr2);

        System.out.print("Common elements are: ");
        for (String str : commonElements) {
            System.out.print(str + " ");
        }

    }

    private static ArrayList<String> findCommon(String[] arr1, String[] arr2) {
        ArrayList<String> commonElements = new ArrayList<>();

        for (String value : arr1) {
            for (String s : arr2) {
                if (value.equals(s)) {
                    commonElements.add(s);
                }
            }
        }
        return commonElements;
    }
}
