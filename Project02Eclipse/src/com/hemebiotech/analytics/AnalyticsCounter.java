package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeSet;

public class AnalyticsCounter {
	
	private String file;
	private String fileout;
	private List<String> list;
	private TreeSet<String> listTree;
	private List<Integer> countSymptoms;
	
	
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


	private void loadFile() {
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(file);
		list = readSymptomDataFromFile.getSymptoms();
	}
	

	private void sortFile() {
			SortSymptomAlphabetical sortSymptomAlphabetical = new SortSymptomAlphabetical(list);
			listTree = sortSymptomAlphabetical.sortSymptoms();
		}
		

	private void count(){
			CountSymptom countSymptom = new CountSymptom(listTree, list);
			countSymptoms = countSymptom.countSymptoms();
		}
	

	private void write(){
		WriteFile writeFile = new WriteFile(listTree, countSymptoms);
		writeFile.createFile(fileout);
	}
}
