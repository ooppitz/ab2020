package de.die_gfi.daniel.shop;

import java.util.ArrayList;

public class Customer
{
   String name;
   String adresse;
   String email;
/*
   int maxEinkaeufe = 20;
   Purchase einkaeufe[] = new Purchase[maxEinkaeufe];
   int zaehler = 0;
*/
   
   ArrayList<Purchase> einkaeufe;
   
   
   public Customer( String name, String adresse, String email )
   {
      einkaeufe = new ArrayList<Purchase>();
      this.name = name;
      this.adresse = adresse;
      this.email = email;
   }
   
   
   public String toString()
   {
      
      return
            ":Customer" + "\n" +
            String.format( "%-8s: %s", "Name", this.name ) + "\n" +
            String.format( "%-8s: %s", "Adresse", this.adresse ) + "\n" +
            String.format( "%-8s: %s", "E-Mail", this.email ) + "\n";
      
      
//          "Name    : " + this.name + "\n" + 
//          "Adresse : " + this.adresse + "\n" +
//          "E-Mail  : " + this.email + "\n";      
   }
   
   
   public void addPurchase( Purchase einkauf )
   {
      einkaeufe.add(einkauf);
   }
   
   
   public String listPurchase()
   {
      String rueckgabe = "";
      
      
      for( int i = 0; i < einkaeufe.size(); i++ )
      {
         rueckgabe += "\n";
         rueckgabe += "\n";
         rueckgabe += String.format( "Einkauf Nr. %3d", i + 1 ) + "\n";
         rueckgabe += "*".repeat(15) + "\n";
         rueckgabe += "\n";
         rueckgabe += einkaeufe.get(i).generateBill() + "\n";
      }
      
      
      return rueckgabe;
   }
}
