package de.die_gfi.oppitz.interfaces;

public class App {

	public static void main(String[] args) {

		Punkt p = new Punkt(9);
		Punkt q = new Punkt(3, 7);
		
		Punkt3D p1 = new Punkt3D(9, 3, 2);
		Punkt3D p2 = new Punkt3D(7);
		Punkt3D p3 = new Punkt3D(7, 4);

		Dreieck d = new Dreieck(4,1,2);
		Dreieck d2 = new Dreieck(2,13,2);
		Dreieck d3 = new Dreieck(1,3,3);
		Dreieck d4 = new Dreieck(1,13,23);

		d4.setCount(100);
		
		// Franziska : Frage zu Interfaces
		
		CounterInterface[] array = { p, q, p1, p2, p3, d, d2, d3, d4 };
		for (CounterInterface rc : array) {
			System.out.println("Anzahl der erzeugten Instanzen für diese Klasse = " + rc.getCount());
			
		}

		// System.out.println("Es wurden " + Punkt.counterPunkt + " zweidimensionale Punkte erzeugt");
		// System.out.println("Es wurden " + Punkt3D.counterPunkt3D + " dreidimensionale Punkte erzeugt");

	}

}
