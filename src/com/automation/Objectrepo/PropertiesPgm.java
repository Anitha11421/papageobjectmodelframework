package com.automation.Objectrepo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPgm {
	public static void main(String[] args) throws IOException {
		//i wnt read the data frm properties file
		
		//FileInputStream fip= new FileInputStream(new File("F:\\march830pmbatch\\pageobjectmodelfw\\config.properties "));
		FileInputStream fip= new FileInputStream(new File("F:\\march830pmbatch\\pageobjectmodelfw\\config.properties"));
	    Properties properties=new Properties();
	    properties.load(fip);
	    
//	    
//	    //how to write the data in properties file
//	    
//	    properties.setProperty("qa_url1", "gmail");
//	    properties.setProperty("qa_url2", "gmail");
//	    properties.setProperty("qa_url3", "gmail");
//	    properties.setProperty("qa_url4", "gmail");
//	    
//	    properties.store(new FileOutputStream("F:\\march830pmbatch\\pageobjectmodelfw\\config.properties"), "file is saved");
//	    
//	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		/*
		 * 
		 * 
		 * 
		 * 
		 * //i wnt read the data frm properties file
		
		 * 
		 * String val1=properties.getProperty("qa_url");
		 * System.out.println("qa_url= "+val1);
		 * 
		 * String val2=properties.getProperty("qa_un");
		 * System.out.println("qa_un= "+val2);
		 * 
		 * String val3=properties.getProperty("qa_pwd");
		 * System.out.println("qa_pwd= "+val3);
		 * 
		 * 
		 * String val4=properties.getProperty("qa_res456");
		 * System.out.println("qa_res= "+val4);
		 * 
		 * String val5=properties.getProperty("qa_res","jobs");
		 * System.out.println("qa_res= "+val5);
		 * 
		 * 
		 * String str=(String) properties.get("qa_un"); 
		 * System.out.println(str);
		 * 
		 */
	  
	
	
	
	
	}

}
