package de.die_gfi.daniel.interfaces;

public class Restaurant
{

   public static void main( String[] args )
   {
      Chef chef = new Chef( "Eugene H. Krabs", 4000, "eugene.krabs@krustykrab.uw" );
      chef.spezialitaetDesAngestellten( "verwalten" );
      System.out.println( chef );
      
      
      Koch koch = new Koch( "Der Meister", 2400, "der.meister@koch.de" );
      koch.spezialitaetDesAngestellten( "spaghetti" );
      System.out.println( koch );
      
      
      Kassierer kassierer = new Kassierer( "Steve", 2300, "steve@gmx.de" );
      kassierer.spezialitaetDesAngestellten( "warten auf Kunden" );
      System.out.println( kassierer );
   }

}


abstract class Angestellter
{
   String name;
   double gehalt;
   String email;
   
   
   public Angestellter( String name, double gehalt, String email )
   {
      this.name = name;
      this.gehalt = gehalt;
      this.email = email;
   }
   
   
   public String ausgabe()
   {
      return
            String.format( "%-6s : %s", "Name", this.name ) + "\n" +
            String.format( "%-6s : %.2f", "Gehalt", this.gehalt ) + "\n" +
            String.format( "%-6s : %s", "E-Mail", this.email ) + "\n";
   }
   
   public String toString()
   {
      return
            "# Angestellter" + "\n" +
            ausgabe();
   }
   
   
   abstract void spezialitaetDesAngestellten(String aufgabe);
}


class Chef extends Angestellter
{
   String sessel;
   boolean tresorSchluessel;
   
   
   public Chef(String name, double gehalt, String email)
   {
      super(name, gehalt, email);
   }
   
   
   public String toString()
   {
      return
            "# Chef" + "\n" +
            ausgabe();
   }
   
   
   void spezialitaetDesAngestellten(String aufgabe)
   {
      if( aufgabe.equalsIgnoreCase( "verwalten" ) )
      {
         System.out.println( "Meine Spezialität ist Bargeld zaehlen" );
      }
   }
}


class Koch extends Angestellter
{
   public Koch(String name, double gehalt, String email)
   {
      super(name, gehalt, email);
   }
   
   
   public String toString()
   {
      return
            "# Koch" + "\n" +
            ausgabe();
   }
   
   
   void spezialitaetDesAngestellten(String aufgabe)
   {
      if( aufgabe.equalsIgnoreCase( "spaghetti" ) )
      {
         System.out.println( "In Ordnung, kommt sofort." );
      }
   }
}


class Kassierer extends Angestellter
{
   public Kassierer(String name, double gehalt, String email)
   {
      super(name, gehalt, email);
   }
   
   
   public String toString()
   {
      return
            "# Kassierer" + "\n" +
            ausgabe();
   }
   
   
   void spezialitaetDesAngestellten(String aufgabe)
   {
      if( aufgabe.equalsIgnoreCase( "warten auf Kunden" ) )
      {
//       System.out.println( "Meine Spezialität ist mich vom Koch nerven zu lassen" );
         System.out.println( "Ich waere soweit" );
      }
   }
}
