package de.die_gfi.felix;



public class Quader {
	
double laenge;
double hoehe;
double tiefe;
	
	public static void main(String args[]) {
		
		Quader quader1 = new Quader(3, 1 , 2);
		Quader quader2 = new Quader(4, 4, 4);
		Quader quader3 = new Quader(2, 6, 4);
		
		Quader[] quaderArr = {quader1, quader2, quader3};
		
		System.out.println(quader1);
		System.out.println("Volumen: " + quader1.rechneVolumen());
		System.out.println("Gesamtoberflaeche: " + quader1.rechneOberflaeche());
		System.out.println("Summe Kantenlaenge: " + quader1.rechneSummeKantenlaenge());
		System.out.println("Kuerzeste Seite: " + quader1.rueckgabeKuerzesteSeite());
		System.out.println("Minimale Stapelhoehe: " + rechneMinimaleStapelHoehe(quaderArr));
	}
	
	public static double rechneMinimaleStapelHoehe(Quader[] quaderArr) {
	double hoeheStapel = 0;
	for(Quader akktuellerQuader : quaderArr) {
		hoeheStapel = hoeheStapel + akktuellerQuader.rueckgabeKuerzesteSeite();
	}
	return hoeheStapel;
	}
	
	public Quader(double laenge, double hoehe, double tiefe) {
		this.laenge = laenge;
		this.hoehe = hoehe;
		this.tiefe = tiefe;
	}
	
	public double rechneVolumen() {
		return this.laenge * this.hoehe * this.tiefe;
	}
	
	public double rechneSummeKantenlaenge() {
		return (this.laenge + this.hoehe + this.tiefe) * 4;
	}
	
	public double rechneOberflaeche() {
		return ((this.laenge * this.hoehe) + (this.laenge * this.tiefe) + this.hoehe * this.tiefe) * 2;
	}
	
	public double rueckgabeKuerzesteSeite() {
		double kuerzesteSeite = this.laenge;
		if(this.hoehe < this.tiefe) {
			if(this.hoehe < this.laenge) {
				kuerzesteSeite = this.hoehe;
			}
		} else {
			if(this.tiefe < this.laenge) {
				kuerzesteSeite = this.tiefe;
			}
		}
		return kuerzesteSeite;
	}
	
	public String toString() { 
		String result = new String("{ Laeng: " + this.laenge + ", Hoehe: " + this.hoehe + ", Tiefe: " + this.tiefe + " }");
		return result;
	}

}
