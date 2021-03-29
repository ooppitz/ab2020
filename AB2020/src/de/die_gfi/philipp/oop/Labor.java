package de.die_gfi.philipp.oop;

public class Labor {

    void ueberpruefeLaborwerte(Vitaminspiegel laborpatient){
        double laborwertA = laborpatient.getLaborwertVitA();
        double laborwertC = laborpatient.getLaborwertVitC();
        double laborwertD = laborpatient.getLaborwertVitD();
        int alter = laborpatient.getAlter();


        // Vitamin A
        if (laborwertA < 1000) {
            if ((laborwertA < 100 && (alter < 5 || alter > 17)) || (laborwertA < 200 && (alter >= 5 && alter <= 17))) {
                System.out.println("Vitamin A Spiegel: Vitaminmangel");
            }
            if ((laborwertA >= 100 && laborwertA <= 190 && (alter < 5 || alter > 17)) ||
                    (laborwertA >= 200 && laborwertA <= 290 && (alter >= 5 && alter <= 17))){
                System.out.println("Vitamin A Spiegel: niedrig");
            }

            if ((laborwertA > 200 && (alter < 5 || alter > 17)) || (laborwertA > 300 && (alter >= 5 && alter <= 17))) {
                System.out.println("Vitamin A Spiegel: OK");
            }
        } else {
            System.out.println("Vitamin A Spiegel: Überdosis");
        }

        // Vitamin C
        if (laborwertC > 15) {
            System.out.println("Vitamin C Spiegel: Zu hoch");
        } else {
            if (laborwertC <= 15 && laborwertC >= 5) {
                System.out.println("Vitamin C Spiegel: OK");
            } else {
                System.out.println("Vitamin C Spiegel: Zu niedrig");
            }
        }

        // Vitamin D
        if (alter == 0) {
            if (laborwertD < 20) {
                System.out.println("Vitamin D Spiegel: Zu niedrig");
            }
            if (laborwertD >= 20 && laborwertD <= 135) {
                System.out.println("Vitamin D Spiegel: OK");
            }
            if (laborwertD > 135) {
                System.out.println("Vitamin D Spiegel: Zu hoch");
            }
        }
        if (alter > 0 && alter < 18) {
            if (laborwertD < 24) {
                System.out.println("Vitamin D Spiegel: Zu niedrig");
            }
            if (laborwertD >= 24 && laborwertD <= 144) {
                System.out.println("Vitamin D Spiegel: OK");
            }
            if (laborwertD > 144) {
                System.out.println("Vitamin D Spiegel: Zu hoch");
            }
        }
        if (alter >= 18) {
            if (laborwertD < 20) {
                System.out.println("Vitamin D Spiegel: Zu niedrig");
            }
            if (laborwertD >= 20 && laborwertD <= 120) {
                System.out.println("Vitamin D Spiegel: OK");
            }
            if (laborwertD > 120) {
                System.out.println("Vitamin D Spiegel: Zu hoch");
            }
        }
    }



}
