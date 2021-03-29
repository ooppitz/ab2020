package de.die_gfi.eva.oop;

/*
 
   (X) Legen Sie ein Package <name>.oop an. 
   (x) Legen Sie eine Klasse an „Person“, welche Attribute für Alter, 
       Körpergröße, Gewicht, Vorname, Nachname. 
   ( ) Programmieren Sie mehrere Konstruktoren, mit denen ein Objekt erzeugt werden kann,
       sogar dann, wenn nicht alle Daten bekannt sind.

 */
public class Person {

	int a;
	double k;
	double g;
	String vn;
	String nn;

	public Person() {

	}

	
	// Beispiel: Vorname, Nachname 
	public Person(String vorname, String nachname) {
		
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
		

	}

}
