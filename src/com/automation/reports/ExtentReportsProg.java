package com.automation.reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsProg {
	public static void main(String[] args) {
		
		ExtentReports er=new ExtentReports("F:\\march830pmbatch\\pageobjectmodelfw\\Reports\\report.html");
		
        //ExtentTest extentTest=extentReports.startTest("Hardwork");
		ExtentTest extentTest=er.startTest("Hardwork","do hardwork to get job");
		extentTest.log(LogStatus.PASS,"Browser is opened");
		extentTest.log(LogStatus.PASS, "data typing action is done on username with testdata is anithaamala11421@gmail.com");
		extentTest.log(LogStatus.PASS, "click on next button");
		extentTest.log(LogStatus.PASS, "DTA is done on password with testdata is anitha");
		extentTest.log(LogStatus.PASS, "click on signin button");
		
		extentTest.log(LogStatus.PASS, "Browser is closed");
		
		er.flush();
		er.endTest(extentTest);
		
		er.close();
		
	}

}
