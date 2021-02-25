package de.die_gfi.philipp.array;

/**
 * 6. Write a Java program to find the index of an array element.
 */
public class Exercise6 {
    public static void main(String[] args)  {
        int[] arr = {5, 9, 78, 154, 498, 2, 4, 98, 76, 8, 6, 32, 110, 39, 35, 87, 94, 121, 589, 382, 190, 583, 238, 382, 19};
        int numberToLookFor = 8;

        int indexOfElement = findIndexOfElement(arr, numberToLookFor);

        if (indexOfElement != -1) {
            System.out.println("The index of the element is " + indexOfElement);
        } else System.out.println("Couldn't find element.");
    }

    /**
     * A method which looks for elements in an array to find the index of it.
     *
     * Only searches for the first occurrence of an element. Always searches in the natural order of indices.
     *
     * @param array An array with elements present.
     * @param numberToFind The number which is being searched for
     * @return If element is found the index of the element, otherwise -1
     */
    public static int findIndexOfElement(int[] array, int numberToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }
}
