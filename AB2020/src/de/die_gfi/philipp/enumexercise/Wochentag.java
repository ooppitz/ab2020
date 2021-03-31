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
}
