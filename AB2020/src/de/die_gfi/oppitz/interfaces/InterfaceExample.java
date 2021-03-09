package de.die_gfi.oppitz.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InterfaceExample {

	public static void main(String[] args) {
	
		
		// Class
		ArrayList<String> al = new ArrayList<String>();
		al.add("München");
		al.add("Berlin");
		al.add("Salzburg");
		al.add("Nürnberg");
		
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Bregenz");
		ll.add("Hohenbrunn");
		ll.add("Graz");
		
		CompressedList<String> cl = new CompressedList<String>();
		
		
		printContents(al);
		
		printContents(ll);
		
		printContents(cl);

		
	}
	
	
	/** Prints the contents of the specified list */
	static void printContents(List<String> list) {
		
		for(String s : list) {
			System.out.println(s);
		}
		
		
	}

}
