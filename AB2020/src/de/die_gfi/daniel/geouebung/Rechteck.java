package de.die_gfi.daniel.geouebung;


public class Rechteck implements Abmessungen
{
   private double laenge, breite;
   protected double x, y;
   
   
   public Rechteck( double x, double y, double laenge, double breite )
   {
      this.x = x;
      this.y = y;
      this.laenge = laenge;
      this.breite = breite;      
   }

   /**
    * Die Methode vergrößert beide Seitenlängen mit dem angegebenen Faktor
    */
   public void skalieren( double faktor )
   {
      this.laenge *= faktor;
      this.breite *= faktor;
   }
   
   /**
    * Berechnet die Flaeche des Rechtecks
    * 
    * @return
    */
   public double berechneOberflaeche()
   {
      return this.laenge * this.breite;
   }
   
   /** Die Methode zeichnet das aktuelle Rechteck in 
    * das angegebene Koordinatensystem
    * 
    * @param koordinatenSystem
    */
   public void zeichnen(char[][] koordinatenSystem) {
	   
   }
   
   /**
    * Berechnet den Umfang des Rechtecks
    * 
    * @return
    */
   public double berechneUmfang()
   {
      return 2*( this.laenge + this.breite );
   }
   
   
   
   public double getLaenge()
   {
      return this.laenge;
   }
   
   
   public double getBreite()
   {
      return this.breite;
   }
}
