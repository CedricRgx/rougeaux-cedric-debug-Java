package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The Main class contains the main method that orders the program (reads
 * symptoms from one file, counts them, sorts them, and writes them to another
 * file)
 * 
 * 
 */
public class Main {

	public static void main(String args[]) {

		final String filepathIn = ".\\Project02Eclipse\\symptoms.txt";
		final String filepathOut = ".\\Project02Eclipse\\result.out.txt";

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filepathIn);
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile(filepathOut);
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();

		List<String> listSymptoms = reader.getSymptoms();

		Map<String, Integer> countedSymptoms = analyticsCounter.countSymptoms(listSymptoms);

		Map<String, Integer> sortedSymptoms = analyticsCounter.sortSymptoms(countedSymptoms);

		writer.writeSymptoms(sortedSymptoms);

	}

}