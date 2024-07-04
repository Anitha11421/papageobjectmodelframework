package com.automation.customisedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPrg {
	//	public static void main(String[] args) throws FileNotFoundException  {
	//		
	//		System.out.println("1");
	//		System.out.println("2");
	//	
	//			FileInputStream fip=new FileInputStream("F:\\march830pmbatch\\pageobjectmodelfw\\config.properties");
	//	
	//		System.out.println("3");
	//		System.out.println("4");
	//	}



//	public static void main(String[] args)  {
//		try {
//			System.out.println("1");
//			System.out.println("2");
//
//			FileInputStream fip= new FileInputStream("F:\\march830pmbatch123\\pageobjectmodelfw\\config.properties");//here exception is there
//
//			System.out.println("3");
//			System.out.println("4");		}
//		catch(Exception e){
//			System.out.println("catch block");
//		}
//	} 

	
	
//	public static void main(String[] args)  {
//		try {
//			System.out.println("1");
//			System.out.println("2");
//
//			FileInputStream fip= new FileInputStream("F:\\march830pmbatch123\\pageobjectmodelfw\\config.properties");
//		}//here exception is there
//			catch(Exception exception){
//				System.out.println("catch block");
//				//System.out.println(exception.toString());
//				
//			//System.out.println(exception); both r same
//				//System.out.println(exception.getMessage());
//				exception.printStackTrace(); 
//				
//			}
//			System.out.println("3");
//			System.out.println("4");		
//			}
	
	public static void main(String[] args)  {
		try {
			System.out.println("1");
			System.out.println("2");

			FileInputStream fip= new FileInputStream("F:\\march830pmbatch123\\pageobjectmodelfw\\config.properties");
		}//here exception is there
		
		catch(FileNotFoundException fnfe) {
			System.out.println("fnfe");
		}
			catch(Exception exception){
				System.out.println("catch block");
				//System.out.println(exception.toString());
				
			//System.out.println(exception); both r same
				//System.out.println(exception.getMessage());
				exception.printStackTrace(); 
				
			}
		//catch(FileNotFoundException fnfe) {
		//	syso("fnfe");
		//}
			System.out.println("3");
			System.out.println("4");		
			}
	
	
	
	
		
	} 
	
	
	




