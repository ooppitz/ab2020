package de.die_gfi.philipp;

import java.util.Arrays;

public class ArraySort {
    static int[] ints = {0,2,4,-6,8,-10};
    // static int[] ints = {0, 2, 4, -6, 8, -10, -4, 5, 9, 10, -3, -7, -9, -12, 6, 18};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ints));

        quickSort(ints, 0, ints.length - 1);

        System.out.println(Arrays.toString(ints));
    }

    /** Sorts a given array in a partition around a pivot and end point
     * Found on https://stackabuse.com/sorting-algorithms-in-java/
     * @param array the array to partition
     * @param begin where the partition starts
     * @param end where the partition ends
     * @return The index of the new pivot point
     */
    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    /** Recursively runs the partition method to sort around a pivot point
     * Found on https://stackabuse.com/sorting-algorithms-in-java/
     *
     * @param array an array which is to be sorted
     * @param begin The starting index from where it begins to sort
     * @param end The last index to sort to
     */
    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }
}
