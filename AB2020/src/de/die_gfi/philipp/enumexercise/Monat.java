package de.die_gfi.philipp.enumexercise;

/**
 * Ein Enumerator f&uuml;r Monate
 */
public enum Monat {
    JANUAR,
    FEBRUAR,
    MAERZ,
    APRIL,
    MAI,
    JUNI,
    JULI,
    AUGUST,
    SEPTEMBER,
    OKTOBER,
    NOVEMBER,
    DEZEMBER;

    /**
     *
     * @return Ein String mit dem ersten Buchstaben groß, alle anderen Kleinbuchstaben
     */
    @Override
    public String toString() {
        return super.toString().substring(0, 1).toUpperCase() + super.toString().substring(1).toLowerCase();
    }

    /**
     *
     * @param a Monat als Integer von 1 bis 12, wobei 1 Januar ist und 12 Dezember ist
     * @return Eine Konstante von {@link Monat}
     * @throws IllegalArgumentException Wenn ein falscher Wert übergeben wurde, z.B. 13 oder 0
     */
    public static Monat valueOf(int a) {
        Monat m;
        switch (a) {
            case 1 -> m = JANUAR;
            case 2 -> m = FEBRUAR;
            case 3 -> m = MAERZ;
            case 4 -> m = APRIL;
            case 5 -> m = MAI;
            case 6 -> m = JUNI;
            case 7 -> m = JULI;
            case 8 -> m = AUGUST;
            case 9 -> m = SEPTEMBER;
            case 10 -> m = OKTOBER;
            case 11 -> m = NOVEMBER;
            case 12 -> m = DEZEMBER;
            default -> throw new IllegalArgumentException("No month with the given numeric value " + a);
        }
        return m;
    }

    /**
     *
     * @return Numerischen Wert von einem Monat, wobei 1 Januar ist und 12 Dezember ist
     * @throws IllegalArgumentException Falls etwas schief geht (Dieser Fall sollte nie eintreten)
     */
    public int getNumericValue() {
        int m;
        switch (this) {
            case JANUAR -> m = 1;
            case FEBRUAR -> m = 2;
            case MAERZ -> m = 3;
            case APRIL -> m = 4;
            case MAI -> m = 5;
            case JUNI -> m = 6;
            case JULI -> m = 7;
            case AUGUST -> m = 8;
            case SEPTEMBER -> m = 9;
            case OKTOBER -> m = 10;
            case NOVEMBER -> m = 11;
            case DEZEMBER -> m = 12;
            default -> throw new IllegalArgumentException("You should never see this error, so something major has happened.");
        }
        return m;
    }
}
