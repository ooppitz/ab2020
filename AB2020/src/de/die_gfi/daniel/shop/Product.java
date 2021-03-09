package de.die_gfi.daniel.shop;

public class Product implements CounterInterface
{
   String name;
   double preis;
   String beschreibung;
   long artikelNummer;
   static int anzahlProduct = 0;
   
   
   
   public Product( String name, double preis, String beschreibung, long artikelNummer )
   {
      this.name = name;
      this.preis = preis;
      this.beschreibung = beschreibung;
      this.artikelNummer = artikelNummer;

      
      /* Wenn es sich um eine Instanz von 'Product' handelt */
      if( this instanceof Product )
      {
         Product.anzahlProduct++;
      }
   }
   
   
   public String ausgabe()
   {
      return
//          String.format( "%-14s: ", "Name" ) + this.name + "\n" +
            "Name          : " + this.name + "\n" +
            "Preis         : " + this.preis + "\n" +
            "Beschreibung  : " + this.beschreibung + "\n" +
            "Artikelnummer : " + this.artikelNummer;
      
   }
   
   
   public String toString()
   {
      return
            ":Product" + "\n" +
            this.ausgabe() + "\n";
   }


   public int getCount()
   {
      return Product.anzahlProduct;
   }
   
/*   
   public String toString()
   {
      return
            "Name          : " + this.name + "\n" +
            "Preis         : " + this.preis + "\n" +
            "Beschreibung  : " + this.beschreibung + "\n" +
            "Artikelnummer : " + this.artikelNummer;
   }
*/
}
