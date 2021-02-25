package de.die_gfi.philipp.array;

import de.die_gfi.util.Print;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 13. Write a Java program to find the duplicate values of an array of string values.
 */
public class Exercise13 {
    public static void main(String[] args) {
        String[] strings = new String[5000];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            strings[i] = "" + getRandomChar() + getRandomChar() + getRandomChar();
        }

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    builder.append("\"").append(strings[i]).append("\" ");

                }
            }
        }

        System.out.println(builder.toString());
    }

    public static char getRandomChar() {
        return (char) ThreadLocalRandom.current().nextInt(33, 127);
    }
}
