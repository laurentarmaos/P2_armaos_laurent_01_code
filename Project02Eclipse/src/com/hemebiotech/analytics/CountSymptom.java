package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class CountSymptom {

	private TreeSet<String> tree = new TreeSet<String>();
	private List<String> list = new ArrayList<String>();

	
	/**
	 * 
	 * @param tree listing of all symptoms(no duplicate and sorted alphabetical)
	 * @param list listing of all symptoms (with duplicates)
	 */
	public CountSymptom(TreeSet<String> tree, List<String> list) {
		this.tree = tree;
		this.list = list;
	}

	
	/**
	 * The return value is a list of integers
	 * Counts the occurrences of each symptoms and adds the values in a list
	 * 
	 * @return listing of occurrences of each symptoms
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
