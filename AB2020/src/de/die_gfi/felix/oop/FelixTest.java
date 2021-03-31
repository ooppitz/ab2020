package de.die_gfi.felix.oop;

import java.util.ArrayList;

public class FelixTest {
	public static void main(String args[]) {
		
		Patient p2 = new Patient("Harald", "Guentetherson");
		Patient p3 = new Patient("Halvar", "von Flake", 1.98);
		Patient p4 = new Patient("Manfre Albrecht", "Freiher von Richthofen", 1.80, 70);
		ArrayList<String> sListeErich = new ArrayList<String>();
		sListeErich.add("Husten");
		sListeErich.add("Gelber Auswurf");
		sListeErich.add("Periodische Atemnot");
		Patient p6 = new Patient("Erich", "Honeker", 1.68, 65, "schwerer Husten", sListeErich);
		Patient p7 = new Patient("Albert", "Speer", 1.89, 78.5, "Milde Grippe");
		
		ArrayList<Person> pListe = new ArrayList<Person>( ); 
		// pListe.add(p1);
		pListe.add(p2);
		pListe.add(p3);
		pListe.add(p4);
		// pListe.add(p5);
		pListe.add(p6);
		pListe.add(p7);
		for(Person p : pListe) {
			System.out.println(p.toString());
		}
	}

}
