package de.die_gfi.philipp.enumexercise;

public class Kalender {
    public static void main(String[] args) {
        int zaehler = berechneTageProMonat(1984, Monat.FEBRUAR);
        System.out.println(zaehler);

        zaehler = berechneTageProMonat(1900, Monat.FEBRUAR);
        System.out.println(zaehler);

        zaehler = berechneTageProMonat(2000, Monat.FEBRUAR);
        System.out.println(zaehler);

        zaehler = berechneTageProMonat(2004, 8);
        System.out.println(Monat.AUGUST + " " + zaehler);

        zaehler = berechneTageProMonat(1948, Monat.OKTOBER);
        System.out.println(Monat.OKTOBER + " " + zaehler);
    }

    public static int berechneTageProMonat(int jahr, Monat m) {
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

    public static int berechneTageProMonat(int jahr, int m) {
        return berechneTageProMonat(jahr, Monat.valueOf(m));
    }
}
