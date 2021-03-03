package de.die_gfi.franziska.shop;

public class Customer {
	
	String name;
	String adresse;
	String mail;
	

	public static void main(String[] args) {

		Customer kunde1 = new Customer("Hans Müller", "Landau", "muel@gmail.com");
		
		System.out.println(kunde1.toString());
		
		
	}

	public Customer(String n, String a, String m) {
		
		this.name = n;
		this.adresse = a;
		this.mail = m;
	}
	
	public String toString() {
		
		return "Name: " + name + "\nAdresse: " + adresse + "\nMail: " + mail;
		
	}
}
