package com.orangehrm.seleniumuiframework_generic_utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
public static ExtentReports extent;
public static void ExtentInstance() {
	if(extent==null) {
		ExtentSparkReporter spark= new ExtentSparkReporter("./Reports/test_result.html");
		//Reporter Configuration
		spark.config().setReportName("OrangeHRM UI Automation Report");
		spark.config().setDocumentTitle("Test Results");
		extent= new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Automation Tester","Betsee Natasha");
		extent.setSystemInfo("UI_Automation_Framework","Selenium+TestNG");
		
	}
}
}
