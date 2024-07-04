package com.rameshsoft.automation.businessscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JsTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\march830pmbatch\\pageobjectmodelfw\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");

		JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;

		WebElement un=driver.findElement(By.id("identifierId"));
		javascriptExecutor.executeScript("arguments[0].value='anithaa11421@gmail.com';", un);

		WebElement nxt=driver.findElement(By.id("identifierNext"));
		javascriptExecutor.executeScript("arguments[0].click();", nxt);
		
		String domainName=javascriptExecutor.executeScript("return document.domain;").toString();
        System.out.println("domainNmae is:"+domainName);

        String url=javascriptExecutor.executeScript("return document.URL").toString();
        System.out.println("Url is:"+url);
        
        String title=javascriptExecutor.executeScript("return document.title;").toString();
        System.out.println("title name is:"+title);
        
        javascriptExecutor.executeScript("window.location='https://www.gmail.com'");
      
        javascriptExecutor.executeScript("window.scrollBy(0,600)");
        
        driver.close();











	}

}
