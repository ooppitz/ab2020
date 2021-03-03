package de.die_gfi.robin.shop;

public class App {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Heinz" ,"Gruber", "Trauberstrasse 33", "45657", "Muenchen", false);
		
		System.out.println(c1);
		
		
		
		
		
		
	}
	
	ProductCollection createProductCollection() {
		Buch b1 = new Buch(5.0, "Harry Potter", "J.K.Rowlin");
		Getraenk g1 = new Getraenk(2.0, 0.5, "Augustiner"); 
		
	}
	
	
}
