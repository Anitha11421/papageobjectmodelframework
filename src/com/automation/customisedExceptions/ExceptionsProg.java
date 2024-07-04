package com.automation.customisedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceptionsProg {
	         /* java1.5version onwords we need to close the resources in finally block */  
	
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {

		Workbook workbook=null;
		try {
			System.out.println("try block");

			workbook=WorkbookFactory.create(new FileInputStream("F:\\march830pmbatch123\\pageobjectmodelfw\\src\\com\\automation\\testdata\\Testdata.xlsx"));
		}
		catch(Exception exception) {
			System.out.println("catch block");
			exception.printStackTrace();

		}
		finally {
			System.out.println("finally block");
			if(workbook!=null) {
				workbook.close();

			}
		}
	}




}
