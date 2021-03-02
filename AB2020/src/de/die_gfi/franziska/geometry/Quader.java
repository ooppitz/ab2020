package de.die_gfi.franziska.geometry;

public class Quader {
	
	double a;
	double b;
	double c;

	public static void main(String[] args) {

		Quader quader1 = new Quader(4,2,2);
		
		System.out.println("Das Volumen beträgt: " + quader1.calculateVolume());
		
		System.out.println("Die Summe der Kantenlängen beträgt: " + quader1.calculateSumEdgeLength());
		
		System.out.println("Die Größe der Oberfläche beträgt: " + quader1.calculateArea());
		
		System.out.println("Die kürzeste Seite ist: " + quader1.shortestEdgeLength()+ " lang" );
		
		Quader test1 = new Quader(1,4,8);
		Quader test2 = new Quader(3,1,3);
		Quader test3 = new Quader(2,5,4);
		
		Quader[] stapelTest = {test1, test2, test3};
		
		System.out.println("Die minimale Höhe von dem Stapel beträgt: " + Quader.berechneMinimaleHoeheEinesStapels(stapelTest));
		
	}

	/**
	 * 
	 * @param laenge
	 * @param breite
	 * @param hoehe
	 */
	public Quader(double laenge, double breite, double hoehe) {

		this.a = laenge;
		this.b = breite;
		this.c = hoehe;

	}

	/**
	 * @return volume of the Quader
	 */
	public double calculateVolume() {

		return this.a * this.b * this.c;

	}

	/**
	 * @return sum of the edges length
	 */
	public double calculateSumEdgeLength() {

		return 4 * (a + b + c);

	}

	/**
	 * @return area of the Quader
	 */
	public double calculateArea() {

		return (2 * (a * b + a * c +  b * c));

	}
	
	public double shortestEdgeLength() {

		double shortestEdge = 0;

		if (this.a < this.b) {

			shortestEdge = this.a;

		} else {

			shortestEdge = this.b;
		}

		if (shortestEdge > this.c) {

			shortestEdge = this.c;
		}
		return shortestEdge;
	}
	
	public String toString() {
		
		String s = "Der Quader hat eine Länge von " + this.a + " eine Breite von " + this.b + " und eine Höhe von " + this.c;
        return s;
		
	}
	
	public static double berechneMinimaleHoeheEinesStapels(Quader[] stapel) {

		double minHoehe = 0;

		for (int i = 0; i < stapel.length; i++) {

			minHoehe = minHoehe + stapel[i].shortestEdgeLength();

		}

		return minHoehe;

	}

}
