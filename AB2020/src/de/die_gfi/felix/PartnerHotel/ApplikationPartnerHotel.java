package de.die_gfi.felix.PartnerHotel;

import java.util.ArrayList;

public class ApplikationPartnerHotel {
	
	public static void main(String args[]) {
		Person p1 = new Person("Gustavson", "Erich");
		System.out.println(p1.toString());
		System.out.println("-----------------------------------------");
		Person p2 = new Person("Heidelberger", "Maria", p1);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println("-----------------------------------------");
		Person p3 = new Person("Schwanstein", "Reinholde", p1);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println("-----------------------------------------");
		p1.scheiden();
		p1.setPartner(p3);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println("-----------------------------------------");
		p2.scheiden();
		p1.setPartner(p2);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println("-----------------------------------------");
		Hotel h1 = new Hotel("Haralds Himmlisches Hotel");
	   	h1.einmieten(p1);
		h1.einmieten(p1);
		h1.einmieten(p2);
		h1.einmieten(p3);
		System.out.println(h1.toString());
		System.out.println("-----------------------------------------");
		Person p4 = new Person("Lavendel", "Albert");
		Person p5 = new Person("Mannstein", "Aluis");
		Person p6 = new Person("von Kraut", "Hildegart");
		h1.einmieten(p4);
	 	h1.einmieten(p5);
		h1.einmieten(p6);
		System.out.println(h1.toString());
		System.out.println("-----------------------------------------");
		h1.abreisen(p4);
		h1.abreisen(p2);
		h1.einmieten(p6);
		System.out.println(h1.toString());
		System.out.println("-----------------------------------------");
		System.out.println(p1.getInfo());
		System.out.println(h1.status());
		System.out.println(p1.vorstellen());
	}

}
