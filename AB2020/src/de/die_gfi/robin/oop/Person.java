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
		
		if (this.vorname != UNBEKANNTER_VORNAME) {
			s += this.vorname + " ";
		}
		else {
			s += "!Vorname fehlt! ";
		}
		
		if (this.nachname != UNBEKANNTER_NACHNAME) {
			s += this.nachname + " ";
		}
		else {
			s += "!Nachname fehlt! ";
		}
		
		if (this.alter != UNBEKANNTES_ALTER) {
			s += "Alter: " + this.alter + " ";
		}
		else {
			s += "!Alter fehlt! ";
		}
		
		if (this.gewicht != UNBEKANNTES_GEWICHT) {
			s += "Gewicht: " + this.gewicht + " ";
		}
		else {
			s += "!Gewicht fehlt! ";
		}
		
		if (this.groesse != UNBEKANNTE_GROESSE) {
			s += "Größe: " + this.groesse + " ";
		}
		else {
			s += "!Größe fehlt! ";
		}
		
		return s;
	}
	
	
	
	public static void main(String[] args) {
		
		Person jeff = new Person (UNBEKANNTER_VORNAME,"Jefferson", 15, UNBEKANNTES_GEWICHT, 44.0);
		System.out.println(jeff);
	}
	
}
