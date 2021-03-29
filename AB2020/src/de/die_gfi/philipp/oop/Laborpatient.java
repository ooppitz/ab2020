package de.die_gfi.philipp.oop;

public class Laborpatient extends Patient implements Vitaminspiegel{
    double laborwertVitA;
    double laborwertVitC;
    double laborwertVitD;


    public Laborpatient(String vorname, String nachname, int alter, int koerpergroesseInCm, double gewichtInKg) {
        super(vorname, nachname, alter, koerpergroesseInCm, gewichtInKg);
    }

    public Laborpatient(String vorname, String nachname, int alter, int koerpergroesseInCm, double gewichtInKg, String[] symptome) {
        super(vorname, nachname, alter, koerpergroesseInCm, gewichtInKg, symptome);
    }

    @Override
    public void setLaborwertVitA(double laborwertVitA) {
        this.laborwertVitA = laborwertVitA;
    }

    @Override
    public void setLaborwertVitC(double laborwertVitC) {
        this.laborwertVitC = laborwertVitC;
    }

    @Override
    public void setLaborwertVitD(double laborwertVitD) {
        this.laborwertVitD = laborwertVitD;
    }

    @Override
    public double getLaborwertVitA() {
        return laborwertVitA;
    }

    @Override
    public double getLaborwertVitC() {
        return laborwertVitC;
    }

    @Override
    public double getLaborwertVitD() {
        return laborwertVitD;
    }
}
