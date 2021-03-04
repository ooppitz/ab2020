package de.die_gfi.daniel.shop;

import java.util.ArrayList;

import de.die_gfi.daniel.shop.products.Warenlager;

public class Shop
{
   /* Shopdaten */
   String name;
   String adresse;

   ArrayList<Product> warenlager;
   
   /* Inhaberdaten */
   long steuerNummer;
   String adresseInhaber;
   
   
   public Shop( String name, String adresse, long steuerNummer, String adresseInhaber )
   {
      this.name = name;
      this.adresse = adresse;
      this.steuerNummer = steuerNummer;
      this.adresseInhaber = adresseInhaber;      
      
      this.warenlager = Warenlager.createWarenlager();
      
   }
   
   
   public String ausgabe()
   {
      return
            String.format( "%-15s: %s", "Name", this.name ) + "\n" +
            String.format( "%-15s: %s", "Adresse", this.adresse ) + "\n" +
            String.format( "%-15s: %d", "Steuernummer", this.steuerNummer ) + "\n" +
            String.format( "%-15s: %s", "Inhaberadresse", this.adresseInhaber );
   }
   
   
   public String toString()
   {
      return
            ":Shop" + "\n" +
            ausgabe() + "\n";
   }
}
