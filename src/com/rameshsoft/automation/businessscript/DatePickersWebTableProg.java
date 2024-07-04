package com.rameshsoft.automation.businessscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.Utilities.DateTimeUtilities;
import com.automation.base.ActionEngine;


public class DatePickersWebTableProg extends ActionEngine{
	@Test

	public void webTables() {
		getDriver().get("https://jqueryui.com/");
		getDriver().findElement(By.linkText("Datepicker")).click();
		
		getDriver().switchTo().frame(0);
		
		getDriver().findElement(By.id("datepicker")).click();
		List <WebElement> list =getDriver().findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		
		String curDate=DateTimeUtilities.getCurrentDate()+"";
		
		for(WebElement webElement:list) {
			String txt= webElement.getText();
			if(txt.equalsIgnoreCase(curDate)) {
				webElement.click();
				break;
			}
		}
		
		
		
		
		
	}

}
