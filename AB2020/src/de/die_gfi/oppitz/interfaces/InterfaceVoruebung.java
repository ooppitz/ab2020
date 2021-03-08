package de.die_gfi.oppitz.interfaces;

public class InterfaceVoruebung {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			B instance = new B();
		}
		System.out.println("Es wurden " + B.count + " Instanzen der Klasse A angelegt");

	}

}

//     A
// 
//   B   C 

class A {

	static int count = 0; // es gibt nur einen Counter für die gesamte Klasse

	int zahl;
	int zahl2;

	public A() {  // Default-Konstruktor (hat keine Parameter)
		count++;
	}
 
	public A(int z1, int z2) {
		this(); // Rufe den Default-Konstruktor auf
 		this.zahl = z1;
		this.zahl2 = z2;
	}

}

class B extends A {

	public B() {
		super(4, 9);

	}

}

class C extends A {

	public C() {

	}

}