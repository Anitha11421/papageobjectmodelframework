package com.rameshsoft.automation.businessscript;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.Utilities.PojoReader;
import com.automation.base.BaseTest;
import com.automation.customisedExceptions.FrameworkException;

public class AmazonTest extends BaseTest {
	@Test
	public void amazonTest() throws IOException, FrameworkException {
		String url=PojoReader.getConfObj().getValue("amazon_url");
		getDriver().get(url);
		WebElement eng=getDriver().findElement(By.xpath("//div[text()='EN']"));
		Actions actions=new Actions(getDriver());
		actions.moveToElement(eng).build().perform();
		String txt=eng.getText();
//		File file=new File("F:\\march830pmbatch\\pageobjectmodelfw\\src\\com\\automation\\supporters\\hardwork.txt");
//		
//		FileWriter fw=new FileWriter(file);
//		BufferedWriter bw= new BufferedWriter(fw);
//		bw.write(txt);
//		
//		bw.flush();
//		fw.close();
//		bw.close();

		PojoReader.getTextReader().writeData(txt);
	}

}
