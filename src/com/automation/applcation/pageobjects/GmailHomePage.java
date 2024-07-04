package com.automation.applcation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.ActionEngine;
import com.automation.base.BaseTest;

public class GmailHomePage extends ActionEngine{
	static {
		PageFactory.initElements(getDriver(), GmailHomePage.class);
	}
	@FindBy(id="identifierId")
	private static WebElement userName;
	
	@FindBy(id="identifierNext")
	private static WebElement nxt;
	
	@FindBy(xpath="//button[text()='Forgot email?']")
	private static WebElement frgtEmail;
	
	@FindBy(xpath="//span[text()='Create account']")
	private static WebElement createAcc;
	
	@FindBy(xpath="//span[text()='to continue to Gmail']")
	private static WebElement continueToGmail;
	
	@FindBy(xpath="//span[text()='Sin In']")
	private static WebElement signIn;
	
	
	public static  void enterUserNameTxt(String testData) {
		DTA(testData,userName,"UserName");

	}
	 public static void clickNxtBtn() {
		 clickWebElement(nxt, "Next");
	}
	 public static void clickFrgtEmailBtn() {
		clickWebElement(frgtEmail, "Forgot Email");

	}
	public static void clickCreateAccBtn() {
		clickWebElement(createAcc, "Create account");
}
	public static void clickContinueToGmailBtn() {
		clickWebElement(continueToGmail, "continue to Gmail");

	}
	
	
	
	

}
