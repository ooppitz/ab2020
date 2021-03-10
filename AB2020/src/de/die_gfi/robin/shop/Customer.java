package de.die_gfi.robin.shop;

public class Customer {

	String anrede;
	int kundenNummer;
	String vorname;
	String nachname;
	String strasse;
	String plz;
	String ort;

	// Konstruktor
	Customer(String a, int k, String v, String n, String s, String p, String o) {

		this.anrede = a;
		this.kundenNummer = k;
		this.vorname = v;
		this.nachname = n;
		this.strasse = s;
		this.plz = p;
		this.ort = o;

	}

	// Kundenliste erstellen
	static Customer[] kundenListeAufstellen() {

		Customer c0 = new Customer("Herr", 0, "Heinz", "Gruber", "Trauberstrasse 33", "45657", "Muenchen");
		Customer c1 = new Customer("Herr", 1, "Friedrich", "Winter", "Schieferstrasse 8", "63357", "Bremen");
		Customer c2 = new Customer("Frau", 2, "Frida", "Gartenschlauch", "Krapfenstrasse 13", "43157", "Muenchen");
		Customer c3 = new Customer("Herr", 3, "Odin", "Vollkorn", "Valhallagasse 4", "45667", "Muenchen");
		Customer c4 = new Customer("Frau", 4, "Hilda", "Tropfhorn", "Kamelkaserne 5", "77667", "Hamburg");

		// Kundennummer = index
		Customer[] arr = new Customer[5];
		arr[0] = c0;
		arr[1] = c1;
		arr[2] = c2;
		arr[3] = c3;
		arr[4] = c4;

		return arr;

	}

	public String toString() {
		return this.anrede + "\n" + this.vorname + " " + this.nachname + "\n" + this.strasse + "\n" + this.plz + " "
				+ this.ort + "\n" + "KundenNr.: " + this.kundenNummer + "\n";
	}

}
