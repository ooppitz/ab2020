package de.die_gfi.felix.oop;

import java.util.ArrayList;

public class Patient extends Person{
	
	String diagnose;
	ArrayList<String> synthomListe = new ArrayList<String>();
	private static final double UNKNOWN_DOUBLE = -1;
	private static final String UNKNOWN_NAME = "-1";
	private static final String UNKNOWN_SYMPTHOMS = "-1";
	private static final String UNKNOWN_DIAGNOSE = "-1";
	
	private Patient() {
		super();
		this.diagnose = UNKNOWN_DIAGNOSE;
		this.synthomListe.add(UNKNOWN_SYMPTHOMS);
	}

	public Patient(String vorname, String nachname) {
		super(vorname, nachname);
		this.diagnose = UNKNOWN_DIAGNOSE;
		this.synthomListe.add(UNKNOWN_SYMPTHOMS);
	}
	public Patient(String vorname, String nachname, double koerpergroesse) {
		super(vorname, nachname, koerpergroesse);
		this.diagnose = UNKNOWN_DIAGNOSE;
		this.synthomListe.add(UNKNOWN_SYMPTHOMS);
	}
	public Patient(String vorname, String nachname, double koerpergroesse, double koerpergewicht) {
		super(vorname, nachname, koerpergroesse, koerpergewicht);
		this.diagnose = UNKNOWN_DIAGNOSE;
		this.synthomListe.add(UNKNOWN_SYMPTHOMS);
	}
	public Patient(String vorname, String nachname, double koerpergroesse, double koerpergewicht, String diagnose) {
		super(vorname, nachname, koerpergroesse, koerpergewicht);
		this.diagnose = diagnose;
		this.synthomListe.add(UNKNOWN_SYMPTHOMS);
	}
	public Patient(String vorname, String nachname, double koerpergroesse, double koerpergewicht, String diagnose, ArrayList<String> synthomListe) {
		this(vorname, nachname, koerpergroesse, koerpergewicht, diagnose);
		this.synthomListe = synthomListe;
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
		if(!this.diagnose.equals(UNKNOWN_DIAGNOSE)) {
			s = s + this.diagnose + " ";
		}
		if(this.synthomListe.contains(UNKNOWN_DIAGNOSE) == false) {
			for(int i = 0; i < this.synthomListe.size(); i++) {
				s = s + this.synthomListe.get(i)+ " ";
				
			}
		}
		s = s + "\n";
		return s;
	}

}
