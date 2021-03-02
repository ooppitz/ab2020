package de.die_gfi.philipp.geometry;

public class App {

    public static void main(String[] args) {
        Cube w = new Cube(4);

        System.out.println("The surface area of the cube is " + w.calculateSurfaceArea());
        System.out.println("The volume of the cube " + w + " is " + w.calculateVolume());

        Rectangle rec1 = new Rectangle(5, 3);
        System.out.println(rec1);

        Square squ1 = new Square(6);
        System.out.println(squ1);

        System.out.println("Area of rec1 = " + rec1.calculateArea());
        System.out.println("Area of squ1 = " + squ1.calculateArea());

        System.out.println("Circumference of rec1 = " + rec1.calculateCircumference());
        System.out.println("Circumference of squ1 = " + squ1.calculateCircumference());
    }
}
