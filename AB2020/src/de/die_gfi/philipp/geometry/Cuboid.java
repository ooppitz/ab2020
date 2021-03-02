package de.die_gfi.philipp.geometry;

public class Cuboid {
    public double width;
    public double height;
    public double depth;

    public Cuboid(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public static void main(String[] args) {
        Cuboid q1 = new Cuboid(5, 5, 5);
        Cuboid q2 = new Cuboid(8, 7, 6);
        Cuboid q3 = new Cuboid(4, 5, 6);
        Cuboid q4 = new Cuboid(5, 4, 4);
        Cuboid q5 = new Cuboid(4, 7, 4);

        System.out.println("Volume of q1 is " + q1.calculateVolume());
        System.out.println("The sum of the length of the edges of q2 is " + q2.calculateSumOfEdges());
        System.out.println("The surface area of q3 is " + q3.calculateSurfaceArea());
        System.out.println("The shortest side of q4 has a length of " + q4.getShortestSide());
        System.out.println("q5 is " + q5);

        Cuboid[] qArr = {q1, q2, q3, q4, q5};
        System.out.println("Der Stapel ist mindestens " + berecheneMinimaleHoeheEinesStapels(qArr) + " cm hoch.");
    }


    public double calculateVolume() {
        return this.width * this.height * this.depth;
    }

    public double calculateSumOfEdges() {
        return 4 * (this.width + this.height + this.depth);
    }

    public double calculateSurfaceArea() {
        return 2 * (width * height + width * depth + depth * height);
    }

    /**
     *
     * @return the length of the shortest side
     */
    public double getShortestSide() {
        if (width <= height && width <= depth) {
            return this.width;
        } else if (height <= depth && height <= width) {
            return this.height;
        } else {
            return this.depth;
        }
    }

    public static double berecheneMinimaleHoeheEinesStapels(Cuboid[] qArr) {
        double sum = 0;
        for (Cuboid q : qArr) {
            sum += q.getShortestSide();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "{" + width + "/" + height + "/" + depth + " (w/h/d)}";
    }
}
