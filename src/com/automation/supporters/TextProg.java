package com.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextProg {
	public static void main(String[] args) throws IOException {
		File file=new File("F:\\march830pmbatch\\pageobjectmodelfw\\src\\com\\automation\\supporters\\hardwork.txt");
		boolean status=file.createNewFile();
		if(status) {
			System.out.println("file is created");
		}
		else {
			System.out.println("return existing file");
		}
		
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		while(br.ready()) {
			String data=br.readLine();
			System.out.println(data);
			
		}
		fr.close();
		br.close();
		
		
		
		
		
		
		
//		
//		FileWriter fw=new FileWriter(file,true);
//		BufferedWriter bw=new BufferedWriter(fw);
//		
//		bw.write("hello");
//		bw.newLine();
//		bw.write("please");
//		bw.newLine();
//		bw.write("selenium");
//		bw.newLine();
//		bw.write("java");
//		bw.newLine();
//		
//		bw.flush();
//		fw.close();
//		bw.close();
//		
		
		
	}

}
