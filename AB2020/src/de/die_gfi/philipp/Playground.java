package de.die_gfi.philipp;

import java.util.Scanner;

public class Playground {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.next();
		input.next();
		int zahl = input.nextInt();
		System.out.println("Eingegebene Zahl: " + zahl);
		input.close();

	}

}
