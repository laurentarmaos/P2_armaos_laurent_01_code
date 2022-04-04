package com.hemebiotech.analytics;

public interface ISymptomWriter {
	
	/**
	 * Creates a file and writes in it each symptoms and their occurrences
	 * 
	 * @param fileOut path to the file where symptoms and their occurrences will be listed
	 */
	void createFile(String fileOut);

}
