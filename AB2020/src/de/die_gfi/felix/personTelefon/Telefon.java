package de.die_gfi.felix.personTelefon;

public class Telefon {
	
	private String telefonnummer;
	private String artTelefon;
	private Person inhaber;
	
	public Person getInhaber() {
		return inhaber;
	}

	public void setInhaber(Person inhaber) {
		this.inhaber.removeTelefon(this);
		this.inhaber = inhaber;
		inhaber.addTelefon(this);
	}

	public Telefon(String telefonnummer, String artTelefon, Person inhaber) {
		this.telefonnummer = telefonnummer;
		this.artTelefon = artTelefon;
		this.inhaber = inhaber;
		inhaber.addTelefon(this);
	}
	
	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public String getArtTelefon() {
		return artTelefon;
	}

	public void setArtTelefon(String artTelefon) {
		this.artTelefon = artTelefon;
	}

	public String toString() {
		return telefonnummer + " " + artTelefon + " " + inhaber;
	}
	
	

}
