package de.die_gfi.jonathan.shop;

public class Book extends Product {
int Isbn = (int) (Math.random()*8);
String Autor;
//String Titel;
String Sprache;

public Book (String A,String T,String S,double p,int pn) {
	Autor=A;
	Name=T;
	Sprache=S;
	Preis =p;
	Produktnummer =pn;
}
}
