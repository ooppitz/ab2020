package de.die_gfi.daniel.geouebung;


public class Rechteck implements Abmessungen
{
   private double laenge, breite;
   private double x, y;
   
   
   public Rechteck( double x, double y, double laenge, double breite )
   {
      this.x = x;
      this.y = y;
      this.laenge = laenge;
      this.breite = breite;      
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
}
