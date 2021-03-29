package de.die_gfi.felix;

import java.util.ArrayList;

public class FelixTest {
	public static void main(String args[]) {
		
		
		Person p1 = new Person("Gustav");
		Person p2 = new Person("Harald", "Guentetherson");
		Person p3 = new Person("Halvar", "von Flake", 1.98);
		Person p4 = new Person("Manfre Albrecht", "Freiher von Richthofen", 1.80, 70);
		Person p5 = new Person();
		ArrayList<Person> pListe = new ArrayList<Person>( ); 
		pListe.add(p1);
		pListe.add(p2);
		pListe.add(p3);
		pListe.add(p4);
		pListe.add(p5);
		for(Person p : pListe) {
			System.out.println(p.toString());
		}
	}

}
