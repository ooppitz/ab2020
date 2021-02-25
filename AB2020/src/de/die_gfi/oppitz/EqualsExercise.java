package de.die_gfi.oppitz;

import java.util.Arrays;

public class EqualsExercise {

	public static void main(String[] args) {
		
		String s = "Ein Text";
		String t = getString("Ein");
		
		System.out.println(t.equals(s) ? "Die beiden String sind gleich" : "Die beiden Strings unterscheiden sich");
		
		int[] ints1 = {0,2,4,6,8,10};
		int[] ints2 = {0,2,4,6,8,10};
		int[] ints3 = {10,8,6,4,2,0};

		boolean ints1EqualsInts2 = Arrays.equals(ints1, ints2); // Vergleicht die Inhalte
		boolean ints1EqualsInts3 = Arrays.equals(ints1, ints3);

		System.out.println(ints1EqualsInts2);
		System.out.println(ints1EqualsInts3);
		
		boolean b1 = ints1.equals(ints2); // java.lang.Object.equals() Vergleicht die Referenzen, also die Stelle, wo das Objekt im Speicher liegt
		System.out.println("ints1.equals(ints2) = " + b1);
		System.out.println("ints1 = " + ints1);
		System.out.println("ints2 = " + ints2);
		
	}
	
	public static String getString(String s) {
		return s + " Text";
	}

}
