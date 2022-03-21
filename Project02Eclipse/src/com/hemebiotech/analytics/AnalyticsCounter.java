package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.HashSet;
import java.util.TreeSet;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		
		ReadSymptomDataFromFile file = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		
		HashSet<String> sympt = new HashSet<String>();
		
		TreeSet<String> symptoms = new TreeSet<String>(sympt);
		
		for(int i = 0; i<file.GetSymptoms().size(); i++) {
			symptoms.add(file.GetSymptoms().get(i));
		}
			
		Symptom symptom = new Symptom(null, 0);
		FileWriter writer = new FileWriter ("result.out");
		
		for(int i = 0; i < symptoms.size(); i++) {
			symptom.setName((String) symptoms.toArray()[i]);
			int count = 0;
			for(int j = 0; j < file.GetSymptoms().size(); j++) {
				if(symptoms.toArray()[i].equals(file.GetSymptoms().get(j))) {
					count++;
					symptom.setCount(count);
				}
			}	
			writer.write(symptom.getName() + " : " + symptom.getCount()+"\n");	
		}
		writer.close();
	}
}
