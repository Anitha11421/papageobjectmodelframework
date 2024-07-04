package com.automation.customisedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.SheetBuilder;

public class ExceptionsProg2 {
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		
		
		
		
	
		
		/* java1.9versiononwords  resouces outside of the try block*/
		
//		Workbook workbook=WorkbookFactory.create(new FileInputStream("F:\\march830pmbatch\\pageobjectmodelfw\\src\\com\\automation\\testdata\\Testdata.xlsx"));
//		try (workbook){
//			System.out.println("try block");
//
//			
//		}
//		catch(Exception exception) {
//			System.out.println("catch block");
//
//		}
		
		
		/* java 1.7versiononwords resouces in tryblock& multiple catch block*/
		
		try (Workbook workbook=WorkbookFactory.create(new FileInputStream("F:\\march830pmbatch\\pageobjectmodelfw\\src\\com\\automation\\testdata\\Testdata.xlsx"))){
			System.out.println("try block");
			//Sheet sheet=workbook.getSheet("Gmail_data");

			
		}
		catch(Exception exception) {
			System.out.println("catch block");

		}
		
		
		
		
		}
	}





