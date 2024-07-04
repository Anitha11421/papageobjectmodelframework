package com.rameshsoft.automation.businessscript;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class WebDriverManagerProg {
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "F:\\march830pmbatch\\pageobjectmodelfw\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			
			driver.close();
			
	}

}
