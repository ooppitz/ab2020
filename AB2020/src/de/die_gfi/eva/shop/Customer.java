package de.die_gfi.eva.shop;

public class Customer extends App{

	String name;
	String email;
	String adress;
	String postcode;
	String town;
	String country;

	public Customer(String name, String email, String adress, String postcode, String town, String country) {

		this.name = name;
		this.email = email;
		this.adress = adress;
		this.postcode = postcode;
		this.postcode = town;
		this.country = country;

	}

	public String toString() {

		return name + " / " + email + " / " + adress + " / " + postcode + " " + town + " / " + country;
	}
}