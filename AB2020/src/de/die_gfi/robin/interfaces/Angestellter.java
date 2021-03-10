package de.die_gfi.robin.interfaces;
import java.util.Scanner;

public abstract class Angestellter {
	String name;
	double gehalt;
	String email;
	
	abstract void aufgabeGeben(String aufgabe);
	abstract void werBistDu();
	
	public Angestellter(String name, double gehalt, String email) {
		this.name = name;
		this.gehalt = gehalt;
		this.email = email;
	}
	
}


class Reinigungskraft extends Angestellter {

	public Reinigungskraft(String name, double gehalt, String email) {
		super(name,gehalt,email);
	}
	
	
	void aufgabeGeben(String aufgabe) {
		if (aufgabe.equals("putzen") == false) {
			System.out.println("Tut mir leid, das kann ich nicht so gut");
			System.out.println("Ich kann gut putzen");
		}
		else
			System.out.println("Das kann ich machen");
		
		
	}
	
	void werBistDu() {
		System.out.printf("%s\n%.2f €\n%s\n",this.name,this.gehalt,this.email);
	}
	
}

class Bueroarbeiter extends Angestellter {
		
	public Bueroarbeiter(String name, double gehalt, String email) {
		super(name,gehalt,email);
	}
	void aufgabeGeben(String aufgabe) {
		
		if (aufgabe.equals("Tasten drücken") == false) {
			System.out.println("Tut mir leid, das kann ich nicht so gut");
			System.out.println("Ich kann gut Tasten drücken");
		}
		else
			System.out.println("Das kann ich machen");
	}
	
	void werBistDu() {
		System.out.printf("%s\n%.2f €\n%s\n",this.name,this.gehalt,this.email);
	}
}

class Abteilungsleiter extends Angestellter {
	
	public Abteilungsleiter(String name, double gehalt, String email) {
		super(name,gehalt,email);
	}
	
	void aufgabeGeben(String aufgabe) {
		
		if (aufgabe.equals("Befehle geben") == false) {
			System.out.println("Tut mir leid, das kann ich nicht so gut");
			System.out.println("Ich kann gut Befehle geben");
		
		}
		else
			System.out.println("Das kann ich machen");
	}
	void werBistDu() {
		System.out.printf("%s\n%.2f €\n%s\n",this.name,this.gehalt,this.email);
	}
}

class Unternehmen {
	
	public Unternehmen () {
		
	}
	
	public Angestellter[] unternehmenErstellen() {
		
		
		Bueroarbeiter tom = new Bueroarbeiter("Tom", 3000.00, "tom@tommail.tom");
		Abteilungsleiter peter = new Abteilungsleiter("Peter", 4000.00, "peter@petermail.com");
		Reinigungskraft karsten = new Reinigungskraft("Karsten", 2000.00, "karsten@karstenmail.com");
		Angestellter[] personal = new Angestellter[] {tom,peter,karsten};
		return personal;
	}
}


class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		
		
		
	}
}

