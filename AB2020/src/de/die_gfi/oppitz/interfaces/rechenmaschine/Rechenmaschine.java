package de.die_gfi.oppitz.interfaces.rechenmaschine;

public class Rechenmaschine {

	protected static int a;   // package visibility
	protected static int b;
	private static int sum;

	/** Returns the sum of a and b */
	public static int calculateSum(int x, int y) {

		setA(x);
		setB(y);
		calculateSum();

		return Rechenmaschine.sum;
	}

	/** Setzt den Wert a für die Berechnung */
	protected static void setA(int a) {

		Rechenmaschine.a = a;
	}

	/** Setzt den Wert b für die Berechnung */
	protected static void setB(int b) {

		Rechenmaschine.b = b;

	}

	private static void calculateSum() {
		sum = a + b;
	}

}
