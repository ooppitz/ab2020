package de.die_gfi.oppitz.interfaces;

public class Punkt implements CounterInterface {

	double x;
	double y;

	static int counterPunkt = 0;

	

	public int getCount() {

		return Punkt.counterPunkt;
	}

	
	public int setCount(int newValue) {
		
		int oldValue = Punkt.counterPunkt;
		Punkt.counterPunkt = newValue;
		return oldValue;
	}
	
	public Punkt(double x, double y) {

		counterPunkt++;

		this.x = x;
		this.y = y;

	}

	public Punkt(double x) {

		this(x, 0); // Hier wird explizit gemacht, dass y = 0 gesetzt

	}

	@Override
	public String toString() {

		return "x: " + this.x + " y: " + this.y;

	}

}
