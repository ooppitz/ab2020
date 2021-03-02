package de.die_gfi.jonathan.objekt;
import de.die_gfi.oppitz.Circle;


public class CircleClass {
public static void main(String[] args) {
	Circle c0 = new Circle(6, 10, 4);
	Circle c1 = new Circle(4, 5, 6);
	Circle c2 = new Circle(3, 7, 8);
	Circle c3 = new Circle(9,5, 2);
	Circle c4 = new Circle(3,9, 1);
	Circle[] c= {c0,c1,c2,c3,c4};

	//System.out.println(c3.toString());
	extracted(c);


}
public static void extracted(Circle[] c) {
	double wertMax =-1;
	int indexMax=-1;
	for (int i = 0; i < 5; i++) {
		if (c[i].getRadius()>=wertMax) {
			wertMax=c[1].getRadius();
			indexMax=i;
		}
	}
	System.out.println("der Größte Kreis ist der Kreis c"+(indexMax)+" mit einem Radius von "+wertMax);
}
	public String toString() {
		return "Kreis";
	}
	

	
}
