package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SortSymptomAlphabetical {

	private List<String> list = new ArrayList<String>();

	public SortSymptomAlphabetical(List<String> list) {
		this.list = list;
	}

	public TreeSet<String> sortSymptoms() {
		
		HashSet<String> sympt = new HashSet<String>();
		
		TreeSet<String> symptoms = new TreeSet<String>(sympt);
		
		for(int i = 0; i < list.size(); i++) {
			symptoms.add(list.get(i));
		}
		
		return symptoms;
	}
}
