package com.automation.supporters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.automation.customisedExceptions.FrameworkException;

public class ExcelReader {

	private String filePath;
	private FileInputStream fileInputStream;
	private Workbook workbook;
	private Sheet sheet;
	private Row row;
	private Cell cell;
	private String cellValue;

	public ExcelReader(String filePath) throws EncryptedDocumentException, IOException {
		this.filePath=filePath;
		fileInputStream=new FileInputStream(filePath);
		workbook=WorkbookFactory.create(fileInputStream);
	}
	public Sheet getSheetObj(String how,String howValue) throws FrameworkException {
		if(workbook!=null) {
			if(how.equalsIgnoreCase("sheetname")) {
				sheet=workbook.getSheet(howValue);

			}
			else if(how.equalsIgnoreCase("index")) {
				//howvalue=0;
				int index=Integer.parseInt(howValue);
				//index=0
				workbook.getSheetAt(index);

			}
		}
		else {
			//throw the exception
			System.out.println("workbook is pointing to null");
			FrameworkException exception=new FrameworkException("workbook is pointing to null");
			throw exception;

		}
		return sheet;

	}
	public String getCellData(String how,String howValue,int rowNum,int cellNum) throws FrameworkException {
		sheet= getSheetObj(how,howValue);
		if(sheet!=null) {
			row=sheet.getRow(rowNum);	
			if(row!=null) {
				cell=row.getCell(cellNum);
				if(cell!=null) {
					if(cell.getCellType()==CellType.STRING) {
						cellValue=cell.getStringCellValue();
					}
					else if(cell.getCellType()==CellType.NUMERIC) {
						cellValue=cell.getNumericCellValue()+"";
					}
					else if(cell.getCellType()==CellType.BOOLEAN) {
						cellValue=cell.getBooleanCellValue()+"";

					}
				}
				else {
					//throw exception
					System.out.println("cell is pointing to null");
				}
			}
			else {
				//throw exceprion
				System.out.println("row is pointing to null");
			}
		}
		else {
			//throw exceprion
			System.out.println("sheet is pointing to null");
		}
		return cellValue;
	}

	public List getRowData(String how,String howValue,int rowNum) throws FrameworkException {
		List<String> rowData=new ArrayList<String>();
		sheet=getSheetObj(how,howValue);
		row=sheet.getRow(rowNum);
		if(row!=null) {
			for(int i=0;i<=row.getLastCellNum();i++) {
				cell=row.getCell(i);
				if(cell!=null) {
					if(cell.getCellType()==CellType.STRING) {
						cellValue=cell.getStringCellValue();
					}
					else if(cell.getCellType()==CellType.NUMERIC) {
						cellValue=cell.getNumericCellValue()+"";
					}
					else if(cell.getCellType()==CellType.BOOLEAN) {
						cellValue=cell.getBooleanCellValue()+"";
					}
					rowData.add(cellValue);
				}
				else {
					//throw exception
					System.out.println("cell is pointing to null");
				}
			}
		}
		else {
			//throw Exception
			System.out.println("row is pointing to null");
		}
		return rowData;
	}
	public List<String> getSheetData(String how, String howValue) throws FrameworkException {
		List<String> sheetData=new ArrayList<String>();

		sheet=getSheetObj(how,howValue);
		for(int i=0;i<=sheet.getLastRowNum();i++ ) {
			row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				cell=row.getCell(j);
				if(cell!=null) {
					if(cell.getCellType()==CellType.STRING) {
						cellValue=cell.getStringCellValue();
					}
					else if(cell.getCellType()==CellType.NUMERIC) {
						cellValue=cell.getNumericCellValue()+"";

					}
					else if(cell.getCellType()==CellType.BOOLEAN) {
						cellValue=cell.getBooleanCellValue()+"";
					}
					sheetData.add(cellValue);
				}
				else {
					//throw exception
					System.out.println("cell is pointing to null");
				}
			}

		}
		return sheetData;

	}
	public Set getSheetUniqueData(String how,String howValue) throws FrameworkException {
		List<String>list=getSheetData(how,howValue);
		Set<String>set=new HashSet<String>(list);
		return set;
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException, FrameworkException {
		ExcelReader er=new ExcelReader("");
		//er.getSheetObj("sheetname", "Gmail_data");
		er.getSheetObj("index", "0");
	}




























}
