package com.hemebiotech.analytics;

import java.io.IOException;

public class Launch {

	public static void main(String[] args) throws IOException {
		AnalyticsCounter analyticsCounter = new AnalyticsCounter("Project02Eclipse/symptoms.txt", "result.out");

		analyticsCounter.loadFile();
		analyticsCounter.sortFile();
		analyticsCounter.count();
	}

}
