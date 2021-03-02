package de.die_gfi.philipp.array;

public class Kugel {

    public double radius;
    public double x;
    public double y;
    public double z;

    public Kugel(double radius, double x, double y, double z) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + "r = " + this.radius + "; M: (" + this.x + "|" + this.y + "|" + this.z +")}";
    }

    /**
     * Calculates the diameter of this Kugel
     *
     * @return the diameter of this Kugel
     */
    public double calculateDiameter() {
        return this.radius * 2;
    }

    /**
     *
     * @return the surface area of this Kugel
     */
    public double calculateSurfaceArea() {
        return  4 * Math.PI * Math.pow(this.radius, 2);
    }

    /**
     *
     * @return the volume of this Kugel
     */
    public double calculateVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(this.radius, 3);
    }

    /**
     * Checks if this Kugel and another Kugel touch or overlap in some way
     *
     * @param a another Kugel
     * @return true if the two Kugel objects touch in 3D space
     */
    public boolean isTouching(Kugel a) {
        double dx = a.x - this.x;
        double dy = a.y - this.y;
        double dz = a.z - this.z;
        double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
        return distance <= a.radius + this.radius;
    }
}
