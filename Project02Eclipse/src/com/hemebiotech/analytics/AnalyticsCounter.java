package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * lit les symptoms conpte les occurence et les renvois dans une treemap
 */
public class AnalyticsCounter {
	TreeMap<String, Integer> symptomsCounter;

	public AnalyticsCounter() {
		this.symptomsCounter = new TreeMap<String, Integer>();
	}

	/**
	 * method countSymptoms elle lit les symtpoms les met dans l'orde alfabetique
	 * et elle compte les occurence
 	 * @param symptoms il donne accéer au symtpoms
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
	 * method writResult ecrit le resulta de la method countSymptoms
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
