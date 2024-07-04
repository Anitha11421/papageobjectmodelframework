package com.automation.listners;

import java.io.IOException;

import org.testng.ITestResult;

import com.automation.Utilities.ScreenshotUtility;

public class TCActivityAdopterListner  extends TCActivityListner{
	@Override
	public void onTestSuccess(ITestResult args0) {
		System.out.println("TC is Success:"+args0.getName());

	}

	@Override
	public void onTestFailure(ITestResult args0) {
		System.out.println("TC is failure:"+args0.getName());
		try {
			ScreenshotUtility.takeScreenshot(args0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult args0) {
		System.out.println("TC is Skipped:"+args0.getName());
		try {
			ScreenshotUtility.takeScreenshot(args0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
