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
        return super.toString().substring(0,1).toUpperCase() + super.toString().substring(1).toLowerCase();
    }
}
