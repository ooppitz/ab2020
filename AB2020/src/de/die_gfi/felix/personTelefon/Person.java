package de.die_gfi.felix.personTelefon;

import java.util.ArrayList;
import java.time.LocalDate;

public class Person {
	
	private int personalnummer;
	private String name;
	private String vorname;
	private char geschlecht;
	private LocalDate geburtsdatum;
	private ArrayList<Telefon> besesseneTelefone = new ArrayList<Telefon>();
	
	
	public Person(int personalnummer, String name, String vorname, char geschlecht, LocalDate geburtsdatum) {
		this.personalnummer = personalnummer;
		this.name = name;
		this.vorname = vorname;
		this.geschlecht = geschlecht;
		this.geburtsdatum = geburtsdatum;
	}

	public int getPersonalnummer() {
		return personalnummer;
	}

	public void setPersonalnummer(int personalnummer) {
		this.personalnummer = personalnummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public char getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}

	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	
	public String toString() { 	
		return personalnummer + " " + name + " " + vorname + " " + geschlecht + " " + geburtsdatum;
	}

	public String stringBesesseneTelefone() {
		String s = new String();
		for(Telefon t : besesseneTelefone) {
			s = s + t.getTelefonnummer() + " " + t.getArtTelefon() + "\n";
		}
		return s;
	}
	
	public ArrayList<Telefon> getBesesseneTelefone() {
		return besesseneTelefone;
	}

	public void setBesesseneTelefone(ArrayList<Telefon> besesseneTelefone) {
		this.besesseneTelefone = besesseneTelefone;
	}
	
	public void addTelefon(Telefon t) {
		besesseneTelefone.add(t);
	}
	
	public void removeTelefon(Telefon t) {
		besesseneTelefone.remove(t);
	}
	
	

}
