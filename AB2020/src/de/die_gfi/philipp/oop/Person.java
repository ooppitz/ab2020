package de.die_gfi.philipp.oop;

public class Person {
    int alter;
    int koerpergroesseInCm;
    double gewichtInKg;
    String vorname;
    String nachname;

    private Person() {
        alter = -1;
        koerpergroesseInCm = -1;
        gewichtInKg = -1;
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
}
