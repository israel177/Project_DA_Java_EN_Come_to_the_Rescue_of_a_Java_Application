package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	TreeMap<String, Integer> symptomsCounter;

	public AnalyticsCounter() {
		this.symptomsCounter = new TreeMap<String, Integer>();
	}

	public void countSymtpoms(List<String> symptoms) {
		for (String symptom : symptoms) {
			Integer value = symptomsCounter.get(symptom);
			if (value == null)
				value = 0;
			value++;
			symptomsCounter.put(symptom, value);
		}
	}

}
