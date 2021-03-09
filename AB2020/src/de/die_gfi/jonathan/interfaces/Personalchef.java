package de.die_gfi.jonathan.interfaces;

public class Personalchef extends Angestellter {

	public Personalchef(String name, double gehalt) {
		super(name, gehalt);
	}

	@Override
	void spezialitaetDesAngestellten(String aufgabe) {
		if (aufgabe=="einstellen") {
			System.out.println("meinetwegen");
		}else if (aufgabe=="kündigen") {
			System.out.println("sehr gerne");
		}else if (aufgabe=="aufgabe") {
			System.out.println("Am liebsten kündige ich leute und zwar fristlos");
		}
	}

}
