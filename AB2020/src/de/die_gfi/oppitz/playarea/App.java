package de.die_gfi.oppitz.playarea;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

/**
 * Eine kleine Testklasse.
 * 
 * 
 * 
 * @author oliveroppitz
 *
 */
public class App {

	
	class NestedClass {
		
		int attribute;
		public NestedClass(int a) {
			this.attribute = a;
		}
		public int getAttribut() {
			return attribute;
		}
	}
	
	/**
	 * Das ist die Hauptmethode des Programms.
	 * @param args die Argumente, die von der IDE übergeben werden
	 */
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();

		String s = "Ein String mit einem Text";
		Integer i = Integer.valueOf(9);
		Double d = Double.valueOf(3.14);
		
		// NestedClass n = new NestedClass(42);

		list.add(s);
		list.add(i);
		list.add(d);

		druckeZahlen(list);

	}

	/**
	 * The method prints only the numbers contained in the specified list
	 * <p> This is a new paragraph. <br> this should be a new line.
	 * 
	 * @param list of Elements to select from for printing
	 */
	public static void druckeZahlen(ArrayList<Object> list) {

		for (Object o : list) {
			if (o instanceof Double) {
				System.out.println("Double = " + o);
			}
			if (o instanceof Integer) {
				System.out.println("Integer = " + o);
			}
		}

	}
	
	/**
	 * faskjlj klfsöf jsalöjf klsaö jkadflsöjadflsöj föasdjklö
	 * afsjlkf lkjdfs ö jkaflsöj <code> some source code </code> fadslöj faslö
	 * safjklfsjladfs öladfs <br> öadfs öadfls jkadfsöjkl afds
	 * afsjlkfasdjlkafsdölk jklafsöj klfasafls <br>
	 * fjlsfjlasöjlk fasklöj adslj faslöjf dsalöjfadlsö
	 * fjaslkfj söfasjfklasöj kfdasjö fasjlöfj sadlö
	 * 
	 * @see Printed documentation
	 * @param a first parameter
	 * @param b second parameter
	 * @param c last parameter
	 * @return some return value
	 */
	public String foo(int a, int b, int c) {
		return "";
	}

}
