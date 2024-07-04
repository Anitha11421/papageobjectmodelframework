package com.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.automation.customisedExceptions.FrameworkException;

public class TextReader {
	private String filePath;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private String value;
	
	
	public TextReader(String filePath) throws IOException {
		this.filePath=filePath;
		File file=new File(filePath);
		if(file.createNewFile()) 
			System.out.println("file is created newly");
		else
			System.out.println("Return existing file");
		fileWriter=new FileWriter(filePath);
		bufferedWriter=new BufferedWriter(fileWriter);
		fileReader=new FileReader(filePath);
		bufferedReader=new BufferedReader(fileReader);
			
	}
	public void writeData(String data) throws IOException, FrameworkException {
		if(bufferedWriter!=null) {
			bufferedWriter.write(data);
			bufferedWriter.flush();
			
		}
		else {
			//throw the exception
			System.out.println("bufferedWriter is pointing to null");
			FrameworkException exception=new FrameworkException("bufferedWriter is pointing to null");
			throw exception;
		
		}

	}
	public void writeData(int data) throws IOException {
		if(bufferedWriter!=null) {
			bufferedWriter.write(data);
			bufferedWriter.flush();
			
		}
		else {
			//throw the exception
			System.out.println("bufferedWriter is pointing to null");
		}

	}

	public String getData() throws IOException {
		if(bufferedReader!=null) {
			value=bufferedReader.readLine();
			
		}
		else{
			//throw the exception
			System.out.println("bufferedReader is pointing to null");
		}
		return value;

	}
	public List<String> getTotalData() throws IOException {
		List<String> fileData=new ArrayList<String>();
		
		if(bufferedReader!=null) {
			value=bufferedReader.readLine();
			fileData.add(value);
		}
		else {
			//throw the exception
			System.out.println("bufferedReader is pointing to null");
		}
		return fileData;

	}

}
