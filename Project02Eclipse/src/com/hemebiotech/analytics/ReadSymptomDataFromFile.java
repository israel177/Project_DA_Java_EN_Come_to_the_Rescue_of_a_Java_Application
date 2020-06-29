package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		String line = null;

		if (filepath != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(filepath));
				line = reader.readLine();
				while (line != null) {
					System.out.println("symptom from file: " + line);
					result.add(line);
					line = reader.readLine();
				}
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println(e);
				}
			}
		}
		return result;
		}
	}