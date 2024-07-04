package com.rameshsoft.automation.businessscript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.Utilities.PojoReader;
import com.automation.applcation.pageobjects.GmailHomePage;
import com.automation.applcation.pageobjects.GmailPwdPage;
import com.automation.base.ActionEngine;
import com.automation.customisedExceptions.FrameworkException;

public class GmailPomTest extends ActionEngine{
	
@Test
	
public void gmailTest() throws FrameworkException, IOException {
	enterUrl(PojoReader.getConfObj().getValue("qa_url"));
	GmailHomePage.enterUserNameTxt(PojoReader.getExcelReader().getCellData("sheetname","Gmail_data", 0, 0));
    GmailHomePage.clickNxtBtn();
    //GmailPwdPage.enterPwdTxt(PojoReader.getExcelReader().getCellData("index", "0", 0,1));
    //GmailPwdPage.clickSignInBtn();
}
	
	
	
	
	
	
}
