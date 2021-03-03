package de.die_gfi.jonathan.shop;


public class Customer {
	Purchase buying =new Purchase();
	String surename;
	String name;
	String mail;
	String country;
	String location;
	String street;
	int house;
	
	
	public Customer(String s,String n) {
		//buying=b;	Purchase b,
		surename=s;
		name=n;
		//mail=m; vorübergehend vereinfacht_,String m
		mail=n+"."+s+"@shop.com";
	}
	
	public void setAdress(String land,String ort,String Straße,int haus) {
		country=land;
		location=ort;
		street=Straße;
		house=haus;
	}
	
	public String toString() {
		return name+" "+surename+" "+mail;
	}
	
	public void addPurchaseItem(PurchaseItem objekt) {
		this.buying.addItem(objekt);
	}
	
	
	

}
