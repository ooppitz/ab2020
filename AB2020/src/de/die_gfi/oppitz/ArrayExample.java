package de.die_gfi.oppitz;

import java.util.ArrayList;

public class ArrayExample {

	public static void main(String[] args) {

		String[] arrayOfStrings = { "a", "b", "c", "d" };

		arrayOfStrings[2] = "9";

		System.out.println(arrayOfStrings.toString());

		/* ArrayList hat indices von 0 ... size-1 */
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");

		arrayList.set(3, "z");

		arrayList.clear();
		
		arrayList.add("o");
		arrayList.add("p");
		arrayList.add("q");

		arrayList = null;
		
		arrayList = new ArrayList<String>();
		arrayList.add("x");
		arrayList.add("y");
		arrayList.add("z");

		for (int i = 0; i < arrayList.size(); i++) {
			String e = arrayList.get(i);
			System.out.println(e);
		}
		

	}

}
