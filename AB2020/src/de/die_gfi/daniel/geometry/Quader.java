/*
 * Aufgabe:
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
 *
 * Implementieren Sie eine Methode, welche die minimale Höhe eines Stapels berechnet welcher aus den angegebenen Quadern angeordnet werden kann.
 *
 * public static double berechneMinimaleHoeheEinesStapels( Quader[] stapel )
 * {
 *    return ... ;
 * }
 *
 */


package de.die_gfi.daniel.geometry;

public class Quader
{
   double a, b, c;


   public static void main(String[] args)
   {
      Quader[] quaderArray = new Quader[4];


      quaderArray[0] = new Quader( 8, 7, 3 );
      quaderArray[1] = new Quader( 7, 4, 8 );
      quaderArray[2] = new Quader( 8, 3, 4 );
      quaderArray[3] = new Quader( 8, 5, 4 );

      double minHoehe;

      minHoehe = berechneMinimaleHoeheEinesStapels( quaderArray );

      System.out.printf( "Der Stapel ist %.2f hoch\n", minHoehe );
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


   public static double berechneMinimaleHoeheEinesStapels( Quader[] stapel )
   {
      double summe = 0;

      for( int i = 0; i < stapel.length; i++ )
      {
         summe = summe + stapel[i].kuerzesteSeite();
      }


      return summe;
   }


}
