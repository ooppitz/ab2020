package de.die_gfi.philipp.interfaces;

public class PunktTest {

    public static void main(String[] args) {
        Punkt p = new Punkt(9);
        Punkt q = new Punkt(3, 7);
        Punkt3D r = new Punkt3D(9, 3, 2);
        Punkt3D s = new Punkt3D(7);
        Punkt3D t = new Punkt3D(7, 4);

        System.out.println("2D: " + Punkt.count2D);
        System.out.println("3D: " + Punkt3D.count3D);

    }

}

class Punkt {
    double x;
    double y;
    static int count2D;

    public Punkt(double x) {
        this(x, 0);
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
        if (!(this instanceof Punkt3D)) {
            count2D++;
        }
    }

}

class Punkt3D extends Punkt{
    double z;
    static int count3D;

    public Punkt3D(double x) {
        this(x, 0, 0);

    }

    public Punkt3D(double x, double y) {
        this(x, y, 0);
    }

    public Punkt3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
        count3D++;
    }

}