package de.die_gfi.daniel.shop;

public class Book extends Product
{
   String verlag;
   String author;
   String isbn;
// int erscheinungsJahr;
// int auflage;


   public Book(String name, double preis, String beschreibung, long artikelNummer, String verlag, String author, String isbn)
   {
      super(name, preis, beschreibung, artikelNummer);
      
      this.verlag = verlag;
      this.author = author;
      this.isbn = isbn;
   }


   public String toString()
   {
      return
            ":Book" + "\n" +
            this.ausgabe() + "\n" +
            "Verlag        : " + this.verlag + "\n" +
            "Author        : " + this.author + "\n" +
            "ISBN          : " + this.isbn;
   }


}
