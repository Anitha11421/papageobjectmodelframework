package com.automation.base;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import freemarker.cache.WebappTemplateLoader;
import lombok.NoArgsConstructor;
@NoArgsConstructor
abstract public class ActionEngine extends BaseTest{

	public static void enterUrl(String url) {
		try {
			getDriver().get(url);
			getExtentTest().log(LogStatus.PASS, "url is entered as:"+url);
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "url is not entered as:"+url);

		}
	}

	public static void enterUrl(URL url) {
		try {
			getDriver().navigate().to(url);
			getExtentTest().log(LogStatus.PASS, "url is entered as:"+url);
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "url is not entered as:"+url);

		}
	}
	public static void navigaterUrl(String url) {
		try {
			getDriver().navigate().to(url);
			getExtentTest().log(LogStatus.PASS, "url is entered as:"+url);
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "url is not entered as:"+url);

		}
	}
	public static void DTA(String testData,WebElement webElement,String elementName) {
		try {
			webElement.clear();

			getExtentTest().log(LogStatus.PASS, "Element is cleared:"+elementName);
			webElement.sendKeys(testData);
			getExtentTest().log(LogStatus.PASS, "Data typing Action is done on:"+elementName+"with testData");
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "Element is not cleared:"+elementName);

		}
	}
	public static void DTAJS(String testData,WebElement webElement,String elementName) {
		try {
			webElement.clear();

			getExtentTest().log(LogStatus.PASS, "Element is cleared:"+elementName);
			webElement.sendKeys(testData);
			getExtentTest().log(LogStatus.PASS, "Data typing Action is done on:"+elementName+"with testData");
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "Element is not cleared:"+elementName);

		}
	}
	public static void DTAActions(String testData,WebElement webElement,String elementName) {
		try {
			Actions actions=new Actions(getDriver());
			actions.sendKeys(webElement,testData).build().perform();
			getExtentTest().log(LogStatus.PASS, "Data typing Action is done on:"+elementName+"with testData");
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "Element is not cleared:"+elementName);

		}
	}
	public static void DTAActions1(String testData,WebElement webElement,String elementName) {
		try {
			Actions actions=new Actions(getDriver());
			actions.click(webElement).sendKeys(testData).build().perform();
			getExtentTest().log(LogStatus.PASS, "Data typing Action is done on:"+elementName+"with testData");
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "Element is not cleared:"+elementName);

		}
	}
	public static void DTAActionsRobot(String testData,WebElement webElement,String elementName) {
		try {
			Actions actions=new Actions(getDriver());
			actions.click(webElement).sendKeys(testData).build().perform();
			getExtentTest().log(LogStatus.PASS, "Data typing Action is done on:"+elementName+"with testData");
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "Element is not cleared:"+elementName);

		} //assignment
	}
	public static void clickWebElementJS(WebElement webElement,String elementName) {
		try {
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "click Action done on:"+elementName);
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "click Action not done on:"+elementName);

		} 
	}
	public static void clickWebElement(WebElement webElement,String elementName) {
		try {
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "click Action done on:"+elementName);
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "click Action not done on:"+elementName);

		} 
	}
	public static void clickWebElementActions(WebElement webElement,String elementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			Actions actions=new Actions(getDriver());
			actions.click(webElement).build().perform();
			getExtentTest().log(LogStatus.PASS, "click Action done on:"+elementName);
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "click Action not done on:"+elementName);

		} 
	}
	public static void kbClickWebElementActions(WebElement webElement,String elementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			Actions actions=new Actions(getDriver());
			actions.sendKeys(webElement,Keys.ENTER).build().perform();
			getExtentTest().log(LogStatus.PASS, "click Action done on:"+elementName);
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "click Action not done on:"+elementName);

		} 
	}
	public static void handleDropDown(WebElement webElement,String ddName,String how,String howValue) {
		Select select=new Select(webElement);
		try {
			if(how.equalsIgnoreCase("value")) {
				select.selectByValue(howValue);
				getExtentTest().log(LogStatus.PASS, "DD is selected based on:"+how+"with value"+howValue);
			}
			else if(how.equalsIgnoreCase("text")) {
				select.selectByVisibleText(howValue);
				getExtentTest().log(LogStatus.PASS, "DD is selected based on:"+how+"with value"+howValue);
			}
			else if(how.equalsIgnoreCase("index")) {
				int indx=Integer.parseInt(howValue);
				select.selectByIndex(indx);
				getExtentTest().log(LogStatus.PASS, "DD is selected based on:"+how+"with value"+howValue);
			}
		}
		catch(Exception exception) {

		}
	}
	//switch to the frame
	public static void switchToFrame(String how,String howValue) {
		try {
			if(how.equalsIgnoreCase("index")) {
				int indx=Integer.parseInt(howValue);
				getDriver().switchTo().frame(indx);
				getExtentTest().log(LogStatus.PASS, "switched to frame using:"+how+"with value:"+howValue);
			}
			else if(how.equalsIgnoreCase("frameId")||how.equalsIgnoreCase("frameName")) {
				getDriver().switchTo().frame(howValue);
				getExtentTest().log(LogStatus.PASS, "switched to frame using:"+how+"with value:"+howValue);

			}
			else if(how.equalsIgnoreCase("webelement")) {
				getDriver().switchTo().frame(howValue);
				getExtentTest().log(LogStatus.PASS, "switched to frame using:"+how+"with value:"+howValue);
			}
		}

		catch(Exception exception){

		}
	}
	public static void mouseHoverAction(WebElement webElement,String elementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "element is displayed:"+elementName);
			Actions actions=new Actions(getDriver());
			actions.moveToElement(webElement).build().perform();
			getExtentTest().log(LogStatus.PASS, "mouseHover action is done on element:"+elementName);
		}
		catch(Exception exception) {
			getExtentTest().log(LogStatus.PASS, "element NOT is displayed:"+elementName);
		}

	}
	public static void handleWindows(int index) {
		try {
			Set<String>windows=getDriver().getWindowHandles();
			if(windows.size()>1) {
				List<String>list=new ArrayList<String>(windows);
				String window=list.get(index);
				getDriver().switchTo().window(window);
				getExtentTest().log(LogStatus.PASS, "switched to new window"+window);
			}
			getExtentTest().log(LogStatus.PASS, "less no of windows are::"+windows.size());
		}
		catch(Exception exception) {

		}
	}
	public static void handleWindows() {
		try {
			Set<String>windows=getDriver().getWindowHandles();
			if(windows.size()>1) {
				String curWinName=getDriver().getWindowHandle();
				for(String str:windows) {
					if(str.equalsIgnoreCase(curWinName)) {
						getDriver().switchTo().window(str);
						getExtentTest().log(LogStatus.PASS, "switched to new window:"+str);
					}
				}
			}
			getExtentTest().log(LogStatus.PASS, "less no of windows are::"+windows.size());
		}
		catch(Exception exception) {

		}
	}
	//assignment
	
	//synch
	//dragable
	//drapable
	//element actions
	;;;;;;;;;

}





























































































//String curDir=System.getProperty("user.dir");
//System.out.println(curDir);                     //String curDir =System.getProperty("user.dir");