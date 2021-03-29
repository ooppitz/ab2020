package de.die_gfi.jonathan.name.oop;

public class Person {
	static final int Unbekantes_alter=-1;
	int alter =Unbekantes_alter;
	static final double Unbekannte_hoehe = -1;
	double height =Unbekannte_hoehe;
	static final double Unbekanntes_gewicht = -1;
	double gewicht =Unbekanntes_gewicht; 
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
@Override
public String toString() {
	return "Name: "+vorname+" "+nachname+" alter: "+alter+" größe: "+height+" gewicht: "+gewicht;
}

}
