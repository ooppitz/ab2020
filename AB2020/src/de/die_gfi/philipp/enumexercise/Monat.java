package de.die_gfi.philipp.enumexercise;

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

    @Override
    public String toString() {
        return super.toString().substring(0, 1).toUpperCase() + super.toString().substring(1).toLowerCase();
    }

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
            default -> throw new IllegalArgumentException("No month with give numeric value " + a);
        }
        return m;
    }
}
