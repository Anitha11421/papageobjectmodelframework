package com.automation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automation.Utilities.DriverPaths;
import com.automation.Utilities.ScreenshotUtility;
import com.automation.customisedExceptions.FrameworkException;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;




public class BaseTest {

	@Getter private static String curDir;
	@Getter private static WebDriver driver;
	@Getter private static String tcName;
	@Getter private static ExtentReports extentReports;
	@Getter private static ExtentTest extentTest;

	@Parameters({ "browser" })
	@BeforeSuite
	public void openBrowser(@Optional("chrome") String browser) {
		curDir = System.getProperty("user.dir");
		if (browser.equalsIgnoreCase("chrome")) {
//			System.setProperty(DriverPaths.chromeKey, DriverPaths.chromeValue);
//			driver = new ChromeDriver();
			driver=WebDriverManager.chromedriver().create();//using webdriver manager
			init();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
//			System.setProperty(DriverPaths.firefoxKey, DriverPaths.firefoxValue);
//			driver = new FirefoxDriver();
			driver=WebDriverManager.firefoxdriver().create();
			init();
		}

		else if (browser.equalsIgnoreCase("opera")) {
//			System.setProperty(DriverPaths.operaKey, DriverPaths.operaValue);
//			driver = new OperaDriver();
			driver=WebDriverManager.operadriver().create();
			init();

		}

		else if (browser.equalsIgnoreCase("edge")) {
//			System.setProperty(DriverPaths.edgeKey, DriverPaths.edgeValue);
//			driver = new EdgeDriver();
			driver=WebDriverManager.edgedriver().create();
			init();
		}

	}

	private void init() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void closeBrowser() throws FrameworkException {
		if(driver!=null) {
			driver.close();


		}
		else {
			//throw exception     
			System.out.println("driver is pointing to null");
			FrameworkException excetion=new FrameworkException("driver is pointing to null");//we can write after exceptions topic
			throw excetion;
		}
	}
	
	@BeforeTest
	public void initReports() {
		extentReports= new ExtentReports(curDir+"\\Reports\\report.html");

	}
	
	

	@BeforeMethod 
	public void beforeTcExecution(Method method) {
		tcName=method.getName();
		System.out.println("Current TcExecution name is:"+tcName);
		extentTest=extentReports.startTest(tcName);
		extentTest.log(LogStatus.PASS, "Current TcExecution name is:"+tcName);
	}
	
	@AfterTest
	public void closeReports() throws FrameworkException {
		if(extentReports!=null) {
			extentReports.close();
		}
		else {
			FrameworkException exception=new FrameworkException("ExtentReports Pointing to null");
			throw exception;
		}

	}

	@AfterMethod 
	public void afterTcExecution(ITestResult result) throws IOException {
		//System.out.println("TC execution is completed");
		if(result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("Test case is passed:"+result.getName());
			extentTest.log(LogStatus.PASS, "Test case is passed:"+result.getName());
			
		} 
		else if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println("Test case is failed:"+result.getName());
			String imagepath=ScreenshotUtility.takeScreenshot();
			extentTest.log(LogStatus.FAIL, "Test case is Failed:"+result.getName());
			extentTest.log(LogStatus.FAIL, result.getThrowable());
			extentTest.addScreenCapture(imagepath);
			
		} 
		else if(result.getStatus()==ITestResult.SKIP) {
			System.out.println("Test case is skipped:"+result.getName());
			String imagepath=ScreenshotUtility.takeScreenshot();
			extentTest.log(LogStatus.SKIP, "Test case is skiped:"+result.getName());
			extentTest.log(LogStatus.SKIP, result.getThrowable());
			extentTest.addScreenCapture(imagepath);//if we want to screen shot
		}
		extentReports.flush();
		extentReports.endTest(extentTest);
	}

//	public static WebDriver getDriver() {
//
//		return driver;
//	}
//
//	public static String getCurDir() {
//		return curDir;
//	}
//
//	public static String getTcName() {
//		return tcName;
//
//	}
//	public static ExtentTest getExtentTest() {
//		return extentTest;
//	}
	
	
}
