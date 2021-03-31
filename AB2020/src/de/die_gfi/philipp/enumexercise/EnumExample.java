package de.die_gfi.philipp.enumexercise;

public class EnumExample {
    public static void main(String[] args) {
        System.out.println(druckeWochentag(Wochentag.MONTAG));
        System.out.println(druckeWochentagCheat(Wochentag.MONTAG));
        System.out.println(Wochentag.MONTAG);

        System.out.println(druckeWochentag(Wochentag.DIENSTAG));
        System.out.println(druckeWochentagCheat(Wochentag.DIENSTAG));
        System.out.println(Wochentag.DIENSTAG);

        System.out.println("etc. etc. etc.");

        System.out.println(druckeWochentag(Wochentag.SONNTAG));
        System.out.println(druckeWochentagCheat(Wochentag.SONNTAG));
        System.out.println(Wochentag.SONNTAG);
    }

    public static String druckeWochentag(Wochentag tag) {
        switch (tag) {
            case MONTAG -> {return "Montag";}
            case DIENSTAG -> {return "Dienstag";}
            case MITTWOCH -> {return "Mittwoch";}
            case DONNERSTAG -> {return "Donnerstag";}
            case FREITAG -> {return "Freitag";}
            case SAMSTAG -> {return "Samstag";}
            case SONNTAG -> {return "Sonntag";}
            default -> {return null;}
        }
    }

    public static String druckeWochentagCheat(Wochentag tag) {
        return tag.toString();
    }
}
