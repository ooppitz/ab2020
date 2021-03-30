package de.die_gfi.franziska.oop;

import java.util.ArrayList;

public class Laborpatient extends Patient implements VitaminSpiegel {

	double vitaminA;
	double vitaminC;
	double vitaminD;

	public Laborpatient(String vn, String nn, int alter, double gewicht, double groesse, String diagnose) {

		super(vn, nn, alter, gewicht, groesse, diagnose);

	}

	public Laborpatient(String vn, String nn, int alter, double gewicht, double groesse, String diagnose,
			ArrayList<String> symptome) {

		super(vn, nn, alter, gewicht, groesse, diagnose, symptome);

	}

	public static void main(String[] args) {

		Laborpatient pete = new Laborpatient("Pete", "Peterson", 65, 70, 2, "Heuschnupfen", symptomeAnlegen());

		pete.setVitaminA(800);
		pete.setVitaminC(110);
		pete.setVitaminD(10);

		System.out.println(pete);
		System.out.println(Labor.ueberpruefeLaborwerte(pete));

	}

	@Override
	public double getVitaminA() {
		return this.vitaminA;
	}

	@Override
	public double setVitaminA(double neuerStandA) {
		return this.vitaminA = neuerStandA;
	}

	@Override
	public double getVitaminC() {
		return this.vitaminC;
	}

	@Override
	public double setVitaminC(double neuerStandC) {

		return this.vitaminC = neuerStandC;
	}

	@Override
	public double getVitaminD() {
		return this.vitaminD;
	}

	@Override
	public double setVitaminD(double neuerStandD) {

		return this.vitaminD = neuerStandD;
	}

}
