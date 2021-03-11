package de.die_gfi.felix;

import java.util.Scanner;

public class Spielplatz {
	
	public static void main(String args[]) {
			
		Scanner sc = new Scanner(System.in);
		
		double zahl = 88.77;
		String test = String.format("Preis: %32.2f", zahl);
		System.out.println(test);
		String string1 = "harald" + test;
		String string2 = "GuenterGustaf" + test;
		System.out.println(string1);
		System.out.println(string2);
	}

}
