package de.die_gfi.philipp.enumexercise;

public class Kalender {
    public static void main(String[] args) {
        int zaehler = berechneTageproMonat(1984, Monat.FEBRUAR);
        System.out.println(zaehler);

        zaehler = berechneTageproMonat(1900, Monat.FEBRUAR);
        System.out.println(zaehler);

        zaehler = berechneTageproMonat(2000, Monat.FEBRUAR);
        System.out.println(zaehler);

        zaehler = berechneTageproMonat(2004, Monat.AUGUST);
        System.out.println(Monat.AUGUST + " " + zaehler);

        zaehler = berechneTageproMonat(1948, Monat.OKTOBER);
        System.out.println(Monat.OKTOBER + " " + zaehler);
    }

    public static int berechneTageproMonat(int jahr, Monat m) {
        switch (m) {
            case JANUAR, MAERZ, MAI, JULI, AUGUST, OKTOBER, DEZEMBER -> {
                return 31;
            }
            case FEBRUAR -> {
                if (jahr % 100 != 0 && jahr % 4 == 0 || jahr % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            }
            case APRIL, JUNI, SEPTEMBER, NOVEMBER -> {
                return 30;
            }
        }
        return -1;
    }

    public static int berechneTageproMonat(int jahr, int m) {
        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                if (jahr % 100 != 0 && jahr % 4 == 0 || jahr % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
        }
        return -1;
    }
}
