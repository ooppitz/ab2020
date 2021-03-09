package de.die_gfi.robin.shop;

public class Buch extends Product implements CounterInterface {

	static int countBuch;
	String titel;
	String author;

	public Buch(int pNummer,double preis, String _titel, String _author) {
		
		super(pNummer,preis, _titel + " von " + _author);
		
		this.titel = _titel;
		this.author = _author;
		countBuch++;
		

	}

	public int getCount() {
		return countBuch;
	}
}
