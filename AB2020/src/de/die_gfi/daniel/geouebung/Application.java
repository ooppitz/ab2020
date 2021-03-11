package de.die_gfi.daniel.geouebung;

public class Application
{
   public static void main( String[] args )
   {
     
      Rechteck rechteck = new Rechteck(1, 1, 4, 3);
      rechteck.skalieren(2);

      Rechteck rechteck2 = new Rechteck(6, 8, 10, 15);

      Quadrat quadrat = new Quadrat(3,3,5);

      Bild bild = new Bild();
      bild.add(rechteck);
      bild.add(quadrat);
      bild.add(rechteck2);
      bild.zeichnen();
      bild.drucken(); 
      
      System.out.println();
      
      quadrat.verschieben(10, 0);
      
      bild.zeichnen();
      bild.drucken();
     
      
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
