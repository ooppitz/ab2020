package de.die_gfi.oppitz;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Playground {

	public static void main(String[] args) {


		MyClass instance = new MyClass(1, 7, "Einstein");
		System.out.println("Name = " + instance.name);

		int staticResult = MyClass.staticAdd(instance);

	
		System.out.println("Static Result = " + staticResult);

	}


}

class MyClass {

	int a;
	int b;
	int c;

	String name; 
	
	public MyClass() {
	
		this.c = -1;
		this.name = "<the name was not yet set to a specific value>";
		
	}
	
	public MyClass(int p1, int p2) {
		
		this();  // Ruft den Default-Konstruktor auf
		
		this.a = p1;
		this.b = p2;
	}
	
	
	public MyClass(int a, int b, String name) {
		
		this(a,b);
		
		this.name = name;
	}
	
	int add() {

		return a + b;
	}

	int add2() {

		return this.a + this.b;
	}

	/*
	 * Jede Objekt-Methode arbeitet auf einem Objekt. Der Pointer this zeigt auf
	 * dieses Objekt
	 */
	int add3() {

		MyClass ref = this;
		return ref.a + ref.b;
	}

	/* Eine statische Methode gehört der ganzen Klasse */
	static int staticAdd(MyClass ref) {
		
		return ref.a + ref.b;
	}

}