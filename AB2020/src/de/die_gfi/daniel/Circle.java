package de.die_gfi.daniel;

public class Circle
{

   // Radius
   // Mittelpunkt

   double radius; // Each object has a variable "r"
   double x; // Each object has a variable "xCoordinate"
   double y;

   public static void main(String[] args)
   {
      int anzahl = 6;
      Circle[] circles = new Circle[anzahl];

      circles[0] = new Circle( 2, 3, 3 );
      circles[1] = new Circle( 2, 2, 6 );

      circles[2] = new Circle( 3, 2, 10 );
      circles[3] = new Circle( 4, 10, 11 );
      circles[4] = new Circle( 3, 11, 5 );
      circles[5] = new Circle( 1, 6, 6 );



      Circle[] touchingCircles = touchingCircles(circles);

      
      /* Anzahl der belegten Arrayelemente feststellen */
      int zaehler = 0;

      while( (zaehler < anzahl)  &&  touchingCircles[zaehler] != null )     /* Die Abfrage 'zaehler < anzahl' muss zuerst ausgeführt werden */
      {                                                                     /* oder es kann ein 'out of bounds error' auftreten */
         zaehler++;
      }
      System.out.printf( "Anzahl sich ueberlappender Kreise: %d\n", zaehler );
      
      
      /* Relevante Inhalte aus touchingCircles in ein neues Array kopieren */
      Circle[] neuArray = new Circle[zaehler]; 
      for( int i = 0; i < zaehler; i++ )
      {
         neuArray[i] = touchingCircles[i];
      }
      
      
      /* Neues Array ausgeben */
      System.out.printf( "radius(x/y)\n" );
      for( Circle c : neuArray )
      {
         System.out.printf( "%.2f(%.2f/%.2f)\n", c.radius, c.x, c.y );
         
      }
      
      
      /* toString() Test */
      System.out.println();      
      for( int i = 0; i < circles.length; i++ )
      {
         System.out.println( circles[i] );
         System.out.println();
      }
      
      
      /* selectBiggest( ... ) Test  */
      Circle maxKreis = selectBiggest( circles );
      System.out.println( "Der groeßte Kreis ist:" );
      System.out.println( maxKreis );
      
   }

   /**
    * This constructor initialises a Circle object
    * 
    * @param r
    * @param x
    * @param y
    */
   public Circle(double r, double x, double y)
   {

      this.radius = r;
      this.x = x;
      this.y = y;

   }

   /**
    * Calculates the area of *this* circle
    * 
    * @return the area of this circle
    */
   public double calculateArea()
   { // Object method / instance method

      return this.radius * this.radius * Math.PI;
   }

   /**
    * Calculate the diameter of this circle
    * 
    * @return the diameter
    */
   public double calculateDiameter()
   {
      return this.radius * 2;
   }

   /**
    * Calculates the circumference of this circle
    * 
    * @return the circumference
    */

   public double calculateCircumference()
   {

      return calculateDiameter() * Math.PI;

   }

   /** Calculates the distance of a given point from the center oft he circle
    * 
    * @param px
    * @param py
    * @return
    */
   public double calculateDistance(double px, double py)
   {
      double laengeX;
      double laengeY;
      
      laengeX = px - this.x;
      laengeY = py - this.y;
      
      return Math.sqrt( laengeX * laengeX + laengeY * laengeY );   
   }
   
   
   /**
    * Calculate the distance between the specified point and the center of *this* circle.
    * @param px
    * @param py
    * @return
    */
   public boolean isOnCircle( double px, double py )
   {
      double distance = this.calculateDistance( px, py );
      boolean rueckgabe = false;
      
      if( distance <= this.radius )
      {
         rueckgabe = true;
      }
      
      return rueckgabe;
   }
   
   
   public boolean istouching( Circle a )
   {
      boolean touching = false;
      
      double EntfernungMittelPunkte;
      double EntfernungMax;
      
      EntfernungMax = this.radius + a.radius;
      EntfernungMittelPunkte = this.calculateDistance( a.x, a.y );
      
      
      if( EntfernungMittelPunkte <= EntfernungMax )
      {
         touching = true;
      }
      
      
      return touching;
   }
   
   
   /** Calculates the overlapping circles of the specified array. 
    * 
    * @param c 
    * @return an array containing circles that overlap with at least one other circle
    */
   public static Circle[] touchingCircles(Circle[] c)
   {
      Circle[] array = new Circle[c.length];
      int k = 0;
      
      for( int i = 0; i < c.length; i++ )
      {
         for( int j = 0; j < c.length; j++ )
         {
            if( i != j )
            {
               if( c[i].istouching(c[j]) )
               {
                  array[k] = c[i];
                  k++;
                  break;
               }
            }  
         }         
      }
      
      return array;
   }
   
   
   public String toString()
   {
      return "radius = " + this.radius + "\n" + "Mittelpunkt: (" + this.x + "/" + this.y + ")";
   }
   
   
   /**
    * Schreiben Sie eine static Method, welche ein Array von Circles bekommt und den größten Circle zurückgibt.
    * Wenn es mehrere gleich große Kreise gibt, wird einer davon zurückgegeben.
    * @param c
    * @return
    */
   public static Circle selectBiggest( Circle[] c )
   {
      int maxIndex = 0;

      for( int i = 1; i < c.length; i++ )
      {
         if( c[maxIndex].radius < c[i].radius )
         {
            maxIndex = i;
         }
      }


      return c[maxIndex];
   }
}
