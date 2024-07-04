package com.rameshsoft.automation.businessscript;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.automation.Utilities.PojoReader;
import com.automation.base.BaseTest;
import com.automation.customisedExceptions.FrameworkException;
import com.relevantcodes.extentreports.LogStatus;

public class InstTest extends BaseTest{
	
   @Test
   
	public void inst() throws IOException, FrameworkException {
	   
//
//		FileInputStream fip=new FileInputStream("F:\\march830pmbatch\\pageobjectmodelfw\\config.properties");
//		Properties pr=new Properties();
//		pr.load(fip);
//		String url=pr.getProperty("inst_url");
//		getDriver().get(url);
//		//getDriver().get("https://www.instagram.com");
		
		String url=PojoReader.getConfObj().getValue("inst_url");
		
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "url is entered as :"+url);

}
}