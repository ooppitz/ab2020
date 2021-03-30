package de.die_gfi.philipp.oop;

public class MasseProVolumen {
    public static final String MIKROGRAMM = "\u00b5g";
    public static final String MILLIGRAMM = "mg";
    public static final String NANOGRAMM = "ng";
    public static final String GRAMM = "g";

    public static final String LITER = "l";
    public static final String DEZILITER = "dl";
    public static final String CENTILITER = "cl";
    public static final String MILLILITER = "ml";

    /*
    kx  = 10^3  1000
    hx  = 10^2  100
    dax = 10^1  10
    x   = 10^0  1
    dx  = 10^-1 0,1
    cx  = 10^-2 0,01
    mx  = 10^-3 0,001
    μx  = 10^-6 0,000001
    nx  = 10^-9 0,000000001

    g, mg, μg, ng
    l, dl, cl, ml

    Drehpunkt: μg/dl

    g  x10^6        l  x10
    mg x10^3        dl x1
    μg x1           cl x10^-1
    ng x10^-3       ml x10^-2
     */
    double mass;
    String massUnit;
    double volume;
    String volumeUnit;

    double massPerVolume;

    /**
     *
     * @param mass Value of mass
     * @param massUnit Unit of mass
     * @param volume Value of volume
     * @param volumeUnit Unit of volume
     */
    private MasseProVolumen(double mass, String massUnit, double volume, String volumeUnit) {
        this.mass = mass;
        this.massUnit = massUnit;
        this.volume = volume;
        this.volumeUnit = volumeUnit;
        this.massPerVolume = mass / volume;
    }

    /**
     * converts the whole object into the base unit of &mu;g/dl
     */
    public void convertToBaseUnit() {

    }
}
