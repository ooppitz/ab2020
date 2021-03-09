package de.die_gfi.jonathan.interfaces;

public class Firma {
	
public static void main(String[] args) {
	Hausmeister h1 =new Hausmeister("h1", 20);
	Personalchef p1 =new Personalchef("p1", 500);
	Asistent a1 = new Asistent("a1", 30);
	p1.spezialitaetDesAngestellten("einstellen");
	p1.spezialitaetDesAngestellten("kündigen");
	p1.spezialitaetDesAngestellten("aufgabe");

}
}
