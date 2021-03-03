/*
 * 
 * Aufgabe:
 * 
 * Implementieren Sie eine Klasse Kugel, welche einen Radius hat und einen Mittelpunkt, der durch 3 Koordinaten (x,y,z) vorgegeben ist. 
 * Implementieren Sie folgende Methoden
 * 
 *   > berechneOberflaeche()
 *   > berechneDurchmesser()
 *   > berechneVolumen()
 *   > public String toString()
 * 
 * 
 * Aufgabe
 *   > Implementieren Sie eine Methode, die feststellt, ob sich zwei Kugeln berühren. Sie können das mit einer statischen Methode oder mit einer Methode, die auf einer Instanz aufgerufen.
 * 
 */

package de.die_gfi.daniel.geometry;

public class Kugel
{
   double radius;
   double x, y, z;
   
   
   public static void main(String[] args)
   {
      Kugel sonne = new Kugel( 696340000, 0, 0, 0 );
      
      System.out.println( sonne );
      
      
      System.out.printf( "Oberflaeche : %E\n", sonne.berechneOberflaeche() );
      System.out.printf( "Durchmesser : %E\n", sonne.berechneDurchmesser() );
      System.out.printf( "Volumen     : %E\n", sonne.berechneVolumen() );
      

      
      Kugel ball1 = new Kugel( 4, -2, -2, 0 );
      Kugel ball2 = new Kugel( 3, 4, 4, 0);
      
      boolean wert = ball1.isTouching(ball2);
      if( wert == true )
      {
         System.out.printf( "Die Kugeln beruehren sich\n" );
      }
      else
      {
         System.out.printf( "Die Kugeln beruehren sich nicht\n" );
      }
   }

   
   
   public Kugel( double radius, double x, double y, double z )
   {
      this.radius = radius;
      this.x = x;
      this.y = y;
      this.z = z;
   }
   
   
   
  public String toString()
  {
     return 
           "Radius : " + this.radius + "\n" +
           "x      : " + this.x + "\n" +
           "y      : " + this.y + "\n" +
           "z      : " + this.z;
  }
   
   
   
   public double berechneOberflaeche()
   {
      return 4.0 * this.radius * this.radius * Math.PI;
   }
   
   
   
   public double berechneDurchmesser()
   {
      return 2.0 * this.radius;
   }
   
   
   public double berechneVolumen()
   {
      return (3.0/4.0) * this.radius * this.radius * this.radius * Math.PI;
   }
   
   
   public boolean isTouching( Kugel ball )
   {
      double entfernung = Math.sqrt( (this.x-ball.x)*(this.x-ball.x) + (this.y-ball.y)*(this.y-ball.y) + (this.z-ball.z)*(this.z-ball.z) );
      double maxEntfernung = this.radius + ball.radius;

      return entfernung <= maxEntfernung;
   }
}
