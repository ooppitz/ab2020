package de.die_gfi.philipp.oop;

public class Person {
    int alter;
    int koerpergroesseInCm;
    double gewichtInKg;
    String vorname;
    String nachname;

    static final int UNBEKANNTES_ALTER = -1;
    static final int UNBEKANNTE_KOERPERGROESSE = -1;
    static final double UNBEKANNTES_GEWICHT = -1.0;

    static final String UNBEKANNTER_VORNAME = "###";
    static final String UNBEKANNTER_NACHNAME = "###";

    private Person() {
        alter = UNBEKANNTES_ALTER;
        koerpergroesseInCm = UNBEKANNTE_KOERPERGROESSE;
        gewichtInKg = UNBEKANNTES_GEWICHT;
        vorname = UNBEKANNTER_VORNAME;
        nachname = UNBEKANNTER_NACHNAME;
    }

    public Person(String vorname, String nachname) {
        this();
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person(String vorname, String nachname, int alter) {
        this(vorname, nachname);
        this.alter = alter;
    }

    public Person(String vorname, String nachname, int alter, int koerpergroesseInCm, double gewichtInKg) {
        this(vorname, nachname, alter);
        this.koerpergroesseInCm = koerpergroesseInCm;
        this.gewichtInKg = gewichtInKg;
    }

    @Override
    public String toString() {
        String str = "";

        str += (!vorname.equals(UNBEKANNTER_VORNAME)) ? (vorname + " ") : "Vorname unbekannt ";
        str += (!nachname.equals(UNBEKANNTER_NACHNAME)) ? (nachname + " ") : "Nachname unbekannt ";
        str += (alter != UNBEKANNTES_ALTER) ? ("Alter = " + alter + " ") : "";
        str += (koerpergroesseInCm != UNBEKANNTE_KOERPERGROESSE) ? ("Koerpergroesse = " + koerpergroesseInCm + " ") : "";
        str += (gewichtInKg != UNBEKANNTES_GEWICHT) ? ("Gewicht = " + gewichtInKg + " ") : "";

        return str;
    }
}
