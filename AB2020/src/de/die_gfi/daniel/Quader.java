/*
 * Aufgabe:
 * 
 * Implementieren Sie eine Klasse Quader mit einer Länge a, einer Breite b und einer Höhe c
 * 
 * Implementieren Sie:
 *   > Eine Methode, welche das Volumen berechnet
 *   > Eine Methode, welche die Summe der Kantenlängen berechnet
 *   > Eine Methode, welche die Oberfläche berechnet
 *   > Eine Methode, welche die Länge der kürzesten Seite zurückgibt
 *   > Die Methode public String toString();
 * 
 * Testen Sie die Klasse, indem Sie die Methoden von main() aus aufrufen und auf der Konsole entsprechende Daten ausgeben.
 * 
 */
package de.die_gfi.daniel;

public class Quader
{
   double a, b, c;
   

   public static void main(String[] args)
   {
      Quader meinQuader = new Quader( 3, 3, 3 );
      
      
      /* volumen() Test */
      double vol = meinQuader.volumen();
      
      System.out.printf( "Volumen = %.2f VE\n", vol );

      
      /* summeKanten() Test */
      double summe = meinQuader.summeKantenLaenge();
      System.out.printf( "Summe der Kantenlaengen = %f LE\n", summe );
      
      
      /* oberFlaeche() Test */
      double flaeche = meinQuader.oberFlaeche();
      System.out.printf( "Oberflaeche = %f FE\n", flaeche );
      
      /* toString() Test */
      System.out.printf( "%s\n", meinQuader );
   }
   
   
   
   
   public Quader( double laenge, double breite, double hoehe )
   {
      this.a = laenge;
      this.b = breite;
      this.c = hoehe;
   }

   
   
   public String toString()
   {
      return "Laenge : " + this.a + " LE\n" + "Breite : " + this.b + " LE\n" + "Hoehe  : " + this.c + " LE\n";
   }
   
   
   
   public double volumen()
   {
      return this.a * this.b * this.c;
   }
   
   
   
   public double summeKantenLaenge()
   {
      return 4*(this.a + this.b + this.c);
   }
   
   
   
   public double oberFlaeche()
   {
      return 2*( this.a * this.c  +  this.b * this.c  +  this.a * this.b );
//    return 2*( this.c * (this.a+this.b)  +  this.a * this.b );
   }
   
   
   public double kuerzesteSeite()
   {
      double min = this.a;
      
      
      if( this.b < min )
      {
         min = this.b;
      }
      
      if( this.c < min )
      {
         min = this.c;
      }
      
      
      return min;
   }
   
}
