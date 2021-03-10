package de.die_gfi.daniel.geouebung;

public class Application
{
   public static void main( String[] args )
   {
      /* Koordinatensystem erstellen */
      char[][] koordinatenSystem = new char[100][100];

      /* Koordinatensystem mit Punkten vorbesetzen */
      for( int y = 0; y < 100; y++ )
      {
         for( int x = 0; x < 100; x++ )
         {
            koordinatenSystem[y][x] = '.';
         }
      }



      Rechteck rechteck = new Rechteck(1, 1, 4, 3);

      rechteck.zeichnen(koordinatenSystem);

      Rechteck rechteck2 = new Rechteck(  );
      
      
      
      
      
      // Ausdrucken des Arrays auf der Konsole
/*    for( int y = 0; y < 100; y++ ) */
      for( int y = 100-1; y >= 0; y-- )
      {
         for( int x = 0; x < 100; x++ )
         {
            System.out.printf("%c", koordinatenSystem[y][x]);
         }
         System.out.printf("\n");
      }


      /*
       * double flaeche; double umfang;
       * 
       * flaeche = rechteck.berechneOberflaeche(); umfang = rechteck.berechneUmfang();
       * 
       * System.out.printf( "flaeche = %f\n", flaeche ); System.out.printf(
       * "umfang = %f\n", umfang );
       * 
       * 
       * double laenge = rechteck.getLaenge(); System.out.printf( "laenge = %f\n",
       * laenge );
       * 
       * 
       * 
       * 
       * Quadrat quadrat = new Quadrat( 2, 2, 6 ); System.out.printf( "Quadrat:\n" );
       * System.out.printf( "Laenge = %.2f\n", quadrat.getLaenge() );
       * System.out.printf( "Punkt(%.2f/%.2f)\n", quadrat.x, quadrat.y );
       */
   }

}


/*
 * Rechteck(10,10, 10, 5)
 * 
 * ...................................................
 * .........XXXXXXXXXXX...............................
 * .........X.........X...............................
 * .........X.........X...............................
 * .........X.........X.........XXXXXXXXXXXXX.........
 * .........XXXXXXXXXXX.........X...........X.........
 * .............................XXXXXXXXXXXXX.........
 * ...................................................
 * ...................................................
 * ........................XXXXXX.....................
 * ........................X....X.....................
 * ........................XXXXXX.....................
 * ...................................................
 * ...................................................
 * ...................................................
 * ................................................... (0|0) x x x x
 * 
 * 
 * 
 */
