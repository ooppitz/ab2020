package de.die_gfi.robin.geometry;

public class Circle {

	// Radius
	// Mittelpunkt
	
	double radius;  // Each object has a variable "r"
	double x;       // Each object has a variable "xCoordinate"
	double y;		// Each object has a variable "xCoordinate"
	
	public static void main(String[] args) {
						
		Circle kreis1 = new Circle(2,3,4);
		Circle kreis2 = new Circle(2,4,3);
		Circle kreis3 = new Circle(1,6,6);
		
		
		Circle[] arr = new Circle[4];
		arr[0] = kreis1;
		arr[1] = kreis2;
		arr[2] = kreis3;
		
		
		System.out.println(Circle.selectBiggest(arr));
		
		
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
	
	
	/**
	 * Calculates the distance between the specified point and the center of *this* circle
	 * @param px
	 * @param py
	 * @return the distance
	 */
	public double calculateDistance (double px, double py) {
		
		double dx = px - x;
		double dy = py - y;
		
		double distance = Math.sqrt(dx * dx + dy * dy);
		
		return distance;
		
	}
	
	/**
	 * Calculates wheter the specified point lies on this circle (including both the area and circumference)
	 * @param px
	 * @param py
	 * @return true if the specified point is on the circle
	 */
	public boolean isOnCircle(double px, double py) {
		double distance = this.calculateDistance(px, py);
		if (distance <= radius) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Determines wheter the two circles touch
	 * @param a
	 * @return true if they touch, otherwise false
	 */
	public boolean isTouching(Circle a) {
		double distance = this.calculateDistance(a.x, a.y);
		
		if (distance <= (a.radius + this.radius)) {
			return true;
		}
		else
			return false;
		 
	}
	
	/**
	 * 
	 */
	public String toString() {
		String s = "Der Kreis hat den Radius " + this.radius + " und die Koordinaten x: " + this.x + " und y: " + this.y;
		return s;
	}
    
    /**
     * 
     * @param c
     * @return
     */
	public static Circle selectBiggest(Circle[] c) {
		Circle maxRad = c[0];
		try {
			for (int i = 0; i < c.length; i++) {
				if (c[i].radius > maxRad.radius) {
					maxRad = c[i];
				}
			}
			
			}catch (java.lang.NullPointerException e) {
				System.out.println(e);
			}
		return maxRad;
	}
	
	


/** Calculates the overlapping circles of the specified array. 
 * 
 * @param c 
 * @return an array containing circles that overlap with at least one other circle
 */
	
	
public static Circle[] touchingCircles(Circle[] circles) {
	
	int newCirclesIndex = 0; 
	
    for (int j = 0; j < circles.length; j++) {
    	for (int i = j + 1; i < circles.length; i++) {
    		if (circles[j].isTouching(circles[i])) {
    			newCirclesIndex = newCirclesIndex + 2;
    		}
    	}
    }
    
    System.out.println(newCirclesIndex);
    
    Circle[] newCircles = new Circle[newCirclesIndex];
    
    int newIndex = 0;
    for (int j = 0; j < circles.length ; j++) {
    	for (int i = j ; i < circles.length ; i++) {
    		if (circles[j].isTouching(circles[i])) {
    			newCircles[newIndex] = circles[i];
    			newIndex++;
    			if (newIndex > newCircles.length - 1) {
    				break;
    			}
    			
    		}
    	}
    	
    	if (newIndex > newCircles.length - 1) {
			break;
		}
    }
    
    
    
    
    
    			
    
	
	return newCircles;
	
}
	
}

