package de.die_gfi.franziska.shop;

import java.util.ArrayList;

public class Customer {

	String name;
	String adresse;
	String mail;
	int kundennummer;

	static ArrayList<Customer> kunden = zugeteilteKunden(kundenverwaltung());
	
	double bezahlt;

	public static void main(String[] args) {

	}

	/**
	 * 
	 * @return Customer constructor method pre kundennummer assignment
	 */
	public Customer(String n, String a, String m) {

		this.name = n;
		this.adresse = a;
		this.mail = m;

	}

	/**
	 * Customer constructor with kundennummer
	 * 
	 * @param n
	 * @param a
	 * @param m
	 * @param nummer
	 */
	public Customer(String n, String a, String m, int nummer) {

		this.name = n;
		this.adresse = a;
		this.mail = m;
		this.kundennummer = nummer;
		
		this.bezahlt = Purchase.berechneGesamtPreis(null);

	}

	public static ArrayList<Customer> zugeteilteKunden(ArrayList<Customer> originalListe) {

		originalListe = kundenverwaltung();

		ArrayList<Customer> neueListe = new ArrayList<Customer>();

		for (int i = 0; i < originalListe.size(); i++) {

			Customer kunde = new Customer(originalListe.get(i).name, originalListe.get(i).adresse,
					originalListe.get(i).mail, i + 1);

			neueListe.add(kunde);

		}

		return neueListe;
	}

	public String toString() {

		return "Name: " + name + "\nAdresse: " + adresse + "\nMail: " + mail + "\nKundennummer: " + kundennummer;

	}

	public String toSmallString() {

		return name + "\nKundennummer: " + kundennummer;

	}

	public static ArrayList<Customer> kundenverwaltung() {

		ArrayList<Customer> kunden = new ArrayList<Customer>();

		Customer sepp = new Customer("Sepp", "Landau", "sepp@gmail.com");
		Customer xav = new Customer("Xaverl", "Dingolfing", "xav@gmail.com");
		Customer lude = new Customer("Ludwig", "Gottfriedingerschwaigen", "lude@gmail.com");
		Customer kurt = new Customer("Kurt Maier", "Landau", "kurt@maier.de");

		kunden.add(sepp);
		kunden.add(xav);
		kunden.add(lude);
		kunden.add(kurt);

		return kunden;
	}

	public static String loginAnzeige() {

		String s = "";

		for (Customer customer : kunden) {
			s = s + customer.toSmallString() + "\n\n";
		}
		return s;
	}

	public static Customer chooseCustomer() {

		System.out.println(loginAnzeige());

		Customer kunde = new Customer("", "", "", 0);

		boolean searching = true;

		System.out.println("Bitte Ihre Kundennummer auswählen um fortzufahren");

		int auswahl = App.scannerApp.nextInt();

		while (searching) {
			for (int i = 0; i < kundenverwaltung().size(); i++) {

				if (kunden.get(i).kundennummer == auswahl) {
					kunde = kunden.get(i);
					searching = false;
				}
			}
		}
		return kunde;
	}

	public static String erstelleReport(Purchase p) {

		String s = "";

		for (Customer customer : kunden) {

			s = s + customer.name + " hat für " + Purchase.berechneGesamtPreis(p) + " eingekauft";

		}

		return s;

	}

}
