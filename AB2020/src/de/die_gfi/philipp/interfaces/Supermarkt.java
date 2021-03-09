package de.die_gfi.philipp.interfaces;

public class Supermarkt {
    public static void main(String[] args) {
        Baecker michael = new Baecker("Michael", "Mueller", 2300.00, "michi@muellers.de",
                "Dorfen Str. 57", "86734", "Kander");

        Kassierer rosa = new Kassierer("Rosa", "Feher", 1800.00, "ro.feher@gmail.com",
                "Muenchner Str. 63", "86275", "Woauchimmer");

    }

}

abstract class Angestellter {
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

class Baecker extends Angestellter {

    public Baecker(String givenName, String surname, double salary, String eMailAddress,
                   String address, String postCode, String city) {
        super(givenName, surname, salary, eMailAddress, address, postCode, city);
    }

    @Override
    void spezialitaetDesAngestellten(String aufgabe) {
        if (aufgabe.equalsIgnoreCase("brot backen") || aufgabe.equalsIgnoreCase("torten dekorieren")) {
            System.out.println("Meine Spezialitaet ist " + aufgabe + ".");
        } else {
            System.out.println(aufgabe + " ist nicht so meins.");
        }
    }
}

class Kassierer extends Angestellter {

    public Kassierer(String givenName, String surname, double salary, String eMailAddress,
                     String address, String postCode, String city) {
        super(givenName, surname, salary, eMailAddress, address, postCode, city);
    }

    @Override
    void spezialitaetDesAngestellten(String aufgabe) {
        if (aufgabe.equalsIgnoreCase("kassieren") || aufgabe.equalsIgnoreCase("mit netten Leuten reden")) {
            System.out.println("Am liebsten mache ich " + aufgabe + ".");
        } else {
            System.out.println(aufgabe + " mache ich ungerne.");
        }
    }
}

class SystemAdministrator extends Angestellter {

    public SystemAdministrator(String givenName, String surname, double salary, String eMailAddress,
                               String address, String postCode, String city) {
        super(givenName, surname, salary, eMailAddress, address, postCode, city);
    }

    @Override
    void spezialitaetDesAngestellten(String aufgabe) {
        if (aufgabe.equalsIgnoreCase("linux") || aufgabe.equalsIgnoreCase("rhel") ||
        aufgabe.equalsIgnoreCase("red hat")) {
            System.out.println("Am liebsten arbeite ich mit " + aufgabe + ".");
        } else {
            System.out.println("Mit " + aufgabe + " mache/nutze ich ungerne.");
        }

    }
}

