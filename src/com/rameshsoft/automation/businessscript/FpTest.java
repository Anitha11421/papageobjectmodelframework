package com.rameshsoft.automation.businessscript;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.Utilities.PojoReader;
import com.automation.base.ActionEngine;
import com.automation.base.BaseTest;
import com.automation.customisedExceptions.FrameworkException;
import com.relevantcodes.extentreports.LogStatus;

public class FpTest extends ActionEngine{

	@Test
	public void fpTest() throws IOException, FrameworkException {
		

//		FileInputStream fip=new FileInputStream("F:\\march830pmbatch\\pageobjectmodelfw\\config.properties");
//		Properties pr=new Properties();
//		pr.load(fip);
//		String url=pr.getProperty("fp_url");
//		getDriver().get(url);
//		//getDriver().get("https://www.flipkart.com");
//		getDriver().findElement(By.id("456")).click();
//		
		
		
		String url=PojoReader.getConfObj().getValue("fp_url");
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "url is entered as :"+url);
		getDriver().findElement(By.id("456")).click();

	}

}
	