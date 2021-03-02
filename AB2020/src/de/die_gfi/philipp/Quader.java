package de.die_gfi.philipp;

public class Quader {
    public double width;
    public double height;
    public double depth;

    public Quader(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public static void main(String[] args) {
        Quader q1 = new Quader(5, 5, 5);
        Quader q2 = new Quader(8, 7, 6);
        Quader q3 = new Quader(4, 5, 6);
        Quader q4 = new Quader(5, 4, 4);
        Quader q5 = new Quader(4, 7, 4);

        System.out.println("Volume of q1 is " + q1.calculateVolume());
        System.out.println("The sum of the length of the edges of q2 is " + q2.calculateSumOfEdges());
        System.out.println("The surface area of q3 is " + q3.calculateSurfaceArea());
        System.out.println("The shortest side of q4 has a length of " + q4.getShortestSide());
        System.out.println("q5 is " + q5);
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

    @Override
    public String toString() {
        return "{" + width + "/" + height + "/" + depth + " (w/h/d)}";
    }
}
