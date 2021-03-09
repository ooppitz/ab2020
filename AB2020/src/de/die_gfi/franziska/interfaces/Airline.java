package de.die_gfi.franziska.interfaces;

public class Airline {

	public static void main(String[] args) {

		Angestellter ludwig = new PilotA("Ludwig", 8000, "ludwig@fliegen.com");
		Angestellter kurt = new PilotN("Kurt", 2000, "kurt_der_neuling@fliegen.com");
		Angestellter manfred = new Lotse("Manfred", 3000, "manny@ground-control.com");

		ludwig.spezialitaetDesAngestellten("Kann Ludwig nach Australien?");
		System.out.println();

		kurt.spezialitaetDesAngestellten("Kann Kurt den Flug nach Amerika übernehmen?");
		System.out.println();

		manfred.spezialitaetDesAngestellten("Was macht eigentlich Manny?");

	}

}

abstract class Angestellter {

	String name;
	double gehalt;
	String mail;

	public Angestellter(String name, double gehalt, String mail) {

		this.name = name;
		this.gehalt = gehalt;
		this.mail = mail;

	}

	abstract void spezialitaetDesAngestellten(String aufgabe);
}

class PilotA extends Angestellter {

	public PilotA(String name, double gehalt, String mail) {

		super(name, gehalt, mail);

	}

	@Override
	void spezialitaetDesAngestellten(String aufgabe) {

		if (aufgabe.contains("Amerika")) {
			System.out.println("Dieser Pilot kann den Flug nach Amerika übernehmen");
		} else if (aufgabe.contains("Australien")) {
			System.out.println("Dieser Pilot kann den Flug nach Australien übernehmen");
		} else {
			System.out.println("Dieser Pilot fliegt nur nach Australien oder Amerika");

		}

	}

}

class PilotN extends Angestellter {

	public PilotN(String name, double gehalt, String mail) {

		super(name, gehalt, mail);

	}

	@Override
	void spezialitaetDesAngestellten(String aufgabe) {

		System.out.println("Dieser Pilot ist aktuell im Training und darf noch nicht fliegen");

	}

}

class Lotse extends Angestellter {

	public Lotse(String name, double gehalt, String mail) {

		super(name, gehalt, mail);

	}

	@Override
	void spezialitaetDesAngestellten(String aufgabe) {

		System.out.println("Der Lotse lotst");

	}
}