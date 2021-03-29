package de.die_gfi.jonathan.name.oop;

public class Person {
	int alter ;
	double height;
	double gewicht; 
	String vorname;
	String nachname;
	
	public Person(String v,String n) {
		 vorname=v;
		 nachname=n;
		}
public Person(int a,double h,double g,String v,String n) {

alter=a;
 height=h;
 gewicht =g;

 vorname=v;
 nachname=n;
}

public Person(int a,double h,String v,String n) {
	 alter=a;
	 height=h;
	 vorname=v;
	 nachname=n;
	}

public Person(double g,int a,String v,String n) {
	 alter=a;
	 gewicht =g;
	 vorname=v;
	 nachname=n;
	}

public Person(double h,double g,String v,String n) {
	 height=h;
	 gewicht =g;
	 vorname=v;
	 nachname=n;
	}

public Person(double g,String v,String n) {

	 gewicht =g;
	 vorname=v;
	 nachname=n;
	}

public Person(String v,String n,double h) {
	 height=h;
	 vorname=v;
	 nachname=n;
	}

public Person(int a,String v,String n) {
	 alter=a;
	 vorname=v;
	 nachname=n;
	}


}
