package de.die_gfi.philipp.oop;

import java.util.ArrayList;

/**
 * Eine Klasse welche einen hypothetischen Patienten darstellt
 *
 * @version 0.1
 * @author Philipp Kumtiz
 */
public class Patient extends Person{
    /**
     * Diagnose von diesem Patienten
     */
    String diagnose;

    /**
     * Symptome von diesem Patienten
     */
    ArrayList<String> symptome;

    /**
     * Nutze diese Konstante um eine unbekannte Diagnose darzustellen
     */
    static final String UNBEKANNTE_DIAGNOSE = "###";

    /**
     *
     * @param vorname Der Vorname vom Patienten
     * @param nachname Der Nachname vom Patienten
     */
    public Patient(String vorname, String nachname) {
        super(vorname, nachname);
    }

    /**
     *
     * @param vorname Der Vorname vom Patienten
     * @param nachname Der nachname vom Patienten
     * @param alter Das Alter vom Patienten
     */
    public Patient(String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
    }

    /**
     *
     * @param vorname Der Vorname vom Patienten
     * @param nachname Der Nachname vom Patienten
     * @param alter Das Alter vom Patienten
     * @param koerpergroesseInCm Die K&ouml;rpergr&ouml;&szlig;e vom Patienten in cm
     * @param gewichtInKg Das Gewicht vom Patienten in kg
     */
    public Patient(String vorname, String nachname, int alter, int koerpergroesseInCm, double gewichtInKg) {
        super(vorname, nachname, alter, koerpergroesseInCm, gewichtInKg);
    }

    /**
     *
     * @param vorname Der Vorname vom Patienten
     * @param nachname Der Nachname vom Patienten
     * @param alter Das Alter vom Patienten
     * @param koerpergroesseInCm Die K&ouml;rpergr&ouml;&szlig;e vom Patienten in cm
     * @param gewichtInKg Das Gewicht vom Patienten in kg
     * @param symptome Eine Liste von festestellten Symptomen
     */
    public Patient(String vorname, String nachname, int alter, int koerpergroesseInCm, double gewichtInKg, ArrayList<String> symptome) {
        super(vorname, nachname, alter, koerpergroesseInCm, gewichtInKg);
        this.symptome = symptome;
    }

    /**
     *
     * @return Die festgestellte Diagnose
     */
    public String getDiagnose() {
        return diagnose;
    }

    /**
     * Setzt das Feld Symtope auf die gegebene Liste
     *
     * @param symptome Eine Liste an Symptomen
     */
    public void setSymptome(ArrayList<String> symptome) {
        this.symptome = symptome;
    }

    /**
     * F&uuml;gt der Liste an Symptomen ein weiteres Symptom hinzu
     *
     * @param symptom Ein festegstelltes Symptom
     */
    public void addSymtop(String symptom) {
        this.symptome.add(symptom);
    }

    /**
     *
     * @return Ein String nur mit den relevanten Daten
     */
    @Override
    public String toString() {
        String str = super.toString();
        str += (diagnose.equals("###")) ? ("Diagnose = " + diagnose + " ") : "";
        return str;
    }
}
