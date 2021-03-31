package de.die_gfi.philipp.enumexercise;

/**
 * Ein Beispiel wie Enums eingesetzt werden k&ouml;nnen.
 */
public class EnumExample {
    public static void main(String[] args) {
        druckeWochentag(Wochentag.MONTAG);
        druckeWochentagCheat(Wochentag.MONTAG);
        druckeWochentagEnglish(Wochentag.MONTAG);
        System.out.println(Wochentag.MONTAG);

        druckeWochentag(Wochentag.DIENSTAG);
        druckeWochentagCheat(Wochentag.DIENSTAG);
        druckeWochentagEnglish(Wochentag.DIENSTAG);
        System.out.println(Wochentag.DIENSTAG);

        System.out.println("etc. etc. etc.");

        druckeWochentag(Wochentag.SONNTAG);
        druckeWochentagCheat(Wochentag.SONNTAG);
        druckeWochentagEnglish(Wochentag.SONNTAG);
        System.out.println(Wochentag.SONNTAG);

    }

    /**
     * Druckt den gegebenen Wochentag auf der Konsole aus, und gibt diesen auch zur&uuml;ck
     *
     * @param tag Ein Wochentag
     * @return Einen String welcher das Wort vom Wochentag beinhaltet
     */
    public static String druckeWochentag(Wochentag tag) {
        String tagString;
        switch (tag) {
            case MONTAG -> tagString = "Montag";
            case DIENSTAG -> tagString = "Dienstag";
            case MITTWOCH -> tagString = "Mittwoch";
            case DONNERSTAG -> tagString = "Donnerstag";
            case FREITAG -> tagString = "Freitag";
            case SAMSTAG -> tagString = "Samstag";
            case SONNTAG -> tagString = "Sonntag";
            default -> tagString = null;
        }
        System.out.println(tagString);
        return tagString;
    }

    /**
     * Druckt den gegebenen Wochentag auf der Konsole aus, und gibt diesen auch zur&uuml;ck, aber auf Englisch
     *
     * @param tag Ein Wochentag
     * @return Einen String welcher das Wort vom Wochentag beinhaltet, aber auf Englisch
     * @see EnumExample#druckeWochentag(Wochentag)
     */
    public static String druckeWochentagEnglish(Wochentag tag) {
        String tagString;
        switch (tag) {
            case MONTAG -> tagString = "Monday";
            case DIENSTAG -> tagString = "Tuesday";
            case MITTWOCH -> tagString = "Wednesday";
            case DONNERSTAG -> tagString = "Thursday";
            case FREITAG -> tagString = "Friday";
            case SAMSTAG -> tagString = "Saturday";
            case SONNTAG -> tagString = "Sunday";
            default -> tagString = null;
        }
        System.out.println(tagString);
        return tagString;
    }

    /**
     * Cheat Form mit der {@link Wochentag#toString()} Methode um den String, der zurückgegeben wird zu kriegen.
     *
     * @param tag Ein Wochentag
     * @return Einen String welcher das Wort vom Wochentag beinhaltet
     */
    public static String druckeWochentagCheat(Wochentag tag) {
        System.out.println(tag.toString());
        return tag.toString();
    }
}
