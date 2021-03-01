package de.die_gfi.franziska;

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
		
		
		Circle testCircle = new Circle (4,10,10);
		
		
		Circle testCircle2 = new Circle (2,0,0);
//		boolean contained = testCircle2.isOnCircle(12, 3);
//		System.out.println("Der Punkt liegt " + (contained ? "" : "nicht") + " auf dem Kreis");
		
		
		boolean touch = testCircle2.isTouching(testCircle);
		System.out.println("Der Kreis berührt den anderen " + (touch ? "" : "nicht"));
	}
	
	
	
	
	public boolean isTouching(Circle a) {

		double distance = this.calculateDistance(a.x, a.y);

		if (distance <= (this.radius + a.radius)) {

			return true;

		} else {
			
			return false;
		}
	}

	/**
	 * Calculates wether the spcified point lies on this circle
	 *(including both the area and the circumference).
	 * @param px
	 * @param py
	 * @return true if the specified point is on the circle
	 */
	public boolean isOnCircle(double px, double py) {

		boolean isOnCircle = false;

		double distance = calculateDistance(px, py);

		if (distance <= this.radius) {

			isOnCircle = true;
		}

		return isOnCircle;
	}
	
	/**
	 * Calculate the distance between the specified point and the center of *this* circle.
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

	/** This constructor initialises a Circle object
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

}
