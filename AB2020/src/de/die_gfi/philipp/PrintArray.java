package de.die_gfi.philipp;

import de.die_gfi.util.Print;

public class PrintArray {
    public static void main(String[] args) {
        int lowerBound = 2, upperBound = 242, index = 0;
        int[] intArray = new int[upperBound - lowerBound + 1];

        int counter = lowerBound;
        while (counter <= upperBound) {
            intArray[index] = counter++;
            index++;
        }

        Print.printArray(intArray);
    }
}
