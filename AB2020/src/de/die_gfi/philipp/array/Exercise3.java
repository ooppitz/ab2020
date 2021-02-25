package de.die_gfi.philipp.array;

import java.util.Arrays;

/**
 * 3. Write a Java program to print the following grid.
  */
public class Exercise3 {
    public static void main(String[] args) {
        int amountLines = 10, amountCharsPerLine = 10;
        char charToPrint = '-';

        char[][] characters = new char[amountLines][amountCharsPerLine];

        for (char[] character : characters) {
            Arrays.fill(character, charToPrint);
        }

        for (char[] line : characters) {
            for (char character : line) {
                System.out.print(character + " ");
            }
            System.out.println();
        }

    }
}
