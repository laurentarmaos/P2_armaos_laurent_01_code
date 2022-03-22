package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

public class AnalyticsCounter {
	
	private String file;
	private String fileout;
	
	
	public AnalyticsCounter(String file, String fileout) {
		this.file = file;
		this.fileout = fileout;
		loadFile();
		//sortFile();
	}

	// lire le fichier
	public List<String> loadFile() {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(file);
		return readSymptomDataFromFile.getSymptoms();
	}
	
	//crée liste des symptomes et les trier par ordre alphabétique
		public TreeSet<String> sortFile() {
			SortSymptomAlphabetical sortSymptomAlphabetical = new SortSymptomAlphabetical(loadFile());
			return sortSymptomAlphabetical.sortSymptoms();
		}
	
	//compter
		public void count() throws IOException {
			CountSymptom countSymptom = new CountSymptom(sortFile(), loadFile(), fileout);
			countSymptom.countSymptoms();
			
		}
	
	//ecrire le fichier

}
