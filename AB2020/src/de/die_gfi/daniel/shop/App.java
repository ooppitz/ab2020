package de.die_gfi.daniel.shop;

public class App
{
   public static void main(String[] args)
   {
      
      /* Customer Test */
      Customer daniel = new Customer( "Daniel Schmidt", "Zuhause. 7, 8000 Muenchen", "daniel.schmidt@anbieter.de" );
      System.out.println( daniel );
      System.out.println();
      
      
      /* Product Test */
      Product wecker = new Product( "Analogwecker", 10.0, "Made in Germany", 4189325 );
      System.out.println( wecker );
      System.out.println();
   }
}
