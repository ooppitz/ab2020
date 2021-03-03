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
      
      Product nudeln = new Product( "Fusilli Nudeln", 0.49, "500 gramm", 7928195 );
      System.out.println( nudeln );
      System.out.println();
      
      
      /* Book Test */
      Book buch = new Book( "Javainsel", 49.90, "15. Auflage", 9783836377372L, "Rheinwerk Verlag", "Christian Ullenboom", "978-3-8362-7737-2" );
      System.out.println( buch );
      System.out.println();
      
      
      /* Lebensmittel Test */
      Lebensmittel brot = new Lebensmittel( "Vierkornbrot", 10.0, "Scheibenstaerke 12", 4803460, "5 Tage" );
      System.out.println( brot );
      System.out.println();
   }
}
