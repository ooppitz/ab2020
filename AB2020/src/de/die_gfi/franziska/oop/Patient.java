package de.die_gfi.franziska.oop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Patient is a subclass of Person 
 * <br>Attributes are <code>diagnose</code> and <code>symptome</code>
 * @author Franzi
 *
 */
public class Patient extends Person {

	String diagnose;
	ArrayList<String> symptome;
	static Scanner scanner = new Scanner(System.in);

	static final ArrayList<String> UNBEKANNTE_SYMPTOME = null;

	public Patient(String vn, String nn) {

		super(vn, nn);

	}

	public Patient(String vn, String nn, int alter) {

		super(vn, nn, alter);

	}

	public Patient(String vn, String nn, int alter, double gewicht) {

		super(vn, nn, alter, gewicht);

	}

	public Patient(String vn, String nn, int alter, double gewicht, double groesse) {

		super(vn, nn, alter, gewicht, groesse);

	}

	public Patient(String vn, String nn, int alter, double gewicht, double groesse, String diagnose) {

		super(vn, nn, alter, gewicht, groesse);
		this.diagnose = diagnose;

	}

	public Patient(String vn, String nn, int alter, double gewicht, double groesse, String diagnose,
			ArrayList<String> symptome) {

		super(vn, nn, alter, gewicht, groesse);
		this.diagnose = diagnose;
		this.symptome = symptome;

	}

	public static void main(String[] args) {

		Patient rolaf = new Patient("Rolaf", "Siegmundsdotjr", 9, 50, 2, "sehr groß");

		symptomeAnlegen();

		System.out.println(rolaf);

	}

	/**
	 * Uses console input to make a list of symptoms 
	 * @return ArrayList out of symptoms 
	 */
	public static ArrayList<String> symptomeAnlegen() {

		ArrayList<String> symptome = new ArrayList<String>();

		System.out.println("Bitte geben Sie die Symptome ein");

		symptome.add(scanner.nextLine());

		return symptome;

	}

	@Override
	public String toString() {

		return super.toString() + "\nDiagnose: " + this.diagnose + "\nSymptome: " + this.symptome;

	}

}
