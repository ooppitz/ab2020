package de.die_gfi.philipp.oop;

public class Patient extends Person{
    String diagnose;
    String[] symptome;

    static final String UNBEKANNTE_DIAGNOSE = "###";

    public Patient(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public Patient(String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
    }

    public Patient(String vorname, String nachname, int alter, int koerpergroesseInCm, double gewichtInKg) {
        super(vorname, nachname, alter, koerpergroesseInCm, gewichtInKg);
    }

    public Patient(String vorname, String nachname, int alter, int koerpergroesseInCm, double gewichtInKg, String[] symptome) {
        super(vorname, nachname, alter, koerpergroesseInCm, gewichtInKg);
        this.symptome = symptome;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setSymptome(String[] symptome) {
        this.symptome = symptome;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += (diagnose.equals("###")) ? ("Diagnose = " + diagnose + " ") : "";
        return str;
    }
}
