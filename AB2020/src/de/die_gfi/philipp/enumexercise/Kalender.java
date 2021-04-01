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

        System.out.println(berechneTagesNummer(2003, Monat.MAERZ, 1));
        System.out.println(berechneTagesNummer(2000, 3, 1));

        System.out.println("-".repeat(25));

        System.out.println(berechneWochentag(1, 1));
        System.out.println(berechneWochentag(1, 2));
        System.out.println(berechneWochentag(8, 14));

        System.out.println("-".repeat(25));

        System.out.println("04.07.1992 ist ein Samstag, Algorithmus sagt: " + berechneWochentag(1992, 7, 4));
        System.out.println("12.08.2023 ist ein Samstag, Algorithmus sagt: " + berechneWochentag(2023, 8, 12));
        System.out.println("25.01.2012 ist ein Mittwoch, Algorithmus sagt: " + berechneWochentag(2012, 1, 25));
        System.out.println("25.01.2020 ist ein Montag, Algorithmus sagt: " + berechneWochentag(2020, 1, 25));
        System.out.println("Anderer Algorithmus sagt: " + berechneWochentag(1, 25));
    }

    /**
     * Berechnet die Tage in einem Monat
     *
     * @param jahr Jahresangabe zur Berechnung von Schaltjahren
     * @param m    Ein Monat
     * @return 28, 29, 30 oder 31 je nach Monat und ob es ein Schaltjahr ist
     * @throws IllegalArgumentException wenn was schiefgeht
     */
    public static int berechneTageProMonat(int jahr, Monat m) {
        switch (m) {
            case JANUAR, MAERZ, MAI, JULI, AUGUST, OKTOBER, DEZEMBER -> {
                return 31;
            }
            case FEBRUAR -> {
                if (checkLeapYear(jahr)) {
                    return 29;
                } else {
                    return 28;
                }
            }
            case APRIL, JUNI, SEPTEMBER, NOVEMBER -> {
                return 30;
            }
        }
        throw new IllegalArgumentException();
    }

    /**
     * Berechnet die Tage in einem Monat
     *
     * @param jahr Jahresangabe zur Berechnung von Schaltjahren
     * @param m    Ein Monat als numerische Angabe (1 ist Januar, 12 ist Dezember)
     * @return 28, 29, 30 oder 31 je nach Monat und ob es ein Schaltjahr ist, -1 wenn etwas schiefgeht
     */
    public static int berechneTageProMonat(int jahr, int m) {
        return berechneTageProMonat(jahr, Monat.valueOf(m));
    }

    /**
     *
     * @param jahr Ein Jahr
     * @return 366 für ein Schaltjahr, 365 für ein normales Jahr
     */
    public static int berechneTageProJahr(int jahr) {
        return (checkLeapYear(jahr)) ? 366 : 365;
    }

    /**
     * Berechnet die Nummer von einem Tag eines bestimmten Monats eines bestimmten Jahres
     *
     * @param jahr Ein Jahr
     * @param m    Ein Monat als Konstante von {@link Monat}
     * @param tag  Ein Tag
     * @return Nummer des Tages zu dem gegebenen vollen Datum, -1 falls ein ung&uuml;ltiges Datum gegeben wurde
     */
    static int berechneTagesNummer(int jahr, Monat m, int tag) {
        return berechneTagesNummer(jahr, m.getNumericValue(), tag);
    }

    /**
     * Berechnet die Nummer von einem Tag eines bestimmten Monats eines bestimmten Jahres
     *
     * @param jahr Ein Jahr
     * @param m    Ein Monat als numerische Angabe (1 ist Januar, 12 ist Dezember)
     * @param tag  Ein Tag
     * @return Nummer des Tages zu dem gegebenen vollen Datum
     * @throws IllegalArgumentException Wenn ein falsches Datum &uuml;bergeben wurde
     */
    static int berechneTagesNummer(int jahr, int m, int tag) {
        if (!checkDate(jahr, m, tag)) {
            errorHandler(jahr, m, tag);
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
     * @param m   ein Monat
     * @param tag ein Tag
     * @return den Wochentag von dem spezifizierten Tag im spezifizierten Monat
     */
    static Wochentag berechneWochentag(int m, int tag) {
        int ersterTag = Wochentag.FREITAG.getNumericValue();
        int magischeZahlFuerDenErstenTag = 1;
        int nummerVomGesuchtenTag = berechneTagesNummer(2021, m, tag);

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
     * @param m   ein Monat
     * @param tag ein Tag
     * @return den Wochentag von dem spezifizierten Tag im spezifizierten Monat
     */
    static Wochentag berechneWochentag(Monat m, int tag) {
        return berechneWochentag(m.getNumericValue(), tag);
    }

    /**
     * Berechnet den Wochentag von einem Tag, beginnened mit "The Epoch" (1970-01-01)
     *
     * @param jahr Ein Jahr, 1970 oder gr&ouml;&szlig;er
     * @param m    Ein Monat
     * @param tag  Ein Tag
     * @return Den Wochentag vom gegebenen Datum
     */
    static Wochentag berechneWochentag(int jahr, int m, int tag) {
        int epochYear = 1921;
        int epochDay = Wochentag.SAMSTAG.getNumericValue();
        int eineMagischeZahl = 1;
        if (jahr >= 1970) {
            int nummerVomGesuchtenTag = berechneTagesNummer(jahr, m, tag);
            int tageSeitEpoch = 0;
            for (int j = epochYear; j < jahr; j++) {
                tageSeitEpoch += berechneTageProJahr(jahr);
            }
            tageSeitEpoch += nummerVomGesuchtenTag;
            int zahlVomWochentag = tageSeitEpoch - (tageSeitEpoch / 7) * 7 + epochDay;
            if (zahlVomWochentag > 7) {
                zahlVomWochentag -= 7;
            }
            return Wochentag.valueOf(zahlVomWochentag);

        } else {
            throw new IllegalArgumentException("Year " + jahr + "smaller than 1970, only years later thatn or equal " +
                    "to 1970 are allowed.");
        }
    }

    /**
     * Berechnet den Wochentag von einem Tag, beginnened mit "The Epoch" (1970-01-01)
     *
     * @param jahr Ein Jahr, 1970 oder gr&ouml;&szlig;er
     * @param m    Ein Monat
     * @param tag  Ein Tag
     * @return Den Wochentag vom gegebenen Datum
     */
    static Wochentag berechneWochentag(int jahr, Monat m, int tag) {
        return berechneWochentag(jahr, m.getNumericValue(), tag);
    }

    /**
     * Pr&uuml;ft ein gegebenes Datum auf G&uuml;ltigkeit
     *
     * @param jahr  Ein Jahr
     * @param monat Ein Monat
     * @param tag   Ein Tag
     * @return true wenn das Datum g&uuml;ltig ist, false wenn es ung&uuml;ltig ist
     */
    static boolean checkDate(int jahr, int monat, int tag) {
        return (tag >= 1 && tag <= berechneTageProMonat(jahr, monat)) && (monat >= 1 && monat <= 12);
    }

    /**
     * Pr&uuml;ft ein gegebenes Datum auf G&uuml;ltigkeit
     *
     * @param jahr  Ein Jahr
     * @param monat Ein Monat
     * @param tag   Ein Tag
     * @return true wenn das Datum g&uuml;ltig ist, false wenn es ung&uuml;ltig ist
     */
    static boolean checkDate(int jahr, Monat monat, int tag) {
        return checkDate(jahr, monat.getNumericValue(), tag);

    }

    /**
     * Diese Methode erzeugt verschiedene Exceptions je nach dem was f&uuml;r ein Fehler gemacht wurde
     *
     * @param jahr  Ein Jahr
     * @param monat Ein Monat
     * @param tag   Ein Tag
     * @throws IllegalArgumentException Wenn ein fehlerhaftes Datum &uuml;bergeben wird
     */
    static void errorHandler(int jahr, Monat monat, int tag) {
        errorHandler(jahr, monat.getNumericValue(), tag);
    }

    /**
     * Diese Methode erzeugt verschiedene Exceptions je nach dem was f&uuml;r ein Fehler gemacht wurde
     *
     * @param jahr  Ein Jahr
     * @param monat Ein Monat
     * @param tag   Ein Tag
     * @throws IllegalArgumentException Wenn ein fehlerhaftes Datum &uuml;bergeben wird
     */
    static void errorHandler(int jahr, int monat, int tag) {
        if (tag < 1) {
            throw new IllegalArgumentException("Tag kleiner als 1");
        }

        int mTage = berechneTageProMonat(jahr, monat);
        if (tag > mTage) {
            if (!checkLeapYear(jahr) && monat == 2 && tag == 29) {
                throw new IllegalArgumentException("29. Februar ausserhalb von Schaltjahr, " + jahr + " ist kein Schaltjahr");
            } else throw new IllegalArgumentException("Tag " + tag + " ist groesser als " + mTage + " fuer den Monat " + monat);
        }

        if (monat < 1) {
            throw new IllegalArgumentException("Monat kleiner als 1, minimum erlaubt ist 1");
        }
        if (monat > 12) {
            throw new IllegalArgumentException("Monat groesser als 12, maximum erlaubt ist 12");
        }
    }

    /**
     * Pr&uuml;ft ob ein Jahr ein Schaltjahr ist
     *
     * @param jahr Ein jahr
     * @return true wenn das Jahr ein Schaltjahr ist, false wenn es kein Schaltjahr ist
     */
    static boolean checkLeapYear(int jahr) {
        return jahr % 100 != 0 && jahr % 4 == 0 || jahr % 400 == 0;
    }

    void druckeMonat(int jahr, int monat) {

    }
}
