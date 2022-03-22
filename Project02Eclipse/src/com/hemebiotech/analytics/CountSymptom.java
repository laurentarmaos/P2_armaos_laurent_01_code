package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class CountSymptom {

	private TreeSet<String> tree = new TreeSet<String>();
	private List<String> list = new ArrayList<String>();
	private String fileout;

	public CountSymptom(TreeSet<String> tree, List<String> list, String fileout) {
		this.tree = tree;
		this.list = list;
		this.fileout = fileout;
	}

	public void countSymptoms() throws IOException {
		int count = 0;
		FileWriter writer = new FileWriter(fileout);
		Symptom symptom = new Symptom(null, 0);
		
		for(int i = 0; i < tree.size(); i++) {
			symptom.setName((String)tree.toArray()[i]);
			count = 0;
			for(int j = 0; j < list.size(); j++) {
				if(tree.toArray()[i].equals(list.get(j))) {
					count++;
				}
			}
			writer.write(symptom.getName() + " : " + count + "\n");
		}
		writer.close();
	}
}
