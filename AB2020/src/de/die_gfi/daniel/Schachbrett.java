package de.die_gfi.daniel;

public class Schachbrett
{
   public static void main( String[] args )
   {
      double koerner = 1;     /* Anzahl der Koerner */
                        
      int zeilen;             /* Laufvariable fuer die Zeilen vom Schachbrett     */
      int spalten;            /* Laufvariable fuer die Spalten vom Schachbrett    */
      
      
      System.out.printf( "+------------+------------+------------+------------+------------+------------+------------+------------+\n" );
      
      for( zeilen = 0; zeilen < 8; zeilen++ )
      {
         System.out.printf( "|" );
         
         for( spalten = 0; spalten < 8; spalten++ )
         {
            System.out.printf( " %10.4E |", koerner );
            
            koerner = koerner * 2;
         }
         
         System.out.printf( "\n" );
         System.out.printf( "+------------+------------+------------+------------+------------+------------+------------+------------+\n" );

      }
      
      
   }
}
