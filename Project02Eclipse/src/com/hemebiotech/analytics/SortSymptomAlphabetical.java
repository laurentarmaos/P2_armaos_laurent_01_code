package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortSymptomAlphabetical {

	private List<String> list = new ArrayList<String>();

	public SortSymptomAlphabetical(List<String> list) {
		this.list = list;
	}

	/**
	 * 
	 * Création d'un tableau regroupant les différents symptomes,
	 * rangés par ordre alphabétique et sans doublon
	 */
	public TreeSet<String> sortSymptoms() {
		
		TreeSet<String> symptoms = new TreeSet<String>();
		
		for(int i = 0; i < list.size(); i++) {
			symptoms.add(list.get(i));
		}
		
		return symptoms;
	}
}
