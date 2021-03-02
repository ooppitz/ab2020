package de.die_gfi.philipp.geometry;

public class Wuerfel extends Quader{

    public Wuerfel(double k) {
        super(k, k, k);

    }

    @Override
    public String toString() {
        return "{k = " + this.width + "}";
    }
}
