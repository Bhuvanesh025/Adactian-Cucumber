package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue= {"com.stepDefinition"},monochrome=true,dryRun=false,tags= {"@Smoke"})
public class TestRunner {
	
@AfterClass
public static void afterClass() {
	JVMReport.generateReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\cucumber.json");
	
	

}
	
	


}
