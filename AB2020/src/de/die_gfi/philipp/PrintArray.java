package de.die_gfi.philipp;

import de.die_gfi.util.Print;

public class PrintArray {
    public static void main(String[] args) {
        int[] intArray = new int[241];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 2;
        }

        Print.printArray(intArray);
    }
}
