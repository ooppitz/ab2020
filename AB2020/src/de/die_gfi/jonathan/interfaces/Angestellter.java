package de.die_gfi.jonathan.interfaces;

public abstract class Angestellter {
String name;
double gehalt;
String email;

public Angestellter(String name,double gehalt) {
	email=name+"@firma.de";
}

abstract void spezialitaetDesAngestellten(String aufgabe);
}
