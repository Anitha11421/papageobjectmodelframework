package com.rameshsoft.automation.businessscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.Utilities.PojoReader;
import com.automation.base.BaseTest;
import com.automation.customisedExceptions.FrameworkException;
import com.relevantcodes.extentreports.LogStatus;

public class GmailTest extends BaseTest {
	@Test
	public void gmailTest() throws IOException, EncryptedDocumentException, FrameworkException {
		
//		String cellValue="";
//		FileInputStream fip=new FileInputStream("F:\\march830pmbatch\\pageobjectmodelfw\\src\\com\\automation\\testdata\\Testdata.xlsx");
//		Workbook workbook=WorkbookFactory.create(fip);
//		Sheet sheet=workbook.getSheet("Gmail_data");
//		Row row=sheet.getRow(0);
//		Cell cell=row.getCell(0);
//		if(cell.getCellType()==CellType.STRING) {
//			cellValue=cell.getStringCellValue();
//		}
//		else if(cell.getCellType()==CellType.NUMERIC) {
//			cellValue=cell.getNumericCellValue()+"";
//		}
//		else if(cell.getCellType()==CellType.BOOLEAN) {
//			cellValue=cell.getBooleanCellValue()+"";
//		}
		String cellValue=PojoReader.getExcelReader().getCellData("sheetname","Gmail_data",0,0);//only 1line code
		
		
		
	
//		FileInputStream fip=new FileInputStream("F:\\march830pmbatch\\pageobjectmodelfw\\config.properties");
//		Properties pr=new Properties();
//		pr.load(fip);
//		String url=pr.getProperty("qa_url");
//		getDriver().get(url);
		String url=PojoReader.getConfObj().getValue("qa_url");
		getDriver().get(url);
		
		//getExtentTest().log(LogStatus.PASS, "URL is entered as"+url);
		getExtentTest().log(LogStatus.PASS, "url is entered as :"+url);
		

//		FileInputStream fipOr=new FileInputStream("F:\\march830pmbatch\\pageobjectmodelfw\\src\\com\\automation\\Objectrepo\\or_gmail.properties");
//		Properties pr1=new Properties();
//		pr1.load(fipOr);
//		String unId=pr1.getProperty("un_id");
//		String nxtId=pr1.getProperty("nxt_id");
		String unId=PojoReader.getOrObj().getValue("un_id");
		String nxtId=PojoReader.getOrObj().getValue("nxt_id");


		
		
		
		WebElement un= getDriver().findElement(By.id(unId));
		un.clear();
		getExtentTest().log(LogStatus.PASS, "cleared username field");
		
		//un.sendKeys("anithaa11421@gmail.com");
		un.sendKeys(cellValue);//usingexcel write this line
		getExtentTest().log(LogStatus.PASS, "data typing action is done on username with testdata is:"+cellValue);
		
		
		
		WebElement nxt= getDriver().findElement(By.id(nxtId));
		nxt.click();
		getExtentTest().log(LogStatus.PASS, "clicked on next button");
	}

}
