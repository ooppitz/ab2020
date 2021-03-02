package de.die_gfi.robin.geometry;

public class Quader {
	
	int a; //length
	int b; //width
	int c; //height
	
	
	
	public static void main(String[] args) {
		
		Quader q1 = new Quader(2, 2, 3);
		Quader q2 = new Quader(1, 2, 3);
		Quader q3 = new Quader(5, 2, 3);
		
		Quader[] arr = new Quader[3];
		arr[0] = q1;
		arr[1] = q2;
		arr[2] = q3;
		
		
		System.out.println(Quader.berechneMinimaleHoeheEinesStapels(arr));
		
		
		
	}
	
	
	//Konstruktor
	public Quader (int length, int width, int heigth) {
		this.a = length;
		this.b = width;
		this.c = heigth;
	}
	
	//Volumen berechnen
	public int calcVolume() {
		int vol = this.a * this.b * this.c;
		vol = vol * vol * vol;
		return vol;
	}
	
	//Kantenlängen addieren
	public int sumEdges() {
		int sum = (this.a + this.b + this.c) * 4;
		return sum;
	}
	//Oberfläche berechen
	public int calcSurface() {
		int surface = (this.a * this.b + this.a * this.c + this.b * this.c) * 2;
		return surface;
	}
	//Wert der kürzesten Seite wird ausgegeben
	public int shortestSide() {
		int shortest = this.a;
		if(this.b < shortest) {
			shortest = this.b;
		}
		if(this.c < shortest) {
			shortest = this.c;
		}
		return shortest;
	}
	
	
	public static int berechneMinimaleHoeheEinesStapels(Quader[] stapel) {
		int summe = 0;
		for (Quader eintrag : stapel) {
			summe = summe + eintrag.shortestSide();
		}
		return summe;
		
		
	}
	
	public String toString() {
		String s = "Der Quader hat eine Länge von " + this.a + " eine Breite von " + this.b + " und eine Höhe von " + this.c;
		return s;
	}
}
