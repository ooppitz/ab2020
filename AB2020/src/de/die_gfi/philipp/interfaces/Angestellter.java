package de.die_gfi.philipp.interfaces;

public abstract class Angestellter {
    public String givenName;
    public String surname;
    public double salary;
    public String eMailAddress;
    public String address;
    public String postCode;
    public String city;

    public Angestellter(String givenName, String surname, double salary, String eMailAddress,
                        String address, String postCode, String city) {
        this.givenName = givenName;
        this.surname = surname;
        this.salary = salary;
        this.eMailAddress = eMailAddress;
        this.address = address;
        this.postCode = postCode;
        this.city = city;
    }

    abstract void spezialitaetDesAngestellten(String aufgabe);

}
