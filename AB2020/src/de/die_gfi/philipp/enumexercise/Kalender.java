package de.die_gfi.philipp.enumexercise;

public class Kalender {
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
            default -> {
                return 30;
            }
        }

    }
}
