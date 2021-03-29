package de.die_gfi.jonathan.name.oop;

import java.util.ArrayList;

public class Patient extends Person {
  String diagnose;
  ArrayList<String> Symtome;
	
	public Patient(int a, double h, double g, String v, String n,String d) {
		super(a, h, g, v, n);
		diagnose =d;
	}

}


