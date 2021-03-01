package de.die_gfi.felix;	

import java.util.Arrays;
import java.util.ArrayList;
import de.die_gfi.felix.Circle;
import de.die_gfi.util.Print;

public class Circle {

		// Radius
		// Mittelpunkt
		
	double radius;                 // Each object has a variable "r"
	double x;       // Each object has a variable "xCoordinate"
	double y;
	
	public static void main(String[] args) {
						
		Circle kreis1 = new Circle(2,3,4);
		Circle kreis2 = new Circle(4,100,100);
		Circle kreis3 = new Circle(14,3,1);
		Circle kreis4 = new Circle(4, 10, 10);
		Circle kreis5 = new Circle(3,5,5);
		Circle kreis6 = new Circle(1,5,10);
		Circle[] kreiseArr = {kreis1, kreis2, kreis3, kreis4, kreis5, kreis6};
		circleTochArr(kreiseArr);
		
		System.out.println("Die Fläche des Kreises #1 ist " + kreis1.calculateArea());
		System.out.println("Die Fläche des Kreises #2 ist " + kreis2.calculateArea());
		System.out.println("Die Fläche des Kreises #3 ist " + kreis3.calculateArea());
		System.out.println("Der Umfang des Kreises #3 ist " + kreis3.calculateCircumference());	
		System.out.println("Der Radius des Kreises #3 ist " + kreis3.radius);
		System.out.println("Die Distanz zwischen Kreismittelpunkt und Punkt Beträgt: " + kreis4.calculateDistance(10, 10));
		System.out.println("Die Distanz zwischen Kreismittelpunkt und Punkt Beträgt: " + kreis4.calculateDistance(10, 14));
		System.out.println("Die Distanz zwischen Kreismittelpunkt und Punkt Beträgt: " + kreis4.calculateDistance(14, 10));
		System.out.println("Die Distanz zwischen Kreismittelpunkt und Punkt Beträgt: " + kreis4.calculateDistance(14, 14));
		System.out.println("Der Punkt liegt innerhalb des Kreises/auf der Kreislinie?: " + kreis4.isOnOrInsideCircle(14, 14));
		System.out.println("Der Punkt liegt innerhalb des Kreises/auf der Kreislinie?: " + kreis4.isOnOrInsideCircle(14, 10));
		System.out.println("Der Punkt liegt innerhalb des Kreises/auf der Kreislinie?: " + kreis4.isOnOrInsideCircle(10, 14));
		System.out.println("Der Punkt liegt innerhalb des Kreises/auf der Kreislinie?: " + kreis4.isOnOrInsideCircle(10, 10));
		System.out.println("the Circles Touch?: " + kreis4.circlesTouch(kreis5));
		System.out.println("the Circles Touch?: " + kreis4.circlesTouch(kreis6));
		
	}
	
	public static Circle[] circleTochArr(Circle[] kreiseArr) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		for(int i = 0; i < kreiseArr.length; i++) {
			for(int j = 0; j < kreiseArr.length; j++) {
				if(j != i) {
					if(kreiseArr[i].circlesTouch(kreiseArr[j])) {
						arrlist.add(i);
						break;
					}
					
				}
			
			}
		}
		Circle[] kreiseArrReturn = new Circle[arrlist.size()];
		int k = 0;
		for(int i = 0; i < kreiseArr.length; i++) {
			if(arrlist.contains(i)) {
				kreiseArrReturn[k++] = kreiseArr[i];
			}
		}
		System.out.println(arrlist);
		return kreiseArrReturn;
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
	public boolean circlesTouch(Circle kreis) {
		double distance = this.calculateDistance(kreis.x, kreis.y);
		return distance <= this.radius + kreis.radius;
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


	public double calculateDistance(double xPunkt, double yPunkt) {
		double a = xPunkt - this.x;
		double b = yPunkt - this.y;
		a = ifNegativMakePositiv(a);
		b = ifNegativMakePositiv(b);
		double c = Math.sqrt(a*a + b*b);
		return c;
	}

	private double ifNegativMakePositiv(double a) {
		if(a < 0) {
		a = a * -1;
		}
		return a;
	}
	
	public boolean isOnOrInsideCircle(double xPunkt, double yPunkt) {
		boolean isOnCircle = false;
		double distance = this.calculateDistance(xPunkt, yPunkt);
		if(distance <= this.radius) {
			isOnCircle = true;
		}
		return isOnCircle;
	}
}
