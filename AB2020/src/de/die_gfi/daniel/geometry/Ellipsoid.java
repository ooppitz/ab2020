/* 
 * Aufgabe (Herausforderung für diejenigen, die das wollen)
 * Implementieren Sie eine Klasse für einen Ellipsoiden.
 * https://de.wikipedia.org/wiki/Ellipsoid#Volumen
 * Implementieren Sie Methoden
 *   > Um die Oberfläche zu berechnen
 *   > Um das Volumen zu berechnen
 */


package de.die_gfi.daniel.geometry;

import java.util.Arrays;

public class Ellipsoid
{
   double a, b, c;
   
   
   public static void main(String[] args)
   {
      

   }

   
   public Ellipsoid( double a, double b, double c )
   {
      this.a = a;
      this.b = b;
      this.c = c;
   }
   
   
   public double oberFlaeche()
   {
      double flaeche = 0;
      
      
      
      /* Oberfläche eines triaxialen Ellipsoids */
      /* Knud Thomsen's integralfreie Näherungsformel */
/*
      double array[] = { this.a, this.b, this.c };
      Arrays.sort(array);
      if( array[0] == this.c  &&  array[1] == this.b  &&  array[2] == this.a )
*/         
         
      /* wenn: a > b > c */
      if( a > b  &&  b > c )
      {
         flaeche = 4 * Math.PI * Math.pow( (Math.pow(a*b, 8.0/5.0) + Math.pow(a*c, 8.0/5.0) + Math.pow(b*c, 8.0/5.0))/3.0, 8.0/5.0 );
      }
      
      
      if( a > c )
      {

      }

      
      if( c > a )
      {
         
      }
      
      return flaeche;
   }

   
   public double volumen()
   {
      return (4.0/3.0) * Math.PI * this.a *this.b * this.c;
   }
}
