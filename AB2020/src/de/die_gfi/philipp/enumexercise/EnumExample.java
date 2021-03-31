package de.die_gfi.philipp.enumexercise;

public class EnumExample {
    public static void main(String[] args) {
        System.out.println(Wochentag.MONTAG);
    }

    public static String druckeWochentag(Wochentag tag) {
        return tag.toString();
    }
}
