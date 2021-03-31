package de.die_gfi.felix.oop;

public class Person {
	
	private static final double UNKNOWN_DOUBLE = -1;
	private static final String UNKNOWN_NAME = "-1";
	String vorname;
	String nachname;
	double koerpergroesse;
	double koerpergewicht;
	
	public Person () {
		this.vorname = UNKNOWN_NAME;
		this.nachname = UNKNOWN_NAME;
		this.koerpergroesse = UNKNOWN_DOUBLE;
		this.koerpergewicht = UNKNOWN_DOUBLE;
	}
	public Person (String vorname) {
		this.vorname = vorname;
		this.nachname = UNKNOWN_NAME;
		this.koerpergroesse = UNKNOWN_DOUBLE;
		this.koerpergewicht = UNKNOWN_DOUBLE;
	}
	public Person (String vorname, String nachname) {
		this(vorname);
		this.nachname = nachname;
		this.koerpergroesse = UNKNOWN_DOUBLE;
		this.koerpergewicht = UNKNOWN_DOUBLE;
	}
	public Person (String vorname, String nachname, double koerpergroesse) {
		this(vorname, nachname);
		this.koerpergroesse = koerpergroesse;
		this.koerpergewicht = UNKNOWN_DOUBLE;
	}
	public Person (String vorname, String nachname, double koerpergroesse, double koerpergewicht) {
		this(vorname, nachname, koerpergroesse);
		this.koerpergewicht = koerpergewicht;
	}
	
	public String toString() {
		String s = new String();
		if(!this.vorname.equals(UNKNOWN_NAME)) {
			s = s + this.vorname + " ";
		} else {
			s = s + "kein Vorname gefunden ";
		}
		if(!this.nachname.equals(UNKNOWN_NAME)) {
			s = s + this.nachname + " ";
		} else {
			s = s + "kein Nachname gefunden ";
		}
		if(this.koerpergroesse != UNKNOWN_DOUBLE) {
			s = s + this.koerpergroesse + " ";
		}
		if(this.koerpergewicht != UNKNOWN_DOUBLE) {
			s = s + this.koerpergewicht + " ";
		}
		s = s + "\n";
		return s;
	}
	
}
