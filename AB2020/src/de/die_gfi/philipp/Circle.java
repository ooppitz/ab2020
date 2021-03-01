package de.die_gfi.philipp;

import java.util.ArrayList;

public class Circle {

	// Radius
	// Mittelpunkt
	
	double radius;                 // Each object has a variable "r"
	double x;       // Each object has a variable "xCoordinate"
	double y;
	
	public static void main(String[] args) {

		Circle kreis1 = new Circle(2,-10,4);
		System.out.println("Die Fläche des Kreises #1 ist " + kreis1.calculateArea());
	 
		Circle kreis2 = new Circle(4,3,1);
		System.out.println("Die Fläche des Kreises #2 ist " + kreis2.calculateArea());

		Circle kreis3 = new Circle(3,3,1);
		System.out.println("Die Fläche des Kreises #3 ist " + kreis3.calculateArea());
		
		System.out.println("Der Umfang des Kreises #3 ist " + kreis3.calculateCircumference());
		
		System.out.println("Der Radius des Kreises #3 ist " + kreis3.radius);

		System.out.println("Der Kreis #1 ist " + kreis1.calculateDistance(-1, -1) +
				" weit entfernt von (-1, 1)");


		Circle circ1 = new Circle(4, 10, 10);
		Circle circ2 = new Circle(5, 15, 12);
		Circle circ3 = new Circle(2, 8, 14);

		System.out.println(circ1.isTouching(circ2));
		System.out.println(circ1.isTouching(circ3));
		System.out.println(circ2.isTouching(circ3));

		Circle[] circles = {kreis1, kreis2, kreis3, circ1, circ2, circ3};

		Circle[] touchingCircles = touchingCircles(circles);

		for (Circle c : touchingCircles) {
			System.out.println("Circle r: " + c.radius + " (" + c.x + ", " + c.y + ") is touching at least one other circle");
		}

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

	/**
	 * Calculates whether this circle and another circle touch.
	 *
	 * @param c another circle
	 * @return true if the circles touch or overlap
	 */
	public boolean isTouching(Circle c) {
		double distance = this.calculateDistance(c.x, c.y);
		return distance <= this.radius + c.radius;
	}

	/**
	 * Calculates the overlapping cicles of the specified array
	 * @param c an array of circles
	 * @return an array containing circles that overlap with at least one circle
	 */
	public static Circle[] touchingCircles(Circle[] c) {
		ArrayList<Circle> circleList= new ArrayList<>();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[i].isTouching(c[j]) && i != j) {
					if (!circleList.contains(c[i])) {
						circleList.add(c[i]);
					}
				}
			}
		}
		return circleList.toArray(new Circle[0]);
	}

}
