package de.die_gfi.robin;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		
		arrayList.add("Montag");
		arrayList.add("Dienstag");
		arrayList.add("Mittwoch");
		arrayList.add("Donnerstag");
		arrayList.add("Freitag");
		arrayList.add("Samstag");
		arrayList.add("Sonntag");
		
		System.out.println(arrayList);
		
		for (int i = 6; i >= 0; i--) {
			System.out.print(arrayList.get(i) + ", ");
		}
		
	}
}
