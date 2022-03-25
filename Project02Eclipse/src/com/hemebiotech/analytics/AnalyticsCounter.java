package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeSet;

public class AnalyticsCounter {
	
	private String file;
	private String fileout;
	
	
	public AnalyticsCounter(String file, String fileout){
		this.file = file;
		this.fileout = fileout;
	}
	
	public void launchApp() {
		loadFile();
		sortFile();
		count();
		write();
	}

	// lire le fichier
	private List<String> loadFile() {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(file);
		return readSymptomDataFromFile.getSymptoms();
	}
	
	//crée liste des symptomes et les trier par ordre alphabétique
	private TreeSet<String> sortFile() {
			SortSymptomAlphabetical sortSymptomAlphabetical = new SortSymptomAlphabetical(loadFile());
			return sortSymptomAlphabetical.sortSymptoms();
		}
		
	//compter les occurences de symptomes 
	private List<Integer> count(){
			CountSymptom countSymptom = new CountSymptom(sortFile(), loadFile());
			return countSymptom.countSymptoms();
		}
	
	//ecrire le dans fichier
	private void write(){
		WriteFile writeFile = new WriteFile(sortFile(), count());
		writeFile.createFile(fileout);
//		
//		for (int i = 0; i < sortFile().toArray().length ; i++) {
//			writeFile.writer((String)sortFile().toArray()[i], count().get(i));
//		}
//		
//		writeFile.closeWriter();
	}
}
