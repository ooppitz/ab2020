package de.die_gfi.philipp.enumexercise;

/**
 * Ein Enum f&uuml;r Wochentage
 */
public enum Wochentag {
    MONTAG,
    DIENSTAG,
    MITTWOCH,
    DONNERSTAG,
    FREITAG,
    SAMSTAG,
    SONNTAG;

    @Override
    public String toString() {
        return super.toString().substring(0,1).toUpperCase() + super.toString().substring(1).toLowerCase();
    }

    /**
     *
     * @param a Numerischer Wert von einem Wochentag, wobei 1 Montag ist und 7 Sonntag
     * @return Wochentag für den gegebenen numerischen Wert
     */
    public static Wochentag valueOf(int a) {
        Wochentag tag;
        switch (a) {
            case 1 -> tag = MONTAG;
            case 2 -> tag = DIENSTAG;
            case 3 -> tag = MITTWOCH;
            case 4 -> tag = DONNERSTAG;
            case 5 -> tag = FREITAG;
            case 6 -> tag = SAMSTAG;
            case 7 -> tag = SONNTAG;
            default -> throw new IllegalArgumentException("No day of the week for the value " + a);
        }
        return tag;
    }

    /**
     *
     * @return Den numerischen Wert von einem Wochentag, -1 falls etwas schief gehen sollte
     */
    public int getNumericValue() {
        int m = -1;
        switch (this) {
            case MONTAG -> m = 1;
            case DIENSTAG -> m = 2;
            case MITTWOCH -> m = 3;
            case DONNERSTAG -> m = 4;
            case FREITAG -> m = 5;
            case SAMSTAG -> m = 6;
            case SONNTAG -> m = 7;
        }
        return m;
    }
}
