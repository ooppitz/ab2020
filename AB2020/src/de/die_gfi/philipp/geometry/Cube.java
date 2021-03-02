package de.die_gfi.philipp.geometry;

public class Cube extends Cuboid {

    public Cube(double k) {
        super(k, k, k);

    }

    @Override
    public String toString() {
        return "{k = " + this.width + "}";
    }
}
