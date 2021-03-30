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

    /**
     *
     * @param laborwertVitA Vitaminspiegel von Vitamin A in &mu;g/dl
     */
    @Override
    public void setLaborwertVitA(double laborwertVitA) {
        this.laborwertVitA = laborwertVitA;
    }

    /**
     *
     * @param laborwertVitC Vitaminspiegel von Vitamin C in &mu;g/dl
     */
    @Override
    public void setLaborwertVitC(double laborwertVitC) {
        this.laborwertVitC = laborwertVitC;
    }

    /**
     *
     * @param laborwertVitD Vitaminspiegel von Vitamin D in &mu;g/dl
     */
    @Override
    public void setLaborwertVitD(double laborwertVitD) {
        this.laborwertVitD = laborwertVitD;
    }

    /**
     *
     * @return Vitaminspiegel von Vitamin A in &mu;g/dl
     */
    @Override
    public double getLaborwertVitA() {
        return laborwertVitA;
    }

    /**
     *
     * @return Vitaminspiegel von Vitamin C in &mu;g/dl
     */
    @Override
    public double getLaborwertVitC() {
        return laborwertVitC;
    }

    /**
     *
     * @return Vitaminspiegel von Vitamin D in &mu;g/dl
     */
    @Override
    public double getLaborwertVitD() {
        return laborwertVitD;
    }
}
