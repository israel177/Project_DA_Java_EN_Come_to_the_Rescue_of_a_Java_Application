package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * lit les symptoms compte les occurrence et les renvois dans une treemap
 */
public class AnalyticsCounter {
	TreeMap<String, Integer> symptomsCounter;

	public AnalyticsCounter() {
		this.symptomsCounter = new TreeMap<String, Integer>();
	}

	/**
	 * méthode countSymptoms elle lit les symtpoms les met dans l’ordre alphabétique
	 * et elle compte les occurrence
	 * @param symptoms il donne accès au symtpoms
	 */
	public void countSymtpoms(List<String> symptoms) {
		for (String symptom : symptoms) {
			Integer value = symptomsCounter.get(symptom);
			if (value == null)
				value = 0;
			value++;
			symptomsCounter.put(symptom, value);
		}
	}

	/**
	 * méthode writResult écrit le résulta de la méthode countSymptoms
	 */
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
