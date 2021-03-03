package de.die_gfi.oppitz.shop;

public class Book extends Product {

	String author; 
	String publisher; 
	int publicationYear;
	
	public Book(String name, String description, double price, String author, String publisher, int publicationYear) {
		
		super(name, description, price);
		
		this.author = author;
		this.publisher = publisher;
		this.publicationYear = publicationYear;
		
	}
	
	@Override
	public String toString() {
		return "Book '" + name + "' (" + author + ")" + " published by " + publisher + " in " + publicationYear + "; Cost: " + price;
	}

}
