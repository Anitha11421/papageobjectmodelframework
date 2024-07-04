package com.automation.applcation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.ActionEngine;

public class GmailPwdPage extends ActionEngine {
	
	static {
		PageFactory.initElements(getDriver(), GmailPwdPage.class);
	}

	@FindBy(name="password")
	private static WebElement password;
	
	@FindBy(id="passwordNext")
	private static WebElement signin;
	
	@FindBy(xpath="//button[text()='Forgot password?']")
	private static WebElement frgtPwd;
	
	@FindBy(xpath="//div[text()='Show password']")
	private static WebElement showPwd;
	
	
	public static  void enterPwdTxt(String pwdData) {
		DTA(pwdData,password,"Password");
		
	}
	
	 public static void clickSignInBtn() {
		 clickWebElement(signin, "SignIn");
	}
	 public static void clickFrgtPwdBtn() {
		clickWebElement(frgtPwd, "Forgot password");

	}
	public static void clickShowPwdBtn() {
		clickWebElement(showPwd, "Show Password");
}
	
	
	
	
	
	
	
	
	
	
	
	
}
