package de.die_gfi.philipp.array;

public class Exercise2 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 4, 98, 7, 1, 3, 76, 8, 6, 32, 110, 34, 35, 87, 94, 121, 589, 382, 190, 583, 238, 382, 19};

        int sum = 0;

        for (int number : arr) {
            sum += number;
        }

        System.out.println("The sum of all elements in the array is " + sum);
    }
}
