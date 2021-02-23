package de.die_gfi.philipp;

import java.util.ArrayList;

public class WochentageList {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("Montag");
        arrList.add("Dienstag");
        arrList.add("Mittwoch");
        arrList.add("Donnerstag");
        arrList.add("Freitag");
        arrList.add("Samstag");
        arrList.add("Sonntag");

        for (String s : arrList) {
            System.out.println(s);
        }
        for (int i = arrList.size() - 1; i >= 0; i--) {
            System.out.println(arrList.get(i));
        }

    }
}
