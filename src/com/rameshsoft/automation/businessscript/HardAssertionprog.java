package com.rameshsoft.automation.businessscript;

import org.testng.Assert;

public class HardAssertionprog {
	public static void main(String[] args) {//here having all static methods
		
		int num1=12,num2=43;
		System.out.println("1");
		System.out.println("2");
		Assert.assertEquals(num1, num2);
		System.out.println("3");
		System.out.println("4");
	}

}
