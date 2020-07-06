package com.hemebiotech.analytics;

import java.util.List;

public class Main {
    // visibiliter modificateur type de retoure nom et (paramettre) {implementation..return}
    public static void main(String[] args) {
        ISymptomReader fileReader = new ReadSymptomDataFromFile("symptoms.txt");
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        List<String> symptoms;

        // appelle de methode et affectation du retour
        symptoms = fileReader.getSymptoms();
        analyticsCounter.countSymtpoms(symptoms);
        analyticsCounter.writeResult();
    }
}
