package com.hemebiotech.analytics;

public class Launch {

	public static void main(String[] args){
		AnalyticsCounter analyticsCounter = new AnalyticsCounter("Project02Eclipse/symptoms.txt", "result.out");

		analyticsCounter.loadFile();
		analyticsCounter.sortFile();
		analyticsCounter.count();
	}
}
