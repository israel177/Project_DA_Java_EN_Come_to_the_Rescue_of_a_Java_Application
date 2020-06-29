package com.hemebiotech.analytics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ISymptomReader fileReader = new ReadSymptomDataFromFile("symptoms.txt");
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        List<String> symptoms;
        

    }
}
