package de.die_gfi.felix.shop;

public class Customer {

	String name;
	String adress;
	String eMail;
	
	public Customer(String name, String eMail, String adress) {
		this.name = name;
		this.eMail = eMail;
		this.adress = adress;
	}
	
	public String toString() {
		String result = new String("Name: " + name + ", E-Mail: " + eMail + ", Adresse: " + adress);
		return result;
	}
	
}
