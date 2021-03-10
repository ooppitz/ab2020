package de.die_gfi.daniel.geouebung;

public class Application
{
   public static void main( String[] args )
   {
	  char[][] koordinatenSystem = new char[100][100];
	  	  
      Rechteck rechteck = new Rechteck( 1, 1, 4, 3 );
      
      rechteck.zeichnen(koordinatenSystem);
      
      
      // Ausdrucken des Arrays auf der Konsole
      
      double flaeche;
      double umfang;
            
      flaeche = rechteck.berechneOberflaeche();
      umfang = rechteck.berechneUmfang();
      
      System.out.printf( "flaeche = %f\n", flaeche );
      System.out.printf( "umfang = %f\n", umfang );
      
      
      double laenge = rechteck.getLaenge();
      System.out.printf( "laenge = %f\n", laenge );
      
      
      
      
      Quadrat quadrat = new Quadrat( 2, 2, 6 );
      System.out.printf( "Quadrat:\n" );
      System.out.printf( "Laenge = %.2f\n", quadrat.getLaenge() );
      System.out.printf( "Punkt(%.2f/%.2f)\n", quadrat.x, quadrat.y );
      
   }

}


/*
     Rechteck(10,10, 10, 5)
 
     ...................................................
     .........XXXXXXXXXXX...............................
     .........X.........X...............................
     .........X.........X...............................
     .........X.........X.........XXXXXXXXXXXXX.........
     .........XXXXXXXXXXX.........X...........X.........
     .............................XXXXXXXXXXXXX.........
     ...................................................
     ...................................................
     ........................XXXXXX.....................
     ........................X....X.....................
     ........................XXXXXX.....................
     ...................................................
     ...................................................
     ...................................................
     ...................................................
   (0|0)      x          x          x           x 
 
 
 
 */
