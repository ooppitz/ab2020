package de.die_gfi.eva.oop;

/*
 
   (X) Legen Sie ein Package <name>.oop an. 
   (x) Legen Sie eine Klasse an „Person“, welche Attribute für Alter, 
       Körpergröße, Gewicht, Vorname, Nachname. 
   ( ) Programmieren Sie mehrere Konstruktoren, mit denen ein Objekt erzeugt werden kann,
       sogar dann, wenn nicht alle Daten bekannt sind.

 */
public class Person {

	int a; // in Jahren
	double k;
	double g;
	String vn;
	String nn;

	static final int UNBEKANNTES_ALTER = -1;
	static final double UNBEKANNTE_KOERPERGROESSE = -1;
	static final double UNBEKANNTES_GEWICHT = -1;
	static final String UNBEKANNTER_VORNAME = null;
	static final String UNBEKANNTER_NACHNAME = null;

	public Person() {

		a = UNBEKANNTES_ALTER; // Flag-Werte müssen einen normalerweise nicht vorkommenden Wert benutzen
		k = UNBEKANNTE_KOERPERGROESSE;
		g = UNBEKANNTES_GEWICHT;
		vn = UNBEKANNTER_VORNAME;
		nn = UNBEKANNTER_NACHNAME;
	}

	// Beispiel: Vorname, Nachname
	public Person(String vorname, String nachname) {
		this();
		this.vn = vorname;
		this.nn = nachname;

	}

	// Beispiel: Vorname, Nachname, Alter
	public Person(String vorname, String nachname, int alter) {

		this(vorname, nachname);
		this.a = alter;

	}

	// Beispiel: Vorname, Nachname, Gewicht
	public Person(String vorname, String nachname, double gewicht) {
		this(vorname, nachname);
		this.g = gewicht;

	}

	// Beispiel: Vorname, Nachname, Gewicht, Körpergröße, Alter
	public Person(String vorname, String nachname, int alter, double koerpergroesse, double gewicht) {

		this(vorname, nachname, alter);
		this.k = koerpergroesse;
		this.g = gewicht;

	}

	public static void main(String[] args) {

		
		
		Person p1 = new Person("Max", "Mustermann");
		Person p2 = new Person("Andrea", "Andermann", 28); // Andrea Andermann, 28
		Person p3 = new Person("Klaus", "Kummersdorfer", 34, 185, 80); // Klaus Kummersdorfer, 34 Jahre, 80kg, 185cm
		Person p4 = new Person();
		p4.nn = "Musterfrau";
		p4.g = 60;
		
		Person[] patienten = new Person[] {p1, p2, p3, p4};
		
		for(Person p : patienten) {
			System.out.println(p);
		}

	}

	@Override
	public String toString() {

		String s = "";

		if (this.vn != UNBEKANNTER_VORNAME) {
			s += this.vn + " ";
		} else {
			s += "##Vorname fehlt ";
		}
		
		if (this.nn != UNBEKANNTER_NACHNAME) {
			s += this.nn + " ";
		}else {
			s += "##Nachname fehlt ";
		}

		if (this.g != UNBEKANNTES_GEWICHT) {
			s += " Gewicht=" + this.g;
		}
		if (this.a != UNBEKANNTES_ALTER) {
			s += " Alter=" + this.a;
		}
		if (this.k != UNBEKANNTE_KOERPERGROESSE) {
			s += " Körpergröße=" + this.k;
		}

		return s;
	}

}
