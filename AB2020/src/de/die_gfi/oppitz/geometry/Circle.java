package de.die_gfi.oppitz.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
		System.out.println("Die beiden Kreise " + a + " und " + b + " berühren sich" + (touching ? "." : " nicht."));
		System.out.println();

		Circle[] circles = new Circle[3];
		circles[0] = new Circle(3, 0, 0); // Overlap
		circles[1] = new Circle(2, 0, 0); // Overlap
		circles[2] = new Circle(2, 10, 0); // no overlap

		System.out.println("Die folgenden Kreise berühren sich:");
		Circle[] touchingCircles = touchingCirclesPhilipp(circles);
		for (Circle c : touchingCircles) {
			System.out.println(c);
		}

	}

	public static Circle selectBiggest(Circle[] c) {

		Circle biggest = null;

		double groessterRadius = -1;
		for (int i = 0; i < c.length; i++) {

			if (c[i].radius > groessterRadius) {
				groessterRadius = c[i].radius;
				biggest = c[i];
			}
		}
		return biggest;
	}

	public static Circle selectBiggestDaniel(Circle[] c) {
		
		int maxIndex = 0;
		for (int i = 1; i < c.length; i++) {
			if (c[i].radius > c[maxIndex].radius) {
				maxIndex = i;
			}
		}
		return c[maxIndex];
	}

	public static Circle selectBiggestFranziska(Circle[] c) {

		// Sortieren des Arrays mit Bubble-Sort
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[i].radius > c[j].radius) {
					Circle storage = c[j];
					c[j] = c[i];
					c[i] = storage;
				}
			}
		}
		// Return last element which is biggest
		return c[c.length - 1];

	}

	/** Returns a string representing the contents of the current object */
	@Override
	public String toString() {

		return "Kreis { r = " + radius + ", x/y = (" + x + ", " + y + ") }";

	}

	/**
	 * Calculates the overlapping circles of the specified array.
	 * 
	 * @param c
	 * @return an array containing the circles that overlap with at least one other
	 *         circle
	 */
	public static Circle[] touchingCircles(Circle[] c) {

		ArrayList<Integer> indexList = new ArrayList<Integer>();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (j != i) {
					if (c[i].isTouching(c[j])) {
						indexList.add(i);
						break;
					}
				}
			}
		}

		/*
		 * Circle[] result = new Circle[indexList.size()]; int counter = 0 ; for(int k =
		 * 0; k < c.length; k++) { if (indexList.contains(k) ) { result[counter++] =
		 * c[k]; } }
		 */

		int counter = 0;
		Circle[] result = new Circle[indexList.size()];
		for (Integer i : indexList) {
			result[counter++] = c[i];
		}
		return result;

	}

	public static Circle[] touchingCirclesPhilipp(Circle[] c) {

		ArrayList<Circle> circleList = new ArrayList<Circle>();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[i].isTouching(c[j]) && i != j) {
					circleList.add(c[i]);
					break;
				}
			}
		}
		return circleList.toArray(new Circle[0]);

	}

	public static Circle[] touchingCirclesDaniel(Circle[] c) {
		Circle[] array = new Circle[c.length];
		int counter = 0;

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (i != j) {
					if (c[i].isTouching(c[j])) {
						array[counter] = c[i];
						counter++;
						break;
					}
				}
			}
		}

		return Arrays.copyOf(array, counter);
	}

	/**
	 * Calculates whether the two circles touch or overlap
	 * 
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

		return radius * radius * Math.PI;
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
