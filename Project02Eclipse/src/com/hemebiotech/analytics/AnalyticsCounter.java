package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
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
	public void writeResult() {
		FileWriter writers = null;
		try {
			writers = new FileWriter("result.out");
			writers.write(symptomsCounter.toString());
		} catch (IOException e) {
		} finally {
			try {
				if (writers != null) {
					writers.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
