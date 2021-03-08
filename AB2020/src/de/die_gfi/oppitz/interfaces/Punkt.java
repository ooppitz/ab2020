package de.die_gfi.oppitz.interfaces;

public class Punkt {

	double x;
	double y;

	static int counterPunkt = 0;
	
	public static void main(String[] args) {

		Punkt p = new Punkt(9);
		Punkt q = new Punkt(3, 7);
		Punkt3D p1 = new Punkt3D(9, 3, 2);
		Punkt3D p2 = new Punkt3D(7);
		Punkt3D p3 = new Punkt3D(7, 4);

		Punkt[] array = { p, q, p1, p2, p3}; 
        for(Punkt pp : array) {
        	System.out.println(pp);
        }
        
        System.out.println("Es wurden " + Punkt.counterPunkt + " zweidimensionale Punkte erzeugt");
        System.out.println("Es wurden " + Punkt3D.counterPunkt3D + " dreidimensionale Punkte erzeugt");

        
        
	}

	public Punkt(double x, double y) {

		counterPunkt++;
		
		this.x = x;
		this.y = y;

	}

	public Punkt(double x) {

		this(x, 0);  // Hier wird explizit gemacht, dass y = 0 gesetzt

	}

	@Override
	public String toString() {

		return "x: " + this.x + " y: " + this.y;

	}

}
