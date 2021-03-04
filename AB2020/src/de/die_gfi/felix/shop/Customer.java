package de.die_gfi.felix.shop;

import java.util.ArrayList;

public class Customer {

	String name;
	String adress;
	String eMail;
	ArrayList<Purchase> listOfPurchases;
	
	public Customer(String name, String eMail, String adress) {
		this.name = name;
		this.eMail = eMail;
		this.adress = adress;
		this.listOfPurchases = 	new ArrayList<Purchase>();
	}
	
	public String toString() {
		String result = new String("Name: " + name + ", E-Mail: " + eMail + ", Adresse: " + adress);
		return result;
	}
	
	public void addPurchase(Purchase p) {
		this.listOfPurchases.add(p);
	}
	
	public ArrayList<Purchase> returnPurchaseList() {
		return listOfPurchases;
	}
	
	public void printPurchaseList() {
		System.out.println(listOfPurchases.toString());
	}
}