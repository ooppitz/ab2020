package de.die_gfi.franziska.geometry;

public class Quadrat extends Rechteck {

	public Quadrat(double s) {

		super(s, s);

	}

	public static void main(String[] args) {

		Quadrat q = new Quadrat(2);

		Rechteck r = new Quadrat(4);

		Rechteck y = new Rechteck(3, 2);

		System.out.println(q.toString());

		System.out.println(r.toString());

		System.out.println(y.toString());

	}

	public String toString() {

		return "Das Quadrat hat Seiten mit der Länge " + a;

	}

}
