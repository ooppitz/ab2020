package de.die_gfi.oppitz.oop;

/*
  Implementieren Sie eine Subklasse “Laborpatient“, die von Patient 
  abgeleitet ist, welche Attribute für die Laborwerte 
  von Vitamin A, Vitamin C, Vitamin D enthält. 
  Recherchieren Sie, welche Einheit hier verwendet wird.

  Implementieren Sie ein Interface „VitaminSpiegel“, welche Methoden 
  enthält, um die Attribute für Vitamin A, C, D zu setzen und zu lesen.
  Verwenden Sie hierzu Getter und Setter.

  Die Klasse Laborpatient soll das Interface VitaminSpiegel implementieren.
*/

public class Laborpatient extends Patient implements VitaminSpiegel {

	double vitaminA; // ng/ml (100-1000)
	double vitaminD; // ng/ml (30-100)
	double vitaminC; // mg/l (3-14)
						// https://www.mlhb.de/fileadmin/user_upload/Startseite/Service/Laborinformationen/Vitamin_C_0216.pdf

	public Laborpatient(String vorname, String nachname, String symptome) {
		super(vorname, nachname, symptome);

	}

	@Override
	public void setVitaminD(double blutwertNgProMl) {
		this.vitaminD = blutwertNgProMl;
	}

	@Override
	public double getVitaminD() {
		return this.vitaminD;
	}

	@Override
	public void setVitaminA(double blutwertNgProMl) {
		this.vitaminA = blutwertNgProMl;
	}

	@Override
	public double getVitaminA() {
		return this.vitaminD;
	}

	@Override
	public void setVitaminC(double blutwertMgProL) {
		this.vitaminC = blutwertMgProL;
	}

	@Override
	public double getVitaminC() {
	
		return vitaminC;
	}

}
