package de.die_gfi.felix.personTelefon;

import java.time.LocalDate;

public class ApplicationPersonTelefon {
	
	public static void main(String args[]) {
		Person p1 = new Person(123, "Guentherson", "Harald", 'w', LocalDate.of(2133, 11, 22));
		Person p2 = new Person(124, "Speer", "Heinrich", 'm', LocalDate.of(1808, 7, 2));
		Telefon t1 = new Telefon("1234567890", "Festnetztelefon", p1);
		Telefon t2 = new Telefon("0987654321", "Mobiltelfon", p1);
		System.out.println(p1.toString());	
		System.out.println(p1.stringBesesseneTelefone());
		t1.setInhaber(p2);
		System.out.println(p1.toString());	
		System.out.println(p1.stringBesesseneTelefone());
		System.out.println(p2.toString());
		System.out.println(p2.stringBesesseneTelefone());
	}
	
}
