package de.die_gfi.oppitz.shop;

public class Customer {

	String name;
	String email;
	String street;
	String postcode;
	String town;
	String country;

	public Customer(String name, String email, String street, String postcode, String town, String country) {

		this.name = name;
		this.email = email;
		this.street = street;
		this.postcode = postcode;
		this.town = town;
		this.country = country;

	}

	@Override
	public String toString() {
		return name + ", " + email + ", " + street + ", " + postcode + " " + town + ", " + country;
	}

}
