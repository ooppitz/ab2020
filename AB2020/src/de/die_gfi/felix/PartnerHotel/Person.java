package de.die_gfi.felix.PartnerHotel;

public class Person {
	
	private String name;
	private String vorname;
	private Person partner;
	private double koerperGroesse;
	private char geschlecht;
	
	public Person(String name, String vorname) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.partner = null;
		this.koerperGroesse = -1;
		this.geschlecht = 'x';
		}
	public Person(String name, String vorname, Person partner) {
		this.name = name;
		this.vorname = vorname;
		if(partner.getPartner() == null && this.partner == null) {
			this.partner = partner;
			partner.makePartner_NOT_FOR_USE(this);
		} else {
			this.partner = null;
			this.toString();
		}	
		this.koerperGroesse = -1;
		this.geschlecht = 'x';
	}
	public String getInfo() {
		String s = new String();
		s = this.getVollerName();
		s = s + "\n";
		if(istVerheiratet()) {
			s = s + "Verheitratet";
		} else {
			s = s + "Unverheiratet";
		}
		return s;
	}
	public String toString() {
		String s = new String();
		s = this.getVollerName();
		s = s + "\n";
		if(koerperGroesse != -1) {
			s = s + koerperGroesse + ", ";
		}
		String geschlechtString = new String(geschlecht + "");
		if(geschlechtString.equals("m") || geschlechtString.equals("w") || geschlechtString.equals("d")) {
			s = s + geschlecht + ", ";
		}
		if(istVerheiratet()) {
			s = s + "Verheiratet" + "\nPartner: " + this.partner.getVollerName();
		} else {
			s = s + "Unverheiratet";
		}
		return s;
	}
	private boolean istVerheiratet() {
		boolean istVerheiratet;
		if(this.partner != null) {
		istVerheiratet = true;	
		} else {
		istVerheiratet = false;
		}
		return istVerheiratet;
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
	public double getKoerperGroesse() {
		return koerperGroesse;
	}
	public void setKoerperGroesse(double koerperGroesse) {
		this.koerperGroesse = koerperGroesse;
	}
	public char getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}
	public Person getPartner() {
		return partner;
	}
	public void setPartner(Person partner) {
		if(partner.getPartner() == null && this.partner == null) {
			this.partner = partner;
			partner.makePartner_NOT_FOR_USE(this);
		}
		
	}
	public void makePartner_NOT_FOR_USE(Person partner) {
		this.partner = partner;
	}
	public void scheiden() {
		if(this.partner == null) {
			System.out.println("hier gibt es nichts zu scheiden");
		} else {
			this.partner.makePartner_NOT_FOR_USE(null);
			this.partner = null;
		}
	}
	public String getVollerName() {
		return this.name + ", " + this.vorname;
	}
	public String vorstellen() {
		return "meine Name ist " + this.getVollerName();
	}
}
