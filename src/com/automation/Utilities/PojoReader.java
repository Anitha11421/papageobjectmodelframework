package com.automation.Utilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.json.simple.parser.ParseException;

import com.automation.supporters.ExcelReader;
import com.automation.supporters.JsonReader;
import com.automation.supporters.PropertiesReader;
import com.automation.supporters.TextReader;

abstract public class PojoReader {
	public static PropertiesReader getConfObj() throws IOException {
		PropertiesReader prConf=new PropertiesReader(FilePaths.conFilePath);
		return prConf;
	}
	public static PropertiesReader getOrObj() throws IOException {
		PropertiesReader prOr=new PropertiesReader(FilePaths.orFilePath);
		return prOr;
	}
	public static ExcelReader getExcelReader() throws EncryptedDocumentException, IOException {
		ExcelReader excelReader=new ExcelReader(FilePaths.excelFilePath);
		return excelReader;
	
		
	}
	public static TextReader getTextReader() throws IOException {
		TextReader textReader=new TextReader(FilePaths.txtFilePath);
		return textReader;
	
		
	}
	public static JsonReader getJson() throws FileNotFoundException, IOException, ParseException {
		JsonReader jsonReader=new JsonReader(FilePaths.jsonFilePath);
		return jsonReader;
		
	}

}
