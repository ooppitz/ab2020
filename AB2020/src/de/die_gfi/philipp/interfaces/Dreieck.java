package de.die_gfi.philipp.interfaces;

public class Dreieck {
    double a;
    double b;
    double c;
    static int count;

    public Dreieck(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        count++;
    }
}
