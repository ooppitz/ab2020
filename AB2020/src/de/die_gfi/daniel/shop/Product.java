package de.die_gfi.daniel.shop;

public class Product
{
   String name;
   double preis;
   String beschreibung;
   long artikelNummer;
   
   
   
   public Product( String name, double preis, String beschreibung, long artikelNummer )
   {
      this.name = name;
      this.preis = preis;
      this.beschreibung = beschreibung;
      this.artikelNummer = artikelNummer;
   }
   
   
   public String toString()
   {
      return
            "Name          : " + this.name + "\n" +
            "Preis         : " + this.preis + "\n" +
            "Beschreibung  : " + this.beschreibung + "\n" +
            "Artikelnummer : " + this.artikelNummer;
   }
}