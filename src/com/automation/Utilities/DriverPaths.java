package com.automation.Utilities;

import com.automation.base.BaseTest;

public interface DriverPaths {
	String chromeKey="webdriver.chrome.driver";
	String chromeValue=BaseTest.getCurDir()+"\\Drivers\\chromedriver.exe";

	String firefoxKey="webdriver.gecko.driver"; 
	String firefoxValue=BaseTest.getCurDir()+"\\Drivers\\geckodriver.exe";

	String operaKey="webdriver.opera.driver"; 
	String operaValue=BaseTest.getCurDir()+"\\Drivers\\operadriver.exe";

	String edgeKey="webdriver.edge.driver"; 
	String edgeValue=BaseTest.getCurDir()+"\\Drivers\\edgedriver.exe";

}
