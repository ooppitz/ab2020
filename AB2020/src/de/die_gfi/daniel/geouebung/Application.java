package de.die_gfi.daniel.geouebung;

public class Application
{
   public static void main( String[] args )
   {
      /* Koordinatensystem erstellen */
      char[][] koordinatenSystem = new char[50][100];

      /* Koordinatensystem mit Punkten vorbesetzen */
      for( int y = 0; y < koordinatenSystem.length; y++ )
      {
         for( int x = 0; x < koordinatenSystem[0].length; x++ )
         {
            koordinatenSystem[y][x] = '.';
         }
      }

      Rechteck rechteck = new Rechteck(1, 1, 4, 3);
      rechteck.zeichnen(koordinatenSystem);

      rechteck.skalieren(2);
      rechteck.zeichnen(koordinatenSystem, '@');

      Quadrat quadrat = new Quadrat(3,3,5);
      quadrat.zeichnen(koordinatenSystem, 'q');


      Bild bild = new Bild();
      bild.add(rechteck);
      bild.add(quadrat);
      bild.zeichnen(koordinatenSystem);
      Bild.drucken(koordinatenSystem); 
      
      System.out.println();
      
      quadrat.verschieben(10, 0);
      
      bild.zeichnen(koordinatenSystem);
      Bild.drucken(koordinatenSystem);
    

      
      
      // Ausdrucken des Arrays auf der Konsole
/*
      for( int y = koordinatenSystem.length-1; y >= 0; y-- )
      {
         for( int x = 0; x < koordinatenSystem[0].length; x++ )
         {
            System.out.printf("%c", koordinatenSystem[y][x]);
         }
         System.out.printf("\n");
      }
      
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
 * ....*.....*.....*............XXXXXXXXXXXXX.........
 * ...................................................
 * ...................................................
 * ........................XXXXXX.....................
 * ........................X....X.....................
 * ....*.....*.....*......XXXXXX.....................
 * ...................................................
 * ...................................................
 * ...................................................
 * ....*.....*.....*.................................. (0|0) x x x x
 * 
 * 
 * 
 */
