package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortSymptomAlphabetical {

	private List<String> list = new ArrayList<String>();

	/**
	 * 
	 * @param list listing of all symptoms (with duplicates)
	 */
	public SortSymptomAlphabetical(List<String> list) {
		this.list = list;
	}

	/**
	 * The return value is a list of strings with no duplication and ordered by name
	 * 
	 * @return listing of all symptoms(no duplicate and alphabetical order)
	 */
	public TreeSet<String> sortSymptoms() {
		TreeSet<String> symptoms = new TreeSet<String>();	
		for(int i = 0; i < list.size(); i++) {
			symptoms.add(list.get(i));
		}	
		return symptoms;
	}
}
