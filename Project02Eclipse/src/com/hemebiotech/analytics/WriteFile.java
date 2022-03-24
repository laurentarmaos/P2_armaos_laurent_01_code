package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile{
	
	private String fileout;
	private FileWriter writer;
	
	public WriteFile(String fileout) {
		this.fileout = fileout;
	}
	
	public void file() {
		try {
			writer = new FileWriter(fileout);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writer(String symptom, int occurrence) {
		try {
			writer.write(symptom + " : " + occurrence + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeWriter() {
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
