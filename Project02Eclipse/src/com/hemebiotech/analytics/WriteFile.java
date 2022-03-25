package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class WriteFile implements ISymptomWriter{
	
	private TreeSet<String> tree = new TreeSet<String>();
	private List<Integer> list = new ArrayList<Integer>();
	
	
	public WriteFile(TreeSet<String> tree, List<Integer> list) {
		this.tree = tree;
		this.list = list;
	}


	@Override
	public void createFile(String fileout) {	
	
		try {
			FileWriter writer = new FileWriter(fileout);
			for (int i = 0; i < tree.toArray().length; i++) {
				writer.write((String) tree.toArray()[i] +" : "+ list.get(i)+ "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
