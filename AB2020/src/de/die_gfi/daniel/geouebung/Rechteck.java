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
          
      for(int x = this.x; x < this.x + this.breite; x++ )
      {
    	  int yOben = this.y + this.hoehe - 1; 
    	  int yUnten = this.y;
    	  
         koordinatenSystem[yOben][x] = 'X';
         koordinatenSystem[yUnten][x] = 'X';
      }
      
      
      for(int y = this.y + 1; y < this.y + this.hoehe - 1; y++) {
    	  
    	  int xLinks = this.x;
    	  int xRechts = this.x + this.breite - 1;
    	  koordinatenSystem[y][xLinks] = 'X';
          koordinatenSystem[y][xRechts] = 'X';
    	  
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
