package de.die_gfi.franziska.interfaces;

public class Punkt {

	double x;
	double y;

	public static void main(String[] args) {

		Punkt p = new Punkt(9);
		Punkt q = new Punkt(3, 7);
		Punkt3D p1 = new Punkt3D(9, 3, 2);
		Punkt3D p2 = new Punkt3D(7);
		Punkt3D p3 = new Punkt3D(7, 4);

		Punkt[] arr = {p, q, p1, p2, p3};

		Punkt.countPunkte(arr);
		
		
	}

	public Punkt(double x, double y) {

		this.x = x;
		this.y = y;

	}

	public Punkt(double x) {

		this(x, 0); // Hier wird explizit gemacht, dass y = 0 gesetzt wird.

	}

	@Override
	public String toString() {

		return "x: " + this.x + "y: " + this.y;

	}
	
	public static int countPunkte(Punkt[] punkte) {
		
		int anzahl = punkte.length - Punkt3D.countPunkt3D(punkte);
		
		System.out.println("Es wurden " + anzahl + " zweidimensionale Punkte erzeugt.");
		
		System.out.println("Es wurden " + Punkt3D.countPunkt3D(punkte) + " dreidimensionale Punkte erzeugt.");
		
		return anzahl;
	}

}
