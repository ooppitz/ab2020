package de.die_gfi.eva;

public class Circle {

	double radius; // Each object has a variable "r"
	double x; // Each object has a variable "xCoordinate"
	double y;

	public static void main(String[] args) {

		Circle kreis1 = new Circle(2, 3, 4);
		System.out.println("Die Fläche des Kreises #1 ist " + kreis1.calculateArea());

		Circle kreis2 = new Circle(4, 3, 1);
		System.out.println("Die Fläche des Kreises #2 ist " + kreis2.calculateArea());

		Circle kreis3 = new Circle(14, 3, 1);
		System.out.println("Die Fläche des Kreises #3 ist " + kreis3.calculateArea());

		System.out.println("Der Umfang des Kreises #3 ist " + kreis3.calculateCircumference());

		System.out.println("Der Radius des Kreises #3 ist " + kreis3.radius);
		
		Circle testCircle = new Circle(4, 10, 10);
		System.out.println("Abstand vom Punkt (10,10) zum testCircle = " + testCircle.calculateDistance(10, 10));
		System.out.println("Abstand vom Punkt (10,14) zum testCircle = " + testCircle.calculateDistance(10, 14));
		System.out.println("Abstand vom Punkt (14,10) zum testCircle = " + testCircle.calculateDistance(14, 10));
		System.out.println("Abstand vom Punkt (14,14) zum testCircle = " + testCircle.calculateDistance(14, 14));
	}

	/**
	 * This constructor initialises a Circle object
	 * 
	 * @param r
	 * @param x
	 * @param y
	 */
	public Circle(double r, double x, double y) {

		this.radius = r;
		this.x = x;
		this.y = y;

	}

	/**
	 * Calculates the area of *this* circle
	 * 
	 * @return the area of this circle
	 */
	public double calculateArea() { // Object method / instance method

		return this.radius * this.radius * Math.PI;
	}

	/**
	 * Calculate the diameter of this circle
	 * 
	 * @return the diameter
	 */
	public double calculateDiameter() {
		return this.radius * 2;
	}

	/**
	 * Calculates the circumference of this circle
	 * 
	 * @return the circumference
	 */

	public double calculateCircumference() {

		return calculateDiameter() * Math.PI;

	}
	
	public double calculateDistance(double px, double py) {
	
		double dx = px - x;
		double dy = py - y ;
		double distance = Math.sqrt(dy * dy + dx * dx) ;
		
		return distance;
		
	}
	
	
}









