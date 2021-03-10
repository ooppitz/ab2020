package de.die_gfi.daniel.geouebung;


public class Rechteck implements Abmessungen
{
   private int hoehe, breite;
   protected int x, y;
   
   
   public Rechteck( int x, int y, int hoehe, int breite )
   {
      this.x = x;
      this.y = y;
      this.hoehe = hoehe;
      this.breite = breite;      
   }

   /**
    * Die Methode vergrößert beide Seitenlängen mit dem angegebenen Faktor
    */
   public void skalieren( double faktor )
   {
      this.hoehe *= faktor;
      this.breite *= faktor;
   }
   
   /**
    * Berechnet die Flaeche des Rechtecks
    * 
    * @return
    */
   public double berechneOberflaeche()
   {
      return this.hoehe * this.breite;
   }
   
   /** Die Methode zeichnet das aktuelle Rechteck in 
    * das angegebene Koordinatensystem
    * 
    * @param koordinatenSystem
    */
   public void zeichnen( char[][] koordinatenSystem )
   {
      /* Laufvariablen */
      int x;
      int y;
      
      
      /* Koordinaten des Punktes A */
      int xWert = this.x;
      int yWert = this.y;
      
      System.out.printf( "A(%d/%d)\n", xWert, yWert );      
      
      /* Strecke AB und Punkt B zeichnen */
      

      
      for( x = xWert; x < xWert + this.breite; x++ )
      {
         koordinatenSystem[yWert][x] = 'X';
      }
      
      
      /* Strecke BC und Punkt C zeichnen */
      
      /* Koordinaten des Punktes B */
      xWert = x-1;
//    yWert = yWert;
      
      System.out.printf( "B(%d/%d)\n", xWert, yWert );
      
      for( y = yWert+1; y < yWert + this.hoehe; y++ )
      {
         koordinatenSystem[y][xWert] = 'X';
      }
      
      
      /* Strecke CD und Punkt D zeichnen */
      
      /* Koordinaten des Punktes C */
//    xWert = xWert;
      yWert = y-1;
      
      System.out.printf( "C(%d/%d)\n", xWert, yWert );
      
      for( x = xWert-1; x > xWert - this.breite; x-- )
      {
         koordinatenSystem[yWert][x] = 'X';
      }
      
      
      /* Strecke DA zeichnen */
      
      /* Koordinaten des Punktes D */
      xWert = x+1;
//    yWert = yWert;
      
      System.out.printf( "D(%d/%d)\n", xWert, yWert );
      
      for( y = yWert-1; y > yWert - this.hoehe+1; y-- )
      {
         koordinatenSystem[y][xWert] = 'X';
      }

   }
   
   /**
    * Berechnet den Umfang des Rechtecks
    * 
    * @return
    */
   public double berechneUmfang()
   {
      return 2*( this.hoehe + this.breite );
   }
   
   
   
   public double getHoehe()
   {
      return this.hoehe;
   }
   
   
   public double getBreite()
   {
      return this.breite;
   }
}
