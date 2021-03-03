package de.die_gfi.jonathan.shop;

public class Trinket extends Product {
	String description;
public Trinket(String bezeicnbung,double preis,String beschreibung) {
	super(bezeicnbung, preis);
	description=beschreibung;
}
@Override
public String toString() {
	return super.toString()+" "+description;
}
}
