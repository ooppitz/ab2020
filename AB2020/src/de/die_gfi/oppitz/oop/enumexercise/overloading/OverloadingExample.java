package de.die_gfi.oppitz.oop.enumexercise.overloading;

public class OverloadingExample {

	public static void main(String[] args) {
		
		double x = 9;
		
		double y = 9.0;
		
		int z = (int)5.6; // 32 bit
		
		short f = 3; // 16 bit 
		
		int g = f; // OK, weil die Umwandlung von short zu int eine Umwandlung zu einem größeren Typ ist
		f = (short)z;  // Fehler, weil int größer ist als short
		
		long l = (long)9.0; 
		
		// System.out.println(z);

		
		double c = summe(4, 5);
		System.out.println(c);

		double d = summe((int)9.3, 5);
		System.out.println(d);
		
		double e = summe(8.2, 5.0);
		System.out.println(e);

	}
	
	
	public static int summe(int a, int b) {
		System.out.println("summe(int,int)");
		return a + b;
	}
	/*
	public static double summe(double a, int b) {
		System.out.println("summe(double, int)");
		return (double)(a + b);
	}
	*/
	
	public static double summe(double a, double b) {
		System.out.println("summe(double, double)");
		return (double)(a + b);
	}
	
}
