package de.die_gfi.daniel.interfaces;

public class Dreieck
{
   static int zaehler = 0;
   
   double   a = 0,
            b = 0,
            c = 0;
   
   
   public Dreieck( double a, double b, double c )
   {
      Dreieck.zaehler++;
      this.a = a;
      this.b = b;
      this.c = c;
   }
}
