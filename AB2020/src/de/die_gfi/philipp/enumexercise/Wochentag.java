package de.die_gfi.philipp.enumexercise;

import java.util.Locale;

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
