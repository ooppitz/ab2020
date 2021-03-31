package de.die_gfi.philipp.oop;

/**
 * Ein Interface f&uuml;r Vitaminspiegel
 */
public interface Vitaminspiegel {

    public void setLaborwertVitA(double laborwertVitA);
    public void setLaborwertVitC(double laborwertVitC);
    public void setLaborwertVitD(double laborwertVitD);

    public double getLaborwertVitA();
    public double getLaborwertVitC();
    public double getLaborwertVitD();

    public int getAlter();
}
