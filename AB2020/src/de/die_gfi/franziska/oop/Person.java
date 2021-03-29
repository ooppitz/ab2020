package de.die_gfi.franziska.oop;

public class Person {

	int alter;
	double groesse;
	double gewicht;
	String vName;
	String nName;

	static final int UNBEKANNTES_ALTER = -1;
	static final double UNBEKANNTE_GROESSE = -1;
	static final double UNBEKANNTES_GEWICHT = -1;
	static final String UNBEKANNTER_VORNAME = null;
	static final String UNBEKANNTER_NACHNAME = null;

	public Person() {

		alter = UNBEKANNTES_ALTER;
		groesse = UNBEKANNTE_GROESSE;
		gewicht = UNBEKANNTES_GEWICHT;
		vName = UNBEKANNTER_VORNAME;
		nName = UNBEKANNTER_NACHNAME;

	}

	public static void main(String[] args) {

		Person rolf = new Person("Rolf", "Rachmundsen", UNBEKANNTES_ALTER, UNBEKANNTES_GEWICHT, UNBEKANNTE_GROESSE);

		System.out.println(rolf);

	}

	public Person(String vName, String nName) {

		this.vName = vName;
		this.nName = nName;

	}

	public Person(String vn, String nn, int alter) {

		this(vn, nn);
		this.alter = alter;

	}

	public Person(String vn, String nn, int alter, double gewicht) {

		this(vn, nn, alter);
		this.gewicht = gewicht;

	}

	public Person(String vn, String nn, int alter, double gewicht, double groesse) {

		this(vn, nn, alter, gewicht);
		this.groesse = groesse;

	}

	@Override
	public String toString() {

		String s = "";

		if (vName != UNBEKANNTER_VORNAME) {

			s += this.vName;

		} else {

			s += "Vorname ist unbekannt";
		}
		
		if (nName != UNBEKANNTER_NACHNAME) {

			s += " " + this.nName;

		} else {

			s += "\nNachname ist unbekannt";

		}
		
		if (alter != UNBEKANNTES_ALTER) {

			s += "\nAlter: " + this.alter;

		} else {

			s += "\nAlter ist unbekannt";

		}
		
		if (gewicht != UNBEKANNTES_GEWICHT) {

			s += "\nGewicht: " + this.gewicht;

		} else {

			s += "\nGewicht ist unbekannt";

		}

		if (groesse != UNBEKANNTE_GROESSE) {

			s += "\nGröße: " + this.groesse;

		} else {

			s += "\nGröße ist unbekannt";

		}

		return s;
	}
}
