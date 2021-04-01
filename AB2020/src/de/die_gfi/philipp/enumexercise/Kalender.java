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
        int zaehler = berechneTageProMonat(1900, Monat.FEBRUAR);
        System.out.println(zaehler);

        zaehler = berechneTageProMonat(2000, Monat.FEBRUAR);
        System.out.println(zaehler);

        zaehler = berechneTageProMonat(2004, 8);
        System.out.println(Monat.AUGUST + " " + zaehler);

        System.out.println("-".repeat(25));

        zaehler = berechneTagesNummer(2005, 4, 16);
        System.out.println(zaehler);
        System.out.println(berechneTagesNummer(2003, Monat.FEBRUAR, 29));
        System.out.println(berechneTagesNummer(2003, Monat.MAERZ, 1));
        System.out.println(berechneTagesNummer(2000, 3, 1));

        System.out.println("-".repeat(25));

        System.out.println(berechneWochentag(1, 1));
        System.out.println(berechneWochentag(1,2));
        System.out.println(berechneWochentag(8, 14));
        System.out.println(berechneWochentag(2, 29));
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
     * @return Nummer des Tages zu dem gegebenen vollen Datum, -1 falls ein ung&uuml;ltiges Datum gegeben wurde
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
     * @return Nummer des Tages zu dem gegebenen vollen Datum, -1 falls ein ung&uuml;ltiges Datum gegeben wurde.
     */
    static int berechneTagesNummer(int jahr, int m, int tag) {
        if (tag > berechneTageProMonat(jahr, m) || m > 12 || m <= 0 || tag <= 0) {
            return -1;
        }
        int summe = 0;
        for (int i = 1; i < m; i++) {
            summe += berechneTageProMonat(jahr, i);
        }
        summe += tag;
        return summe;
    }

    /**
     * Berechnet den Wochentag von einem Tag im Jahr 2021
     *
     * @param m ein Monat
     * @param tag ein Tag
     * @return den Wochentag von dem spezifizierten Tag im spezifizierten Monat, null wenn der Tag ung&uuml;ltig ist
     */
    static Wochentag berechneWochentag(int m, int tag) {
        int ersterTag = Wochentag.FREITAG.getNumericValue();
        int magischeZahlFuerDenErstenTag = 1;
        int nummerVomGesuchtenTag = berechneTagesNummer(2021, m, tag);
        if (nummerVomGesuchtenTag == -1) {
            return null;
        }

        int verliebeneTage = nummerVomGesuchtenTag % 7;
        verliebeneTage -= magischeZahlFuerDenErstenTag;

        int neuerWochentag = ersterTag + verliebeneTage;
        if (neuerWochentag > 7) {
            neuerWochentag -= 7;
        }

        return Wochentag.valueOf(neuerWochentag);
    }

    /**
     * Berechnet den Wochentag von einem Tag im Jahr 2021
     *
     * @param m ein Monat
     * @param tag ein Tag
     * @return den Wochentag von dem spezifizierten Tag im spezifizierten Monat, null wenn der Tag ung&uuml;ltig ist
     */
    static Wochentag berechneWochentag(Monat m, int tag) {
        return berechneWochentag(m.getNumericValue(), tag);
    }
}
