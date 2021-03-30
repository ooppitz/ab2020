package de.die_gfi.franziska.oop;

public class Labor {

	static final double NORM_VITAMINA = 800; // ug
	static final double NORM_VITAMINC = 110; // mg
	static final double NORM_VITAMIND = 20; // ug

	/**
	 * 
	 * @param labPat
	 * @return evaluation of vitamin readings
	 */
	static String ueberpruefeLaborwerte(Laborpatient labPat) {

		String s = "";

		s = (labPat.vitaminA != NORM_VITAMINA) ? (s += "Der Wert von Vitamin A entspricht nicht dem Normwert")
				: (s += "Der Wert von Vitamin A scheint normal zu sein");

		s = (labPat.vitaminC != NORM_VITAMINC) ? (s += "\nDer Wert von Vitamin C entspricht nicht dem Normwert")
				: (s += "\nDer Wert von Vitamin C scheint normal zu sein");

		s = (labPat.vitaminD != NORM_VITAMIND) ? (s += "\nDer Wert von Vitamin D entspricht nicht dem Normwert")
				: (s += "\nDer Wert von Vitamin D scheint normal zu sein");

		return s;

	}

}
