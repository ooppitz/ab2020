package de.die_gfi.philipp.shop;

public class Admin extends Employee{
	
	public Admin(Shop shop, String adminPassword) {
		super(shop, "admin", adminPassword);
	}
	
	public Admin(Shop shop, int passwordHash) {
		super(shop, "admin", passwordHash);
	}

}
