/*
 * Autor: Daniel Schmidt
 * Datum: 1. April 2021
 *
 *
 * Verwendeter C-Standard: ANSI C
 */

/* Formel: https://de.wikipedia.org/wiki/Wochentagsberechnung */


#include <stdio.h>



int anzahl_stellen( int zahl );
int erste_stellen( int zahl );
int letzte_stellen( int zahl );


int main(void)
{
   int tag, monat, jahr;

   int   d,    /* Tagesdatum 1 bis 31                                                  */
         m,    /* Monat gemaeß "monat_tabelle"                                         */
         y,    /* Die beiden letzten Stellen der Jahreszahl,                           */
               /* bei den Monaten Januar und Februar die letzten Stellen des Vorjahres */
         c,    /* Die beiden ersten Stellen der Jahreszahl, bei den Monaten Januar und */
               /* Februar die ersten Stellen des Vorjahres                             */
         w;    /* Wochentag gemaeß wochentag_tabelle                                   */


   int monat_tabelle[12] = { 11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
   char *wochentag_tabelle[7] = { "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag" };


   printf( "Geben Sie ein Datum ein (dd.mm.jjjj)\n" );
   scanf( "%d.%d.%d", &tag, &monat, &jahr );


#ifdef TEST

   printf( "Das eingegebene Datum war\n" );
   printf( "%02d.%02d.%04d\n", tag, monat, jahr );

#endif


   d = tag;
   m = monat_tabelle[monat-1];

   if( monat == 1  ||  monat == 2 )    /* Wenn der eingegebene Monat ein Januar oder Februar ist   */
   {                                   /* sind die ersten bzw. letzten beiden stellen des          */
      jahr = jahr - 1;                 /* Vorjahres wichtig                                        */
   }

   y = letzte_stellen( jahr );
   c = erste_stellen( jahr );


   w = (d + (int)(2.6*m-0.2) + y + (int)(y/4) + (int)(c/4) - 2*c) % 7;


#ifdef TEST

   printf( "d = %d\n", d );
   printf( "m = %d\n", m );
   printf( "y = %d\n", y );
   printf( "c = %d\n", c );
   printf( "w = %d\n", w );

#endif


   /* Wenn w negativ ist, solange 7 addieren bis w >= 0 ist */
   if( w < 0 )
   {
      while( w <= 0 )
      {
         w = w + 7;
      }
   }


#ifdef TEST

   printf( "w = %d\n", w );

#endif



   printf( "Bei dem Datum handelt es sich um einen %s\n", wochentag_tabelle[w] );



   return 0;
}


int anzahl_stellen( int zahl )
{
   int anzahl = 0;

   while( zahl != 0 )
   {
      zahl /= 10;
      anzahl++;
   }

   return anzahl;
}


int erste_stellen( int zahl )
{
   int wert = anzahl_stellen( zahl );
   int i;


   for( i = 0; i < wert - 2; i++ )
   {
      zahl /= 10;
   }

   return zahl;
}


int letzte_stellen( int zahl )
{
   int wert = zahl;

   wert = wert / 100;
   wert = wert * 100;

   zahl = zahl - wert;

   return zahl;
}
