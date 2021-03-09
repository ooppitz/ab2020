package de.die_gfi.daniel.shop;

public class Book extends Product implements CounterInterface
{
   String verlag;
   String author;
   String isbn;
// int erscheinungsJahr;
// int auflage;
   static int anzahlBook = 0;


   public Book(String name, double preis, String beschreibung, long artikelNummer, String verlag, String author, String isbn)
   {
      super(name, preis, beschreibung, artikelNummer);
      
      this.verlag = verlag;
      this.author = author;
      this.isbn = isbn;
      
      Book.anzahlBook++;
   }


   public String toString()
   {
      return
            ":Book" + "\n" +
            this.ausgabe() + "\n" +
            "Verlag        : " + this.verlag + "\n" +
            "Author        : " + this.author + "\n" +
            "ISBN          : " + this.isbn + "\n";
   }


   public int getCount()
   {
      return Book.anzahlBook;
   }
   
}
