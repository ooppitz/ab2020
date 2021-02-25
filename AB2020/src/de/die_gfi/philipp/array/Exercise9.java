package de.die_gfi.philipp.array;

import de.die_gfi.util.Print;

import java.util.Arrays;

/**
 * 9. Write a Java program to insert an element (specific position) into an array.
 */
public class Exercise9 {
    public static void main(String[] args) {
        int[] array = {12, 13, 14, 15, 17, 18, 19, 20 , 21, 22};
        int elementToAdd = 16;
        int indexOfAddition = 4;

        Print.printArray(array);
        array = insertElement(array, elementToAdd, indexOfAddition);
        Print.printArray(array);

    }

    /**
     *
     * @param array An array
     * @param elementToInsert The element which is inserted into the array
     * @param index The index of where to insert the element
     * @return The new array with the element inserted.
     * @throws IndexOutOfBoundsException If the index is
     */
    public static int[] insertElement(int[] array, int elementToInsert, int index) {
        if (index < array.length && index >= 0) {
            int[] newArr = Arrays.copyOf(array, array.length + 1);
            for (int i = newArr.length - 1; i > index; i--) {
                newArr[i] = newArr[i - 1];
            }

            newArr[index] = elementToInsert;

            return newArr;
        } else {
            throw (new IndexOutOfBoundsException("The given index of '" + index + "' is out of bounds for the length of the array " + array.length));

        }

    }
}
