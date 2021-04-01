/* Aufgabe 4:

Implementieren Sie einen enum Monat für die Monate Januar bis Dezember. 
Implementieren Sie eine class Kalender mit einer Methode 

    public static int berechneTageProMonat(int jahr, Monat m);

Die Methode soll Schaltjahre berücksichtigen. Jedes vierte Jahr (2004, 2008, 2012, … ) ist ein Schaltjahr. Entwerfen Sie einen entsprechenden Algorithmus, sodass für den Februar eine korrekte Anzahl der Tage errechnet wird. Wenn Sie möchten, können Sie einen Algorithmus implementieren, der auch Sonderfälle bzgl. Schaltjahren berücksichtigt.
Bzgl. Des switch-case Statements können Sie sich entscheiden, ob Sie die Variante mit „break“ oder mit "->" benützen.

Jan 31 
Februar 28/29. ß Schaltjahr
März 31
April 30
Mai 31
Juni 30 
Juli 31
August 31
September 30
Oktober 31
November 30
Dezember 31

Beispielausgabe:
int zaehler = berechneTageProMonat(1984, FEBRUAR);
System.out.println(zaehler); 
29 




Aufgabe 5:

Erweitern Sie das Programm Kalender. Führen Sie eine Methode berechneTageProMonat() ein, welche als Parameter ein Jahr bekommt und einen int von 1 bis 12, welcher den Monat angibt. Die Methode soll dasselbe Ergebnis wie die vorhandene Methode liefern.

    public static int berechneTageProMonat(int jahr, Monat monat);
    public static int berechneTageProMonat(int jahr, int monat );



Aufgabe 7:

Implementieren Sie eine Methode, welche für ein Datum berechnet, der wievielte Tag im Jahr dieses ist. Die Methode soll die folgende Signatur haben:

     static int berechneTagesNummer(int jahr, int m, int tag);
     
Beispiele für den Output:

  int a = berechneTagNummer(2000, 1, 1); // Ergebnis = 1
  int b = berechneTagNummer(2000, 3, 1); // Ergebnis = 61
  int b = berechneTagNummer(2000, 3, 10); // Ergebnis = 40
  int c = berechneTagNummer(2000, 12, 31); // Ergebnis = 366
  
  
  
Aufgabe 8:

Berechnen Sie für ein Datum, welchen Wochentag dieses hat.
Ziel: Ausgabe des Wochentags für ein Datum.



Aufgabe 9:

Erweitern Sie das Programm, sodass es ungültige Tage erkennt und eine Exception wirft. Überlegen Sie , an welchen Stellen ein ungültiges Datum überprüft werden muss. Schreiben Sie eine Methode, welche die Überprüfung vornimmt.



Aufgabe 10:

Implementieren Sie eine Methode, die für einen Monat alle Tage im Format eines Kalenders auf der Konsole ausgibt.

  void druckeMonat(int jahr, int monat)
  
Die Methode soll für beliebige Monate funktionieren.
Testen Sie die Methode für verschiedene Monate und Jahre.

*/

package de.die_gfi.daniel.enumexercise;

/**
 * Enthaelt Methoden zur Datumsberechnung
 * 
 * @author Daniel
 *
 */
public class Kalender
{
   
   /**
    * Berechnet wie viele Tage ein angegebener Monat in einem bestimmten Jahr hat.
    * Nimmt Ruecksicht auf Schaltjahre.
    * 
    * @param jahr Das angegebene Jahr
    * @param m Der angegebene Monat
    * @return Gibt die Anzahl der Tage des Ausgewaehlten Monats zurueck
    */
   public static int berechneTageProMonat( int jahr, Monat m )
   {
      int anzahlTage = 0;
      
      switch( m )
      {
        case JANUAR:    anzahlTage = 31; break;
        case FEBRUAR:   anzahlTage = schaltJahr(jahr) ? 29 : 28; break;
        case MÄRZ:      anzahlTage = 31; break;
        case APRIL:     anzahlTage = 30; break;
        case MAI:       anzahlTage = 31; break;
        case JUNI:      anzahlTage = 30; break;
        case JULI:      anzahlTage = 31; break;
        case AUGUST:    anzahlTage = 31; break;
        case SEPTEMBER: anzahlTage = 30; break;
        case OKTOBER:   anzahlTage = 31; break;
        case NOVEMBER:  anzahlTage = 30; break;
        case DEZEMBER:  anzahlTage = 31; break;
            
        default:        System.err.println( "Das haette nicht passieren duerfen" );
                        break;
      }

      return anzahlTage;
   }
   
   
   /**
    * Hat die Selbe Funktion wie "berechneTageProMonat( int jahr, Monat m )". Der Monat wird als Zahl angegeben.
    * Ruft "berechneTageProMonat( int jahr, Monat m )" auf.
    * 
    * @param jahr Das angegebene Jahr
    * @param monat Der angegebene Monat
    * @return Gibt die Anzahl der Tage des Ausgewaehlten Monats zurueck
    */
   public static int berechneTageProMonat(int jahr, int monat )
   {
      Monat kalenderMonat = Monat.JANUAR;
      
      switch( monat )
      {
         case  1: kalenderMonat = Monat.JANUAR; break;
         case  2: kalenderMonat = Monat.FEBRUAR; break;
         case  3: kalenderMonat = Monat.MÄRZ; break;
         case  4: kalenderMonat = Monat.APRIL; break;
         case  5: kalenderMonat = Monat.MAI; break;
         case  6: kalenderMonat = Monat.JUNI; break;
         case  7: kalenderMonat = Monat.JULI; break;
         case  8: kalenderMonat = Monat.AUGUST; break;
         case  9: kalenderMonat = Monat.SEPTEMBER; break;
         case 10: kalenderMonat = Monat.OKTOBER; break;
         case 11: kalenderMonat = Monat.NOVEMBER; break;
         case 12: kalenderMonat = Monat.DEZEMBER; break;
         
         default: System.err.println( "Fuer die Monate sind nur Zahlen von 1 bis 12 erlaubt" );
                  System.err.println( "Benuzte 'Januar' als Monat" );
                  break;
      }
      
      
      return berechneTageProMonat( jahr, kalenderMonat );
   }
   
   
   /**
    * Ueberprueft ob es sich bei einem bestimmten Jahr um ein Schaltjahr handelt
    * 
    * @param jahr Das Jahr welches ueberprueft werden soll
    * @return true wenn es sich um ein Schaltjahr handelt ansonsten false
    */
   private static boolean schaltJahr( int jahr )
   {
      return ((jahr % 4 == 0)  &&  (jahr % 100 != 0)) || (jahr % 400 == 0);
   }
   
   
   static int berechneTagesNummer(int jahr, int m, int tag)
   {
      int tagesNummer = 0;
      
      tagesNummer = tag;
      
      for( int i = 1; i < m; i++ )
      {
         tagesNummer = tagesNummer + berechneTageProMonat( jahr, i );
      }
      
      
      return tagesNummer;
   }
   
   /**
    * Berechnet zu einem bestimmten Datum um welchen Wochentag es sich handelt
    * 
    * @param jahr 
    * @param monat
    * @param tag
    * @return
    */
   public static Wochentag berechneWochentag( int jahr, int monat, int tag )
   {
      int   d;    /* Tagesdatum 1 bis 31                                                  */
      int   m;    /* Monat gemaeß "monat_tabelle"                                         */
      int   y;    /* Die beiden letzten Stellen der Jahreszahl,                           */
                  /* bei den Monaten Januar und Februar die letzten Stellen des Vorjahres */
      int   c;    /* Die beiden ersten Stellen der Jahreszahl, bei den Monaten Januar und */
                  /* Februar die ersten Stellen des Vorjahres                             */
      int   w;    /* Wochentag gemaeß wochentag_tabelle                                   */   

      
      int[] monat_tabelle = { 11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      Wochentag[] wochentag_tabelle = {
            Wochentag.SONNTAG,
            Wochentag.MONTAG,
            Wochentag.DIENSTAG,
            Wochentag.MITTWOCH,
            Wochentag.DONNERSTAG,
            Wochentag.FREITAG,
            Wochentag.SAMSTAG,
      };

      ueberpruefeDatum(jahr, monat, tag);

      d = tag;
      m = monat_tabelle[monat-1];
      
      
      if( monat == 1  ||  monat == 2 )    /* Wenn der eingegebene Monat ein Januar oder Februar ist   */
      {                                   /* sind die ersten bzw. letzten beiden stellen des          */
         jahr = jahr - 1;                 /* Vorjahres wichtig                                        */
      }
      
      
      y = letzteZweiStellen( jahr );
      c = ersteZweiStellen( jahr );
      
      
      
      w = (d + (int)(2.6*m-0.2) + y + (int)(y/4) + (int)(c/4) - 2*c) % 7;

      
      
      System.out.printf( "d = %d\n", d );
      System.out.printf( "m = %d\n", m );
      System.out.printf( "y = %d\n", y );
      System.out.printf( "c = %d\n", c );
      System.out.printf( "w = %d\n", w );
      
      
      /* Wenn w negativ ist, solange 7 addieren bis w >= 0 ist */
      while( w < 0 )
      {
         w = w + 7;
      }
      
      System.out.printf( "w = %d\n", w );
      


      
      
      return wochentag_tabelle[w];
   }
   
   
   private static int anzahl_stellen( int zahl )
   {
      int anzahl = 0;

      while( zahl != 0 )
      {
         zahl /= 10;
         anzahl++;
      }

      return anzahl;
   }
   
   
   private static int ersteZweiStellen( int zahl )
   {
      int wert = anzahl_stellen( zahl );
      int i;


      for( i = 0; i < wert - 2; i++ )
      {
         zahl /= 10;
      }

      return zahl;
   }
   
   
   private static int letzteZweiStellen( int zahl )
   {
      int wert = zahl;

      wert = wert / 100;
      wert = wert * 100;

      zahl = zahl - wert;

      return zahl;
   }
   
   
   
   /**
    * Ueberprueft ob ein angegebenes Datum existiert
    * 
    * @param jahr Das Jahr des Datums
    * @param monat Der Monoat des Datums
    * @param tag Der Tag des Datums
    */
   // TODO: dokumentieren mit JavaDoc dieser Methode
   // TODO: Die Fehlermeldung sollte konkreter ausgeben, was das Problem darstellt
   //       1) Welches Datum ist fehlerhaft (jahr, monat, tag)??
   //       2) So gut wie möglich, was der Fehler ist
   public static void ueberpruefeDatum( int jahr, int monat, int tag )
   {
      
      if( tag > berechneTageProMonat(jahr, monat) || tag < 1 )
      {
         /* String fehlermeldung = "Das übergebene Datum ist fehlerhaft"; */
         String fehlerMeldung = ""; 
         fehlerMeldung += String.format( "Das uebergebene Datum %02d.%02d.%04d ist fehlerhaft\n", tag, monat, jahr );
         fehlerMeldung += String.format( "Der Monat hat nicht %d Tage, sondern nur 1 bis %d Tage\n", tag, berechneTageProMonat(jahr, monat) );

         IllegalArgumentException e = new IllegalArgumentException(fehlerMeldung);
         throw e;
      }
      
      if( monat < 1  || monat > 12 )
      {
         String fehlerMeldung = "";
         fehlerMeldung += String.format( "Das uebergebene Datum %02d.%02d.%04d ist fehlerhaft\n", tag, monat, jahr );
         fehlerMeldung += String.format( "Ein Jahr hat nicht %d Monate sondern nur 1 bis 12 Monate\n", monat );
         
         IllegalArgumentException exception = new IllegalArgumentException( fehlerMeldung );
         throw exception;
      }
      
      if( jahr < 0 )
      {
         
      }
   }
   
   
   
   void druckeMonat(int jahr, int monat)
   {
/*      
           April 2020
      So Mo Di Mi Do Fr Sa
                1  2  3  4
       5  6  7  8  9 10 11
      12 13 14 15 16 17 18
      19 20 21 22 23 24 25
      26 27 28 29 30
*/
      
      String ueberschrift = "So Mo Di Mi Do Fr Sa";
      int tage[][] = new int[5][7];
      int anzahlTage = berechneTageProMonat( jahr, monat );
      int tageZaehler = 1;
      int i = 0,
          j = 0;
      
      Wochentag ersterTag = berechneWochentag( jahr, monat, 1 );
      
      switch( ersterTag )
      {
         case MONTAG:       j = 0;  break;
         case DIENSTAG:     j = 1;  break;
         case MITTWOCH:     j = 2;  break;
         case DONNERSTAG:   j = 3;  break;
         case FREITAG:      j = 4;  break;
         case SAMSTAG:      j = 5;  break;
         case SONNTAG:      j = 6;  break;
      }
      
      
      while( tageZaehler <= anzahlTage )
      {
         tage[i][j] = tageZaehler;
         j++;
         tageZaehler++;
         
         if( j > 6 ) 
         {
            i++;
            j = 0;
         }
      }
      
      
      
      /* Kalender ausgeben */
      
      System.out.println( ueberschrift );
      for( i = 0; i < 5; i++ )
      {
         for( j = 0; j < 7; j++ ) 
         {
            
         }
      }
   }
}

