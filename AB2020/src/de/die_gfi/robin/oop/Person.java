package de.die_gfi.robin.oop;

public class Person {
	
	String vorname;
	String nachname;
	int alter;
	double gewicht;
	double groesse;
	
	
	
	
	static final String UNBEKANNTER_VORNAME = null;
	static final String UNBEKANNTER_NACHNAME = null;
	static final int UNBEKANNTES_ALTER = -1;
	static final double UNBEKANNTES_GEWICHT = -1;
	static final double UNBEKANNTE_GROESSE = -1;
	
	public Person() {
		this.vorname = UNBEKANNTER_VORNAME;
		this.nachname = UNBEKANNTER_NACHNAME;
		this.alter = UNBEKANNTES_ALTER;
		this.gewicht = UNBEKANNTES_GEWICHT;
		this.groesse = UNBEKANNTE_GROESSE;
	}
	
	
	public Person(String vn, String nn) {
		this();
		this.vorname = vn;
		this.nachname = nn;
	}
	
	public Person(String vn, String nn, int alter) {
		this(vn, nn);
		this.alter = alter;
	}
	
	public Person(String vn, String nn, double gewicht) {
		this(vn, nn);
		this.gewicht = gewicht;
	}
	
	public Person (String vn, String nn, int alter, double gewicht) {
		this(vn, nn, alter);
		this.gewicht = gewicht;
		
	}
	
	public Person (String vn, String nn,double gewicht, double groesse) {
		this(vn, nn, gewicht);
		this.groesse = groesse;
		
	}
	
	public Person (String vn, String nn, int alter, double gewicht, double groesse) {
		this(vn, nn, alter, gewicht);
		this.groesse = groesse;
		
	}
	
	
	public String toString() {
		String s = "";
		
		s += (this.vorname != UNBEKANNTER_VORNAME) ? (this.vorname + " ") : ("!Vorname fehlt! ");
		s += (this.nachname != UNBEKANNTER_NACHNAME) ? ( this.nachname + "\n") : ("!Nachname fehlt!\n");
		s += (this.alter != UNBEKANNTES_ALTER) ? ("Alter: " + this.alter + "\n") : ("!Alter fehlt!\n");
		s += (this.gewicht != UNBEKANNTES_GEWICHT) ? ("Gewicht: " + this.gewicht + "\n") : ("!Gewicht fehlt!\n");
		s += (this.groesse != UNBEKANNTE_GROESSE) ? ("Größe: " + this.groesse + "\n") : ("!Größe fehlt!\n");
		
		return s;
	}
	
	
	
}
