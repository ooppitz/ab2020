package de.die_gfi.philipp.geometry;

public class App {

    public static void main(String[] args) {
        Cube w = new Cube(4);

        System.out.println("The surface area of the cube is " + w.calculateSurfaceArea());
        System.out.println("The volume of the cube " + w + " is " + w.calculateVolume());
    }
}
