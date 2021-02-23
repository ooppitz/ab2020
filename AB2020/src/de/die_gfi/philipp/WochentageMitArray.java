package de.die_gfi.philipp;

public class WochentageMitArray {
    static String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};

    public static void main(String[] args) {
        for (String tag : wochentage) {
            System.out.println(tag);
        }

        System.out.println();

        for (int i = wochentage.length - 1; i >= 0; i--) {
            System.out.println(wochentage[i]);
        }
    }
}
