package de.die_gfi.daniel.interfaces;

public class Punkt
{
   double   x = 0,
            y = 0;
   static int zaehler = 0;
   static int anzahl2dPunkte = 0;
   

   Punkt( double x )
   {
      this.x = x;
      zaehler++;
      anzahl2dPunkte++;
   }
   
   
   Punkt( double x, double y )
   {
      this(x);
      this.y = y;      
   }
   
   
   public String ausgabe()
   {
      return
            String.format( "x = %.2f", this.x ) + "\n" +
            String.format( "y = %.2f", this.y );
   }
    

   public String toString()
   {
      return
            ":Punkt" + "\n" +
            this.ausgabe() + "\n";
   }
}
