package de.die_gfi.philipp.array;

import de.die_gfi.util.Print;

import java.util.Arrays;

/**
 * 7. Write a Java program to remove a specific element from an array.
 */
public class Exercise7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 11};

        Print.printArray(arr);
        arr = removeElementFromArray(arr, 5);
        Print.printArray(arr);

    }

    /**
     *
     * @param array An array with contents
     * @param elementToRemove The element which is going to be removed
     * @return A new array with the element removed, if it could be removed, otherwise it just returns the original array
     */
    public static int[] removeElementFromArray(int[] array, int elementToRemove) {
        int[] clonedArray = array.clone();
        int indexOfElement = Exercise6.findIndexOfElement(clonedArray, elementToRemove);

        if (indexOfElement != -1) {
            for (int i = indexOfElement; i < clonedArray.length - 1; i++) {
                clonedArray[i] = clonedArray[i + 1];
            }
             clonedArray = Arrays.copyOf(clonedArray, clonedArray.length - 1);
        }
        return clonedArray;
    }
}
