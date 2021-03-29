package de.die_gfi.felix;

import java.util.ArrayList;

public class Laborpatient extends Patient implements Vitaminspiegel{
	
	private double aWert;
	private double bWert;
	private double cWert;
	
	public Laborpatient(String vorname, String nachname, double koerpergroesse, double koerpergewicht, String diagnose, ArrayList<String> sympthomListe) {
		super(vorname, nachname, koerpergroesse, koerpergewicht, diagnose, sympthomListe);
	}
	public double getAWert() {
		return aWert;
	}
	public double getBWert() {
		return bWert;
	}
	public double getCWert() {
		return cWert;
	}
	
	public void setAWert(double aWert) {
		this.aWert = aWert;
	}
	public void setBWert(double bWert) {
		this.bWert = bWert;
	}
	public void setCWert(double cWert) {
		this.cWert = cWert;
	}
	

}
