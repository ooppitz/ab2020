package de.die_gfi.oppitz;

public class Circle {

	// Radius
	// Mittelpunkt

	double radius; // Each object has a variable "r"
	double x; // Each object has a variable "xCoordinate"
	double y;

	public static void main(String[] args) {

		Circle kreis1 = new Circle(2, 3, 4);
		System.out.println("Die Fläche des Kreises #1 ist " + kreis1.calculateArea());

		Circle kreis2 = new Circle(10, 0, 0);
		boolean contained = kreis2.isOnCircle(12, 3);
		System.out.println("Der Punkt liegt " + (contained ? "" : "nicht") + " auf dem Kreis");

		Circle a = new Circle(2, 13, 4);
		Circle b = new Circle(2, 4, 3);
		boolean touching = a.isTouching(b);
		System.out.println("Die beiden Kreise berühren sich" + (touching ? "." : " nicht."));
		
		Circle[] circles = new Circle[4];
		circles[0] = kreis1;
		circles[1] = kreis2;
		circles[2] = a;
		circles[3] = b;

		Circle[] touchingCircles = touchingCircles(circles);
		
	}

	
	/** Calculates the overlapping circles of the specified array. 
	 * 
	 * @param c 
	 * @return an array containing circles that overlap with at least one other circle
	 */
	public static Circle[] touchingCircles(Circle[] c) {
		
		return null;
	}
	
	/**
	 * Calculates whether the two circles touch or overlap
	 * @param a
	 * @return true if the circles touch or overlap, otherwise false
	 */
	public boolean isTouching(Circle a) {

		double distance = this.calculateDistance(a.x, a.y);
		if (distance <= (a.radius + this.radius)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isTouchingShort(Circle a) {

		double distance = this.calculateDistance(a.x, a.y);
		return distance <= (a.radius + this.radius);
	}

	/**
	 * Calculates whether the specified point lies on this circle (including both
	 * the area and circumference).
	 * 
	 * @param px
	 * @return true if the specified point is on the circle
	 */
	public boolean isOnCircle(double px, double py) {

		boolean result = false;
		double distance = calculateDistance(px, py);
		if (distance <= this.radius) {
			result = true;
		}
		return result;
	}

	public boolean isOnCircleShort(double px, double py) {

		double distance = this.calculateDistance(px, py);
		return this.calculateDistance(px, py) <= this.radius;
	}

	public boolean isOnCircleVeryShort(double px, double py) {

		return this.calculateDistance(px, py) <= this.radius;
	}

	/**
	 * Calculate the distance between the specified point and the center of *this*
	 * circle.
	 * 
	 * @param px
	 * @param py
	 * @return
	 */
	public double calculateDistance(double px, double py) {

		double dx = px - x;
		double dy = py - y;
		double distance = Math.sqrt(dy * dy + dx * dx);

		return distance;

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

}
