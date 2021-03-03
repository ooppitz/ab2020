package de.die_gfi.oppitz.geometry;

public class App {

	public static void main(String[] args) {

		Quader q = new Quader(3, 2, 5);

		Wuerfel w = new Wuerfel(4);

		Quader r = w;

		Object o = w;

		System.out.println("w = " + w);

		System.out.println("r = " + r);

		System.out.println("o = " + o);

		double b = w.breite;

		Object x = new Object();
		System.out.println("Object x = " + x);

		Kugel u = new Kugel(9);
		System.out.println("Kugel u = " + u);

		Quader[] koerper = new Quader[4];
		koerper[0] = q;  // Quader
		koerper[1] = w;  // Würfel extends Quader
		koerper[2] = new Wuerfel(3); // Würfel extends Quader
		koerper[3] = new Wuerfel(1); // Würfel extends Quader


		Wuerfel[] weitereKoerper = new Wuerfel[4];
		weitereKoerper[0] = w;  // Würfel
		weitereKoerper[1] = w;  // Würfel extends Quader
		weitereKoerper[2] = new Wuerfel(3); // Würfel extends Quader
		weitereKoerper[3] = new Wuerfel(1); // Würfel extends Quader
		
		
		double minimaleHohe = Quader.berechneMinimaleHoeheEinesStapels(weitereKoerper);
		System.out.println("Die minimale Höhe des Stapels ist " + minimaleHohe);
		
		

	}

}
