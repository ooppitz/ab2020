package de.die_gfi.daniel.geouebung;


public class Quadrat extends Rechteck implements Abmessungen
{

   double xyz; // Erweiterung

   public Quadrat( double x, double y, double laenge )
   {
      super( x, y, laenge, laenge );
   }
   
   
   void foo()
   {
      x += 5;
      this.skalieren(2);
   }
   
   
   
   
}
