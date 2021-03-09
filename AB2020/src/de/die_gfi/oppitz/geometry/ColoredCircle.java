package de.die_gfi.oppitz.geometry;

public class ColoredCircle extends Circle {

	
	String color; 
	String pattern; 
	
	
	public ColoredCircle(double r, double x, double y) {
		super(r, x, y);
	}

	public ColoredCircle(double r, double x, double y, String color, String pattern) {
		super(r, x, y);
		
		this.color = color; 
		this.pattern = pattern;
		
	}
	
	/** Decide if the specified color fits with this circle 
	 * 
	 * @param color
	 * @return true if the specified color fits, otherwise false
	 */
	boolean fitsWith(String matchingColor) {
		
		if (matchingColor.equals("black") || matchingColor.equals("white")) {
			return true;
		}
		
		if (this.color.equals("black") || this.color.equals("white") ) {
			return true;
		}
			
		return false;
	}
	
	public static void main(String[] args) {
		
		ColoredCircle cc = new ColoredCircle(5, 0, 0, "Rot-Weiss", "kariert");
		
		System.out.println("Green fits " + cc.fitsWith("green"));
		System.out.println("White fits " + cc.fitsWith("white"));

		
		System.out.println("Durchmesser von " + cc + " = " + cc.calculateDiameter());
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " mit der Farbe " + color + " und dem Muster " + pattern;
	}
	
	
}
