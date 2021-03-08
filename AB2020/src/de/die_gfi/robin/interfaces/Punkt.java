package de.die_gfi.robin.interfaces;

public class Punkt {
	
	double x;
	double y;
	static int count;
	
	
	public static void main(String[] args) {
		Punkt a = new Punkt(9);
		Punkt b = new Punkt(3,7);
		Punkt3D d = new Punkt3D(9,3,2);
		Punkt3D e = new Punkt3D(7);
		Punkt3D f = new Punkt3D(7,4);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		int count3D = Punkt3D.count;
		count = count - count3D;
		System.out.printf("Objekte der Klasse Punkt: %d , Objekte der Klasse Punkt3D: %d",count,count3D);
		
		
	}
	
	
	public Punkt (double x,double y) {
		this.x = x;
		this.y = y;
		count++;
	}
	
	public Punkt (double x) {
		this.x = x;
		count++;
	}
	
	
	public String toString() {
		return "x: " + this.x + " y: " + this.y;
	}
}
