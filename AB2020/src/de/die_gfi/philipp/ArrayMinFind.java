package de.die_gfi.philipp;

public class ArrayMinFind {
    public static void main(String[] args) {
        int[] ints = {0,2,4,-6,8,-10};
        int minVal = Integer.MAX_VALUE;
        int minPos = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < minVal) {
                minPos = i;
                minVal = ints[i];
            }
        }

        System.out.println("Minimalwert zum ersten mal bei Index " + minPos + " mit dem Wert " + minVal);
    }
}
