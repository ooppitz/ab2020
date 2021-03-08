package de.die_gfi.philipp.interfaces;

public class PunktTest {

    public static void main(String[] args) {
        Punkt p = new Punkt(9);
        Punkt q = new Punkt(3, 7);
        Punkt3D r = new Punkt3D(9, 3, 2);
        Punkt3D s = new Punkt3D(7);
        Punkt3D t = new Punkt3D(7, 4);

    }

}

class Punkt {
    double x;
    double y;

    public Punkt(double x) {
        this.x = x;
    }

    public Punkt(double x, double y) {
        this(x);
        this.y = y;
    }

}

class Punkt3D extends Punkt{
    double z;

    public Punkt3D(double x) {
        super(x);
    }

    public Punkt3D(double x, double y) {
        super(x, y);
    }

    public Punkt3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

}