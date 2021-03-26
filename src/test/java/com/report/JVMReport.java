package com.report;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateReport(String jsonFile) {
		
   
net.masterthought.cucumber.Configuration c = new net.masterthought.cucumber.Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports"), "Facebook Automatiom");
	
	
	c.addClassifications("Browser", "Edge Driver");
	c.addClassifications("Browser Version", "89");
	c.addClassifications("Sprint", "25");
	c.addClassifications("OS", "Windows8.0");
	
	List<String> jsonFiles = new ArrayList<String>();
	jsonFiles.add(jsonFile);
	
	ReportBuilder builder = new ReportBuilder(jsonFiles, c);
	
	builder.generateReports();
	
	
	
	
	
	
	
	}
	
}
