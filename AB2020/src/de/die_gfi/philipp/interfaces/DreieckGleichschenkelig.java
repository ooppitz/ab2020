package de.die_gfi.philipp.interfaces;

public class DreieckGleichschenkelig extends Dreieck {

    static int count;

    public DreieckGleichschenkelig(double a, double c) {
        super(a, c, c);
        count++;
    }
}
