package de.die_gfi.philipp.array;

import de.die_gfi.util.Print;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 21. Write a Java program to convert an ArrayList to an array.
 */
public class Exercise21 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            intList.add(ThreadLocalRandom.current().nextInt(1, 100));
            strList.add("Shubbadu");
        }

        Integer[] intArr = convertArrayListToArray(Integer.class, intList);
        String[] strArr = convertArrayListToArray(String.class, strList);

        Print.printArray(intArr);
        Print.printArray(strArr);
    }

    public static <T> T[] convertArrayListToArray(Class<T> clazz, ArrayList<T> list) {
        int capacity = list.size();

        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(clazz, capacity);
        list.toArray(array);
        return array;
    }
}
