package de.die_gfi.philipp;

public class Ellipsoid {
    public double radiusA;
    public double radiusB;
    public double radiusC;
    public double x;
    public double y;
    public double z;

    public Ellipsoid(double radiusA, double radiusB, double radiusC, double x, double y, double z) {
        this.radiusA = radiusA;
        this.radiusB = radiusB;
        this.radiusC = radiusC;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateVolume() {
        return (4.0/3.0) * Math.PI * radiusA * radiusB * radiusC;
    }

    public double calculateSurfaceArea() {
        double eigthFifths = 8.0/5.0;
        double ab = Math.pow(this.radiusA * this.radiusB, eigthFifths);
        double ac = Math.pow(this.radiusA * this.radiusC, eigthFifths);
        double bc = Math.pow(this.radiusB * this.radiusC, eigthFifths);
        return 4 * Math.PI * Math.pow((ab + ac + bc) / 3, 5.0/8.0);
    }
}
