package com.automation.testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelProgram3 {
	
	//how to write the data in excel sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fip=new FileInputStream("F:\\march830pmbatch\\pageobjectmodelfw\\src\\com\\automation\\testdata\\Testdata.xlsx");
		Workbook workbook=WorkbookFactory.create(fip);


		Sheet sheet=workbook.getSheet("Gmail_data");
		
		//sheet.createRow(1); here old row is replace with the new row
		
		Row row1=sheet.getRow(1);
		
		Cell cell12=row1.createCell(2);
		cell12.setCellValue("JAVA");
		
		Row row4=sheet.createRow(4);
		
		Cell cell40=row4.createCell(0);
		cell40.setCellValue("PRACTICE");
		
		Cell cell41=row4.createCell(1);
		cell41.setCellValue("JOB");
		
		Cell cell42=row4.createCell(2);
		cell42.setCellValue("HARDWORK");
		
		Cell cell43=row4.createCell(3);
		cell43.setCellValue("SHYAMSUNDER");
		
		FileOutputStream fop=new FileOutputStream("F:\\march830pmbatch\\pageobjectmodelfw\\src\\com\\automation\\testdata\\Testdata.xlsx");
		workbook.write(fop);
		
		workbook.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int noofsheets=workbook.getNumberOfSheets();
//		System.out.println("no of sheets:    "+noofsheets);
//
//
//		Row row0=sheet.getRow(0);
//		int noofrows=sheet.getLastRowNum();
//		System.out.println("noofrows in the sheet:        "+noofrows);
//
//
//
//		int noofcellsintherow0=row0.getLastCellNum();
//		System.out.println("no of cells in the row:        "+noofcellsintherow0);
//
//		
//		Cell cell00=row0.getCell(0);
//		String row0cell0value = cell00.getStringCellValue();
//		System.out.println("0th row and 0thcell value is:      "+row0cell0value);
//
//		Cell cell01=row0.getCell(1);
//		String row0cell1value=cell01.getStringCellValue();
//		System.out.println("0throw and 1cellvalue is:      "+row0cell1value);
//		
//		
//		Row row1=sheet.getRow(1);
//		Cell cell10=row1.getCell(0);
//		String row1cell0value=cell10.getStringCellValue();
//		System.out.println("1st row 0th cell value:    "+row1cell0value);
//		
//		Cell cell11=row1.getCell(1);
//		String row1cell1value=cell11.getStringCellValue();
//		System.out.println("1row and 1cell value is:   "+row1cell1value);
//		
//		Row row2=sheet.getRow(2);
//		Cell cell20=row1.getCell(0);
//		String row2cell0value=cell20.getStringCellValue();
//		System.out.println("2nd row 0th cell value:    "+row2cell0value);
//		
//		Cell cell21=row2.getCell(1);                                       //here we take integer value getting illegel exception
//		String row2cell1value=cell21.getStringCellValue();                     //java.lang.IllegalStateException
//		System.out.println("2nd row 1st cell value:    "+row2cell1value);
		
		
		
		









	}

}
