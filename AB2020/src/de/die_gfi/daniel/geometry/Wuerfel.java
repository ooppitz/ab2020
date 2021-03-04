package de.die_gfi.daniel.geometry;

public class Wuerfel extends Quader
{
   public Wuerfel( double a )
   {
      super( a, a, a );
   }
   

   public static void main(String[] args)
   {
      Wuerfel dice = new Wuerfel( 4 );
      
      System.out.printf( "%s\n", dice.toString() );
      System.out.printf( "Volumen: %f\n", dice.volumen() );
      System.out.printf( "KantenLaenge: %f\n", dice.summeKantenLaenge() );
      System.out.printf( "Oberflaeche: %f\n", dice.oberFlaeche() );
   }
   
   
   public String toString()
   {
      return "a = " + this.a;
   }

}
