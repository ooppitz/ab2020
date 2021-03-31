package de.die_gfi.philipp.enumexercise;

/**
 * Ein Klasse welche einen Kalender darstellen soll.
 *
 * @author Philipp Kumitz
 * @version 0.1
 * @see Monat
 */
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

    /**
     * Berechnet die Tage in einem Monat
     *
     * @param jahr Jahresangabe zur Berechnung von Schaltjahren
     * @param m Ein Monat
     * @return 28, 29, 30 oder 31 je nach Monat und ob es ein Schaltjahr ist, -1 wenn etwas schiefgeht
     */
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

    /**
     * Berechnet die Tage in einem Monat
     *
     * @param jahr Jahresangabe zur Berechnung von Schaltjahren
     * @param m Ein Monat als numerische Angabe (1 ist Januar, 12 ist Dezember)
     * @return 28, 29, 30 oder 31 je nach Monat und ob es ein Schaltjahr ist, -1 wenn etwas schiefgeht
     */
    public static int berechneTageProMonat(int jahr, int m) {
        return berechneTageProMonat(jahr, Monat.valueOf(m));
    }

    /**
     * Berechnet die Nummer von einem Tag eines bestimmten Monats eines bestimmten Jahres
     *
     * @param jahr Ein Jahr
     * @param m Ein Monat als Konstante von {@link Monat}
     * @param tag Ein Tag
     * @return Nummer des Tages zu dem gegebenen vollen Datum
     */
    static int berechneTagesNummer(int jahr, Monat m, int tag) {
        return berechneTagesNummer(jahr, m.getNumericValue(), tag);
    }

    /**
     * Berechnet die Nummer von einem Tag eines bestimmten Monats eines bestimmten Jahres
     *
     * @param jahr Ein Jahr
     * @param m Ein Monat als numerische Angabe (1 ist Januar, 12 ist Dezember)
     * @param tag Ein Tag
     * @return Nummer des Tages zu dem gegebenen vollen Datum
     */
    static int berechneTagesNummer(int jahr, int m, int tag) {
        int summe = 0;
        for (int i = 1; i < m; i++) {
            summe += berechneTageProMonat(jahr, m);
        }
        summe += tag;
        return summe;
    }
}
