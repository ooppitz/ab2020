/*
 * Aufgabe:
 * 
 * Implementieren Sie eine Klasse class Bild. Die Klasse hat eine Liste von Rechtecken.
 * Implementieren Sie eine Methode add(Rechteck r)
 * Implementieren Sie eine Methode zeichnen(), welche das Koordinatensystem löscht und anschließend die enthaltenen Rechtecke zeichnet
 *
 */

package de.die_gfi.daniel.geouebung;

import java.util.ArrayList;


public class Bild
{
   ArrayList<Rechteck> rechtecke/* = new ArrayList<Rechteck>() */;

   
   char[][] koordinatenSystem;

   public Bild()
   {
      rechtecke = new ArrayList<Rechteck>();
      
      koordinatenSystem = new char[50][100];  /* Koordinatensystem erstellen */
      
      koordinatenSystemZuruecksetzen();
   }


   public void add( Rechteck rechteck )
   {
      rechtecke.add(rechteck);
   }


   private void koordinatenSystemZuruecksetzen()
   {
      for( int zeilen = 0; zeilen < koordinatenSystem.length; zeilen++ )
      {
         for( int spalten = 0; spalten < koordinatenSystem[0].length; spalten++ )
         {
        		
             koordinatenSystem[zeilen][spalten] = ' ';
        	 
        	 if (zeilen % 5 == 0) {
        		 koordinatenSystem[zeilen][spalten] = '.';
        	 }
        	 
        	 if (spalten % 5 == 0) {
        		 koordinatenSystem[zeilen][spalten] = '.';
        	 }
         }
      }
   }
   

   public void drucken()
   {
      System.out.printf( "%6s\n", "A" );
      System.out.printf( "%6c\n", '|' );

      
      for( int y = koordinatenSystem.length - 1; y >= 0; y-- )
      {
         if( y % 5 == 0 )
         {
            System.out.printf( "  %2d |", y);
         }
         else
         {
            System.out.printf( "%6c", '|' );
         }
            
            
         for( int x = 0; x < koordinatenSystem[0].length; x++ )
         {
            System.out.printf("%c", koordinatenSystem[y][x]);
         }
         System.out.printf("\n");
      }
      
      
      /* x-Achse drucken */
      System.out.print( " ".repeat(6) + "-".repeat(koordinatenSystem[0].length) + "->\n" );
      System.out.print( " ".repeat(2) );
      
      
      int i = 0;
      while( i < koordinatenSystem[0].length )
      {
         System.out.printf( "%5d", i );
         i = i + 5;
      }
   }
   
   public void zeichnen()
   {
      /* Koordinatensystem löschen */
      koordinatenSystemZuruecksetzen();
      
      /* Alle Rechtecke in der Arrayliste 'rechtecke' zeichnen */
      for( int i = 0; i < rechtecke.size(); i++ )
      {
         rechtecke.get(i).zeichnen(this.koordinatenSystem);
      }
      
      
      
   }
}
