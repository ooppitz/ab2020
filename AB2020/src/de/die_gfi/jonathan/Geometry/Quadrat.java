package de.die_gfi.jonathan.Geometry;

public class Quadrat extends Rechteck {

	public Quadrat(double seite) {
		super(seite, seite);
	}

	public String toString() {
		return "Das Quadrat hat eine Seiten Länge von " + laenge + " der Umpfang beträgt " + this.Umfang()
				+ " die Fläche ist " + this.Flaeche();
	}

	public static void main(String[] args) {
		Quadrat q1 = new Quadrat(2);
		System.out.println(q1);
	}

}
