package de.die_gfi.robin.shop;


public class Customer {
	
	String kundenNummer;
	String vorname;
	String nachname;
	String strasse;
	String plz;
	String ort;
	
	
	
	public Customer(String k, String v, String n, String s, String p, String o) {
		
		this.kundenNummer = k;
		this.vorname = v;
		this.nachname = n;
		this.strasse = s;
		this.plz = p;
		this.ort = o;
		
	}
	
	
	
	public static Customer[] kundenAuflisten() {
		
		Customer c0 = new Customer("0","Heinz" ,"Gruber", "Trauberstrasse 33", "45657", "Muenchen");
		Customer c1 = new Customer("1","Friedrich" ,"Gruber", "Trauberstrasse 33", "45657", "Muenchen");
		Customer c2 = new Customer("2","Frida" ,"Gartenschlauch", "Krapfenstrasse 13", "43157", "Muenchen");
		Customer c3 = new Customer("3","Odin" ,"Vollkorn", "Valhallagasse 4", "45667", "Muenchen");
		
		//Kundennummer == index
		Customer[] arr = new Customer[4];
		arr[0] = c0;
		arr[1] = c1;
		arr[2] = c2;
		arr[3] = c3;
		
		
		
		
		return arr;
	
	}
	
	public String toString() {
		return  "KundenNr.: " + this.kundenNummer + "\n" + this.vorname + "\n" + this.nachname + "\n" + this.strasse + "\n" + this.plz + " " + this.ort + "\n" ;
	}
	
}
