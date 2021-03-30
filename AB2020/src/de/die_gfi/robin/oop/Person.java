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
	
	/**
	 * Default Konstruktor fuer die Klasse Person
	 */
	public Person() {
		this.vorname = UNBEKANNTER_VORNAME;
		this.nachname = UNBEKANNTER_NACHNAME;
		this.alter = UNBEKANNTES_ALTER;
		this.gewicht = UNBEKANNTES_GEWICHT;
		this.groesse = UNBEKANNTE_GROESSE;
	}
	
	
	/**
	 * Konstruktor fuer die Klasse Person mit Parameter "vorname" und "nachname"
	 * @param vn
	 * @param nn
	 */
	
	public Person(String vn, String nn) {
		this();
		this.vorname = vn;
		this.nachname = nn;
	}
	
	/**
	 * Konstruktor fuer die Klasse Person mit Parameter "vorname", "nachname" und "alter"
	 * @param vn
	 * @param nn
	 * @param alter
	 */
	public Person(String vn, String nn, int alter) {
		this(vn, nn);
		this.alter = alter;
	}
	/**
	 * Konstruktor fuer die Klasse Person mit Parameter "vorname", "nachname" und "gewicht"
	 * @param vn
	 * @param nn
	 * @param gewicht
	 */
	public Person(String vn, String nn, double gewicht) {
		this(vn, nn);
		this.gewicht = gewicht;
	}
	/**
	 * Konstruktor fuer die Klasse Person mit Parameter "vorname", "nachname", "alter" und "gewicht"
	 * @param vn
	 * @param nn
	 * @param alter
	 * @param gewicht
	 */
	public Person (String vn, String nn, int alter, double gewicht) {
		this(vn, nn, alter);
		this.gewicht = gewicht;
		
	}
	/**
	 * Konstruktor fuer die Klasse Person mit Parameter "vorname", "nachname", "gewicht" und "groesse"
	 * @param vn
	 * @param nn
	 * @param gewicht
	 * @param groesse
	 */
	public Person (String vn, String nn,double gewicht, double groesse) {
		this(vn, nn, gewicht);
		this.groesse = groesse;
		
	}
	/**
	 * Konstruktor fuer die Klasse Person mit Parameter "vorname", "nachname", "alter", "gewicht" und "groesse"
	 * @param vn
	 * @param nn
	 * @param alter
	 * @param gewicht
	 * @param groesse
	 */
	public Person (String vn, String nn, int alter, double gewicht, double groesse) {
		this(vn, nn, alter, gewicht);
		this.groesse = groesse;
		
	}
	
	@Override
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
