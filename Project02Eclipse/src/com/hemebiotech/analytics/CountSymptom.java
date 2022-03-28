package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class CountSymptom {

	private TreeSet<String> tree = new TreeSet<String>();
	private List<String> list = new ArrayList<String>();

	public CountSymptom(TreeSet<String> tree, List<String> list) {
		this.tree = tree;
		this.list = list;
	}

	/**
	 * 
	 * Création d'un  tableau énumérant l'occurence de chaques symptomes listés dans le tableau créé dans le fichier "SortSymptomAlphabetical.java"
	 */
	public List<Integer> countSymptoms(){
		int count = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		
			for(int i = 0; i < tree.size(); i++) {
				count = 0;
				for(int j = 0; j < list.size(); j++) {
					if(tree.toArray()[i].equals(list.get(j))) {
						count++;
					}
				}
				result.add(count);
			}
			return result;
	}
}
