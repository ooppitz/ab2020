package de.die_gfi.philipp;

public class Circle {

	// Radius
	// Mittelpunkt
	
	double radius;                 // Each object has a variable "r"
	double x;       // Each object has a variable "xCoordinate"
	double y;
	
	public static void main(String[] args) {

		Circle kreis1 = new Circle(2,3,4);
		System.out.println("Die Fläche des Kreises #1 ist " + kreis1.calculateArea());
	 
		Circle kreis2 = new Circle(4,3,1);
		System.out.println("Die Fläche des Kreises #2 ist " + kreis2.calculateArea());

		Circle kreis3 = new Circle(14,3,1);
		System.out.println("Die Fläche des Kreises #3 ist " + kreis3.calculateArea());
		
		System.out.println("Der Umfang des Kreises #3 ist " + kreis3.calculateCircumference());
		
		System.out.println("Der Radius des Kreises #3 ist " + kreis3.radius);

		System.out.println("Der Kreis #1 ist " + kreis1.calculateDistance(-1, -1) +
				" weit entfernt von (-1, 1)");


		Circle circ = new Circle(4, 10, 10);
		System.out.println(circ.calculateDistance(10, 10));
		System.out.println(circ.calculateDistance(10, 14));
		System.out.println(circ.calculateDistance(14, 10));
		System.out.println(circ.calculateDistance(6, 10));

		System.out.println(circ.isOnCircle(14, 10)); // true
		System.out.println(circ.isOnCircle(6, 6)); // false
		System.out.println(circ.isOnCircle(11, 11)); // true
		System.out.println(circ.isOnCircle(12, 16)); // false
		System.out.println(circ.isOnCircle(0,0)); // false

	}

	/** This constructor initialises a Circle object
	 * 
	 * @param r circle radius
	 * @param x center point x coordinate
	 * @param y center point y coordinate
	 */
	public Circle(double r, double x, double y) {
		
		this.radius = r; 
		this.x = x;
		this.y = y;
		
	}
	
	/** Calculates the area of *this* circle 
	 * 
	 * @return the area of this circle
	 */
	public double calculateArea() {   // Object method / instance method
		
		return this.radius * this.radius * Math.PI;
	}

	/** Calculate the diameter of this circle 
	 * 
	 * @return the diameter
	 */
	public double calculateDiameter() {
		return this.radius * 2;
	}
	
	
	/** Calculates the circumference of this circle
	 * 
	 * @return the circumference
	 */
	
	public double calculateCircumference() {
		
		return calculateDiameter() * Math.PI;
		
	}

	/**
	 * Calculates the distance of a given point from the center of this circle
	 *
	 * @param px x coordinate of the point
	 * @param py y coordinate of the point
	 * @return Distance to the given point from the center
	 */
	public double calculateDistance(double px, double py) {
		double dx = px - this.x;
		double dy = py - this.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	/**
	 * Calculates whether the specified point lies on this circle (including both the area and circumference)
	 * @param px x coordinate of the point
	 * @param py y coordinate of the point
	 * @return true if specified point is on circle
	 */
	public boolean isOnCircle(double px, double py) {
		double distance = this.calculateDistance(px, py);
		return distance <= this.radius;
	}

}
