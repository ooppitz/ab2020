package de.die_gfi.daniel.geouebung;


public class Quadrat extends Rechteck implements Abmessungen
{
   public Quadrat( int x, int y, int laenge )
   {
      super( x, y, laenge, laenge );
   }
   
   
   void foo()
   {
      x += 5;
      this.skalieren(2);
   }
   
   
   
   
}
