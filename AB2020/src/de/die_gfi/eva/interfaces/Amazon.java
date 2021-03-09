package de.die_gfi.eva.interfaces;

public class Amazon {

	public static void main(String[] args) {

		Logistiker l1 = new Logistiker("Paul Ketler", 420.69, "pa.ket@gmail.com");
		l1.spezialitaetDesAngestellten("Was macht ein Logistiker?");
		Lieferant li1 = new Lieferant("Gustav Huber", 420.69, "guhu@gmail.com");
		li1.spezialitaetDesAngestellten("Hast mit der Gewerkschaft schon drüber geredet?");
	}

}

abstract class Angestellter {

	String name;
	double gehalt;
	String email;

	public Angestellter(String name, double gehalt, String email) {

		this.name = name;
		this.gehalt = gehalt;
		this.email = email;
	}

	abstract void spezialitaetDesAngestellten(String aufgabe);
}

class Logistiker extends Angestellter {

	public Logistiker(String name, double gehalt, String email) {

		super(name, gehalt, email);
	}

	@Override
	void spezialitaetDesAngestellten(String aufgabe) {

		System.out.println("Verpackt Pakete");
	}

}

class Lieferant extends Angestellter {

	public Lieferant(String name, double gehalt, String email) {

		super(name, gehalt, email);
	}

	@Override
	void spezialitaetDesAngestellten(String aufgabe) {

		if (aufgabe.contains("Mittagspause")) {
			System.out.println("Es gibt keine Mittagspause!!!");
		} else if (aufgabe.contains("Gewerkschaft")) {
			System.out.println("Er hat das G-Wort benutzt...");
		}
	}

}