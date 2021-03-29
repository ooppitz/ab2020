package de.die_gfi.philipp.oop;

public class Person {
    int alter;
    int koerpergroesseInCm;
    double gewichtInKg;
    String vorname;
    String nachname;

    public Person(String vorname, String nachname) {
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
