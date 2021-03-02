package de.die_gfi.philipp.geometry;

public class Rectangle {
    public double x, y;
    public double a, b;

    /**
     *
     * @param a length of the side on the x-axis
     * @param b length of the side on y-axis
     * @param x postion of the top left corner on the x-axis
     * @param y position of the top left corner on the y-axis
     */
    public Rectangle(double a, double b, double x, double y) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
    }

    public double calculateArea() {
        return this.a * this.b;
    }

    public double calculateCircumference() {
        return 2 * (this.a + this.b);
    }

    @Override
    public String toString() {
        return "{P1: (" + this.x + "|" + this.y + "), dimensions: a = " + this.a + "; b = " + this.b + "}";
    }
}
