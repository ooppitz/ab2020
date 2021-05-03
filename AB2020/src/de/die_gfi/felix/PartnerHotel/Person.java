package de.die_gfi.felix.PartnerHotel;

public class Person {
	
	private String name;
	private String vorname;
	private Person partner;
	
	public Person(String name, String vorname) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.partner = null;
	}
		public Person(String name, String vorname, Person partner) {
			super();
			this.name = name;
			this.vorname = vorname;
			if(partner.getPartner() == null && this.partner == null) {
				this.partner = partner;
				partner.makePartner_NOT_FOR_USE(this);
			} else {
				this.partner = null;
				this.toString();
			}
			
			
	}
	public String toString() {
		String s = new String();
		s = s + "Person: " + name + " " + vorname;
		if(this.partner != null) {
			s = s + " Verheiratet   Partner: " + partner.name + " " + partner.vorname;
		} else {
			s = s + " Unverheiratet";
		}
		return s;
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

}
