package de.die_gfi.philipp.enumexercise;

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
}
