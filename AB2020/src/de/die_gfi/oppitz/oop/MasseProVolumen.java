package de.die_gfi.oppitz.oop;

/*
 * milli  mikro  nano   piko    femto   atto
 * 10^-3  10^-6  10^-9  10^-12  10^-15  10^-18
 */
public class MasseProVolumen {

	double grammProLiter;
	
	private MasseProVolumen(double grammProLiter) {
		
		this.grammProLiter = grammProLiter; 
	}
	
	// 10^-3 g / 10^-3 l 
	public static MasseProVolumen ausMilligrammProMilliliter(double masse) {
		return new MasseProVolumen(masse);
	}; 
	
	// 10^-6 g / 10^-3 l ... 10^-3 g / l 
	public static MasseProVolumen ausMikrogrammProMilliliter(double masse) {
		return new MasseProVolumen(masse / 1000);
	}; 
	
	// 10^-9 g / 10^-3 l ... 10^-6 g / l
	public static MasseProVolumen ausNanogrammProMilliliter(double masse) {
		return new MasseProVolumen(masse / 1000000);
	}; 
	
	double getGrammProLiter( ) {
		return this.grammProLiter;
	}
	
	public String nachMikrogrammProMilliliter() {
		
		double milligrammProMilliliter = this.grammProLiter;
		double mikrogrammProMilliliter = milligrammProMilliliter * 1000;
		String ergebnis = String.format("%2.1f ug/ml", mikrogrammProMilliliter);
		return ergebnis;
		
	}
	
	public String nachMilligrammProMilliliter() {
		
		double milligrammProMilliliter = this.grammProLiter;
		String ergebnis = String.format("%2.1f mg/ml", milligrammProMilliliter);
		return ergebnis;
	}
	
	public String nachNanogrammProMilliliter() {
		
		double nanogrammProMilliliter = this.grammProLiter * 1000000.;
		String ergebnis = String.format("%2.1f ng/ml", nanogrammProMilliliter);
		return ergebnis;
	}


	
	@Override
	public String toString() {
		
		return this.nachNanogrammProMilliliter();
	}
	
	
	public static void main(String[] args) {
		
		/* Vitamin D Spiegel Werte
		   Ein optimaler Vitamin-D-Spiegel liegt bei 25-OH-Vitamin-D-Spiegeln zwischen 30 – 50 µg/l vor.
		*/
		
		MasseProVolumen untereGrenzeVitaminD = MasseProVolumen.ausMikrogrammProMilliliter(30 / 1000.);
		
		MasseProVolumen obereGrenzeVitaminD = MasseProVolumen.ausMikrogrammProMilliliter(91 / 1000.);
	
		MasseProVolumen aktuellerWertVitaminD = MasseProVolumen.ausNanogrammProMilliliter(63.35);
		
		System.out.println("Der Spiegel von Vitamin D beträgt " + aktuellerWertVitaminD);
		
		if (aktuellerWertVitaminD.getGrammProLiter() < untereGrenzeVitaminD.getGrammProLiter()) {
			System.out.println("Der Wert von Vitamin D ist zu niedrig.");
		} else if (aktuellerWertVitaminD.getGrammProLiter() > obereGrenzeVitaminD.getGrammProLiter()) {
			System.out.println("Der Wert von Vitamin D ist zu hoch.");
		} else {
			System.out.println("Der Vitamin D Wert liegt in einem guten Bereich.");
		}
		
		/*
		MasseProVolumen mpv = MasseProVolumen.ausMikrogrammProMilliliter(4000);
		System.out.println("MPV = " + mpv);
		
		MasseProVolumen mpv2 = MasseProVolumen.ausMilligrammProMilliliter(3000);
		System.out.println("MPV2 = " + mpv2);
		
		System.out.println("MPV2 = " + mpv2.nachMikrogrammProMilliliter());
		*/
	}
	
}
