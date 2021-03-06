package de.die_gfi.oppitz.oop;

public class Person {
	int alter;
	double koerperGroesse;
	double gewicht;
	String vorName;
	String nachName;

	static final int UNBEKANNTES_ALTER = -1;
	static final double UNBEKANNTE_KOERPERGROESSE = -1;
	static final double UNBEKANNTES_GEWICHT = -1;
	static final String UNBEKANNTER_VORNAME = null;
	static final String UNBEKANNTER_NACHNAME = null;

	public Person() {
		this.alter = UNBEKANNTES_ALTER;
		this.koerperGroesse = UNBEKANNTE_KOERPERGROESSE;
		this.gewicht = UNBEKANNTES_GEWICHT;
		this.vorName = UNBEKANNTER_VORNAME;
		this.nachName = UNBEKANNTER_NACHNAME;
	}

	public Person(String vorname, String nachname) {
		this();
		this.vorName = vorname;
		this.nachName = nachname;
	}

	public Person(String vorname, String nachname, int alter) {
		this(vorname, nachname);
		this.alter = alter;
		this.vorName = vorname;
		this.nachName = nachname;
	}

	public Person(String vorname, String nachname, int alter, double koerperGroesse, double gewicht) {
		this(vorname, nachname, alter);

		this.koerperGroesse = koerperGroesse;
		this.gewicht = gewicht;
	}

	public String toString() {
		/*
		 * return String.format( "%-8s : %s", "Vorname", this.vorName ) + "\n" +
		 * String.format( "%-8s : %s", "Nachname", this.nachName ) + "\n" +
		 * String.format( "%-8s : %d", "Alter", this.alter ) + "\n" + String.format(
		 * "%-8s : %.2f kg", "Gewicht", this.gewicht ) + "\n" + String.format(
		 * "%-8s : %.2f m", "Groesse", this.koerperGroesse ) + "\n";
		 */

		String rueckgabe = "";

		/* Vorname hinzufuegen */

		rueckgabe += String.format("%-8s : ", "Vorname");
		if (this.vorName != UNBEKANNTER_VORNAME) /* Wenn der Vorname bekannt ist */
		{
			rueckgabe += this.vorName + "\n";
		} else {
			rueckgabe += "---" + "\n";
		}

		/* Nachname hinzufuegen */

		rueckgabe += String.format("%-8s : ", "Nachname");
		if (this.nachName != UNBEKANNTER_NACHNAME) {
			rueckgabe += this.nachName + "\n";
		} else {
			rueckgabe += "---" + "\n";
		}

		/* Alter hinzufuegen */
		if (this.alter != UNBEKANNTES_ALTER) {
			rueckgabe += String.format("%-8s : %d", "Alter", this.alter) + "\n";
		}

		/* Gewicht hinzufuegen */
		if (this.gewicht != UNBEKANNTES_GEWICHT) {
			rueckgabe += String.format("%-8s : %.2f kg", "Gewicht", this.gewicht) + "\n";
		}

		/* Groesse hinzufuegen */
		if (this.koerperGroesse != UNBEKANNTE_KOERPERGROESSE) {
			rueckgabe += String.format("%-8s : %.2f m", "Groesse", this.koerperGroesse) + "\n";
		}

		return rueckgabe;
	}
}
