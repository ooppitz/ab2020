package de.die_gfi.philipp.interfaces;

public class Baenker extends Angestellter{

    public Baenker(String givenName, String surname, double salary, String eMailAddress,
                   String address, String postCode, String city) {
        super(givenName, surname, salary, eMailAddress, address, postCode, city);
    }

    @Override
    void spezialitaetDesAngestellten(String aufgabe) {
        System.out.println("Ich habe mich auf " + aufgabe + " spezialisiert.");
    }
}
