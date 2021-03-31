package de.die_gfi.daniel.shop;

public class Product implements CounterInterface, Discount
{
   String name;
   double preis;
   String beschreibung;
   long artikelNummer;
   private static int anzahlProduct = 0;
   
   
   
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
   
   
   protected String ausgabe()
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


   public boolean isDiscountPossible()
   {
      return true;
   }


   public int getMaximumDiscount()
   {
      return 10;
   }


   public int getDiscountForAmount( int count )
   {
      // TODO Auto-generated method stub
      int rabatt;
      
      rabatt = 0;

      if(count >= 50 && count < 100)
      {
         rabatt = 5;
      }
      else
      {
         if(count > 100)
         {
            rabatt = this.getMaximumDiscount();
         }
      }
      
      return rabatt;
   }
   
   
   
}
