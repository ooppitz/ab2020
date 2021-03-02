package de.die_gfi.jonathan.objekt;

public class Quader {
	double a;
	double b;
	double c;
	
	public Quader(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double volume() {
		return this.a*this.b*this.c;
	}
	public double sides() {
		return (this.a*4)+(this.b*4)+(this.c*4);
	}
	
	public double shortesSide() {
		double smallest=a;
		if (smallest<b) {
		smallest=b;
		}else if (smallest<c) {
			smallest=c;
		}
		return smallest;}
	
	public double kleinsterStapel(Quader q1,Quader q2) {
		return this.shortesSide()+q1.shortesSide()+q2.shortesSide();
				
	}
	
	public double surface() {
		return (this.a*4)+(this.b*4)+(this.c*4);
	}
	
	public static void main(String[] args) {
		Quader q1= new Quader(2, 1, 2);
		//System.out.println(	q1.sides());
		System.out.println(q1.kleinsterStapel(q1, q1));

	}

}
