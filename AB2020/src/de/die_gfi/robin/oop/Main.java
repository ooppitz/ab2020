package de.die_gfi.robin.oop;

public class Main {
	
	
public static void main(String[] args) {
		
		Patient jeff = new Patient ("Jeff","Jefferson", 15, 80, 180, "viraler Infekt", "Husten, Schnupfen");
		
		
		Laborpatient keith = new Laborpatient("Keith","Kieferson", 20,99,190,"Erkältung","kratziger Hals");
		Laborpatient carl = new Laborpatient("Carl","Carlson", 30,70,177,"Erkältung"," Fieber, Schüttelfrost");
		
		Labor.ueberpruefeLaborwerte(keith);
		Labor.ueberpruefeLaborwerte(carl);
		System.out.println(jeff);
		
	}
	
}
