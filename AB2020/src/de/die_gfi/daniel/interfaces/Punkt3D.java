package de.die_gfi.daniel.interfaces;

public class Punkt3D extends Punkt
{
   double   z = 0;
   static int anzahl3dPunkte = 0;
   
   Punkt3D( double x )
   {
      super(x);
      anzahl2dPunkte--;
      anzahl3dPunkte++;
   }
   
   
   Punkt3D( double x, double y )
   {
      this(x);
      this.y = y;
   }
   
   
   Punkt3D( double x, double y, double z )
   {
      this( x, y );
      this.z = z;
   }
   
   
   public String toString()
   {
      return
            ":Punk3D" + "\n" +
            super.ausgabe() + "\n" +
            String.format( "z = %.2f", this.z );
   }
   
   
}
