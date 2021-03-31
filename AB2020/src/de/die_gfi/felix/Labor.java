package de.die_gfi.felix;

public class Labor {
	
	/**
	 * @author Felix
	 * ermittelt ob die gemessenen Blutwerte wertA wertB und wertC in den ausreichend nahe kommen odern icht
	 * @param p ein Objekt der Klasse Laborpatient wird übergeben. Dieser ist wichtig für seine Atribute wertA wertB wertC und koerpergewicht
	 * @return den boolean blutwertGUt wenn die Blutwerte aller drei vitamine gut sind so wird true zurück gegeben ansonsten false
	 * 
	 */
	
	public static boolean blutwerteSindGut(Laborpatient p) {
		boolean blutwerteGut = false;
		double blutmengeLitter = p.koerpergewicht * 0.08;
		double idealwertA = 1 / blutmengeLitter;
		double idealwertB = 1.1 / blutmengeLitter;
		double idealwertC = 110 / blutmengeLitter;
		if(p.getAWert() < idealwertA * 1.1 && p.getAWert() > idealwertA * 0.9) {
			blutwerteGut = true;
		} else {
			blutwerteGut = false;
		}
		if(p.getBWert() < idealwertB * 1.1 && p.getAWert() > idealwertB * 0.9) {
			blutwerteGut = true;
		} else {
			blutwerteGut = false;
		}
		if(p.getCWert() < idealwertC * 1.1 && p.getAWert() > idealwertC * 0.9) {
			blutwerteGut = true;
		} else {
			blutwerteGut = false;
		}
		
		
		return blutwerteGut;
	}

}
