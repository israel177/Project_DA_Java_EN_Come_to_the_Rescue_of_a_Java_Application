package com.hemebiotech.analytics;

import java.util.List;

public class Main {
    // visibilité modificateur type de retoure nom et (paramètre) {implémentation..retour}
    public static void main(String[] args) {
        ISymptomReader fileReader = new ReadSymptomDataFromFile("symptoms.txt");
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        List<String> symptoms;

        // appelle de méthode et affectation du retour
        symptoms = fileReader.getSymptoms();
        analyticsCounter.countSymtpoms(symptoms);
        analyticsCounter.writeResult();
    }
}
