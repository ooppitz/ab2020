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



   public Bild()
   {
      rechtecke = new ArrayList<Rechteck>();
   }


   public void add( Rechteck rechteck )
   {
      rechtecke.add(rechteck);
   }


   private static void koordinatenSystemZuruecksetzen( char array[][] )
   {
      for( int zeilen = 0; zeilen < array.length; zeilen++ )
      {
         for( int spalten = 0; spalten < array[0].length; spalten++ )
         {
            array[zeilen][spalten] = '.';
         }
      }
   }
   
   
   public void drucken(char array[][]) {
	   
	   for( int y = 100-1; y >= 0; y-- )
	      {
	         for( int x = 0; x < 100; x++ )
	         {
	            System.out.printf("%c", array[y][x]);
	         }
	         System.out.printf("\n");
	      }
   }
   
   public void zeichnen( char array[][] )
   {
      /* Koordinatensystem löschen */
      koordinatenSystemZuruecksetzen( array );
      
      /* Alle Rechtecke in der Arrayliste 'rechtecke' zeichnen */
      for( int i = 0; i < rechtecke.size(); i++ )
      {
         rechtecke.get(i).zeichnen(array);
      }
      
      
      
   }
}
