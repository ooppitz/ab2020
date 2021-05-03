package de.die_gfi.felix.PartnerHotel;

public class Person {
	
	private String name;
	private String vorname;
	private Person partner;
	
	
	
	
	
	
	public String toString() {
		String s = new String();
		s = s + "Person: " + name + " " + vorname;
		if(partner != null) {
			s = s + "   Partner: " + partner.name + " " + partner.vorname;
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
		this.partner = partner;
	}

}
