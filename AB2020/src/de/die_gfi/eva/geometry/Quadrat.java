package de.die_gfi.eva.geometry;

public class Quadrat extends Rechteck{
	
	public Quadrat(double s) {
		
		super(s,s);
	}
	
	public static void main(String[] args) {
		
		Rechteck r1 = new Rechteck(4,2);
		Quadrat q1 = new Quadrat(4);
		Rechteck r2 = new Quadrat(8);
		
		System.out.println(r1.toString());
		System.out.println(q1.toString());
		System.out.println(r2.toString());
	}
	public String toString() {
		
		return "Das Quadrat hat die Seitenlänge s = " + x;
	}
}
