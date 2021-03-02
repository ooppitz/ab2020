package de.die_gfi.philipp.geometry;

public class Square extends Rectangle{

    public Square(double a, double x, double y) {
        super(a, a, x, y);
    }

    @Override
    public String toString() {
        return "{P1: (" + this.x + "|" + this.y + "), side length = " + this.a + "}";
    }
}
