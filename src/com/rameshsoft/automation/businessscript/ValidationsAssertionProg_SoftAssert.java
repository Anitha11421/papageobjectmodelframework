package com.rameshsoft.automation.businessscript;

import org.testng.asserts.SoftAssert;

public class ValidationsAssertionProg_SoftAssert {
	public static void main(String[] args) {
		int num1=10,num2=20;

   SoftAssert softAssert=new SoftAssert();//non ststic method we create obj
   System.out.println("1");
   System.out.println("2");
   softAssert.assertEquals(num1,num2);//num1!=num2 eventhouth condition is true here
   System.out.println("3"); 
   System.out.println("4");
   














	}
}	

/* normal prog */
//		int num1=456;
//		int num2=91777;
//		if(num1>num2) {
//			System.out.println("if");
//		}
//		else {
//			System.out.println("else");
//		}

