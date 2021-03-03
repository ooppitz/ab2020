package de.die_gfi.daniel.shop;


public class Customer
{
   String name;
   String adresse;
   String email;

   
   
   public Customer( String name, String adresse, String email )
   {
      this.name = name;
      this.adresse = adresse;
      this.email = email;
   }
   
   
   public String toString()
   {
      return
            ":Customer" + "\n" +
            "Name    : " + this.name + "\n" + 
            "Adresse : " + this.adresse + "\n" +
            "E-Mail  : " + this.email;
   }
}
