package de.die_gfi.robin.shop;

public class Shop {

	String shopName;
	String strasse;
	String ort;
	int steuerNummer;

	protected Shop(String sName, String str, String ort, int sNummer) {
		this.shopName = sName;
		this.strasse = str;
		this.ort = ort;
		this.steuerNummer = sNummer;

	}

	public String toString() {
		return this.shopName + "\n" + this.strasse + "\n" + this.ort + "\nSteuernummer: " + this.steuerNummer;
	}

}
