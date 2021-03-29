package de.die_gfi.franziska.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Patient extends Person {

	String diagnose;
	ArrayList<String> symptome;
	public static Scanner scanner = new Scanner(System.in);

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
		this.symptome = symptomeAnlegen();

	}

	public static void main(String[] args) {

		Patient rolaf = new Patient("Rolaf", "Siegmundsdotjr", 9, 50, 2, "sehr groß");

		System.out.println(rolaf);

	}

	public ArrayList<String> symptomeAnlegen() {

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
