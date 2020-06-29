package com.hemebiotech.analytics;

public class Main {
    public static void main(String[] args) {
        ISymptomReader fileReader = new ReadSymptomDataFromFile("symptoms.txt");
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();


    }
}
